package SimpleEngine;

import EnhancedEngine.EnhancedExecuteCommand;
import Game.Direction;
import Game.GameController;
import Game.Main;
import Logging.DebugLogger;
import SimpleEngine.Actions.ConditionTest;
import SimpleEngine.Actions.Conditions.QueryCond;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Set;

public class ExecuteCommand {

    private static DebugLogger logger;
    static { logger = DebugLogger.getInstance(); }

    // Execute the command extracted from the user input
    public static void executeAction() {
        logger.logLine();
        logger.logDebug("PRSA: " + GameController.getPRSA() + ", PRSO: " + (GameController.getPRSO() == null ? "null" : GameController.getPRSO().getId()) + ", PRSI: " + (GameController.getPRSI() == null ? "null" : GameController.getPRSI().getId()));
        logger.logLine();
        if (GameController.getPRSA() == null) {
            System.err.println("I didn't understand that input.");
            return;
        }

        // Handle object conflict
        if (GameController.getPRSA().equals("CONFLICT")) {
            System.err.println("I cannot determine which object you are referencing, please be more specific.");
            return;
        }

        logger.logDebug("ATTEMPT TO PERFORM ACTION ON PRSI");
        if (GameController.getPRSI() != null && GameController.getPRSI().action()) { return; }
        logger.logLine();
        logger.logDebug("FAILED TO PERFORM ACTION ON PRSI");
        logger.logLine();
        logger.logDebug("ATTEMPT TO PERFORM ACTION ON PRSO");
        if (GameController.getPRSO() != null && GameController.getPRSO().action()) { return; }
        logger.logLine();
        logger.logDebug("FAILED TO PERFORM ACTION ON PRSO");
        logger.logLine();
        logger.logDebug("ATTEMPT TO PERFORM GENERIC ACTION ON PRSA");
        if (GameController.getPRSA() != null && decodePRSA()) { return; }
        logger.logLine();
        logger.logDebug("FAILED TO PERFORM GENERIC ACTION USING PRSA");
        logger.logLine();
        logger.logDebug("ATTEMPT TO PERFORM ENHANCED ACTION ON PRSA");
        if (GameController.usingEnhancedEngine() && EnhancedExecuteCommand.decodePRSAEnhanced(getCorrectedVerb())) { return; }
        logger.logLine();
        logger.logDebug("FAILED TO PERFORM ENHANCED ACTION USING PRSA");
        System.err.println("I didn't understand that input.");
    }

    // If the given PRSA is a synonym, get the corresponding action
    private static String getCorrectedVerb() {
        String correctedVerb = GameController.getVerbSynonyms().get(GameController.getPRSA());
        if (correctedVerb == null) { return null; }
        else { return correctedVerb.toLowerCase(); }
    }

    // Decode the given PRSA and call the matching general method
    private static boolean decodePRSA() {
        if (GameController.getPRSA() != null && GameController.getPRSA().equals("QUIT")) {
            return true;
        }

        String correctedVerb = getCorrectedVerb();
        logger.logDebug("Corrected Verb: " + correctedVerb);

        if (!getVerbs().contains(correctedVerb)) { return false; }

        try {
            Class<ExecuteCommand> c = ExecuteCommand.class;
            Method verbAction = c.getDeclaredMethod("cmd_" + correctedVerb.replace(' ', '_'));
            return (boolean)verbAction.invoke(null);
        }
        catch (Exception e) {
            e.printStackTrace(System.err);
            return false;
        }
    }

    // -----------------------------------------------------------------------------------------------
    //                                       COMMANDS
    // -----------------------------------------------------------------------------------------------

    // General action for player movement
    public static boolean cmd_move() {
        // PRSO should be a direction (NORTH/SOUTH/EAST/WEST/UP/DOWN), or a named room
        if (GameController.getPRSO() == null) {
            System.out.println("You try moving your legs, but you don't end up getting anywhere...");
            return true;
        }

        GameRoom currLoc = GameController.getPlayer().getLocation();

        // Room given by cardinal direction
        for (Direction d : Direction.values()) {
            if (GameController.getPRSO().getId().equals(d.name())) {
                GameRoom nextLoc = (GameRoom)GameState.getGameObject(currLoc.getDir(d));
                boolean directionIsHidden = (currLoc.isNhidden() && d.equals(Direction.NORTH)) ||
                        (currLoc.isShidden() && d.equals(Direction.SOUTH)) ||
                        (currLoc.isEhidden() && d.equals(Direction.EAST)) ||
                        (currLoc.isWhidden() && d.equals(Direction.WEST)) ||
                        (currLoc.isUhidden() && d.equals(Direction.UP)) ||
                        (currLoc.isDhidden() && d.equals(Direction.DOWN));

                if (nextLoc == null) { System.out.println("You cannot move " + d.name().toLowerCase() + "."); }
                else {
                    // Check if there are any pre-conditions
                    Set<String> conditions = null;
                    ConditionTest query = null;

                    switch (d) {
                        case NORTH: conditions = currLoc.getNConds(); query = currLoc.getNQuery(); break;
                        case SOUTH: conditions = currLoc.getSConds(); query = currLoc.getSQuery(); break;
                        case EAST: conditions = currLoc.getEConds(); query = currLoc.getEQuery(); break;
                        case WEST: conditions = currLoc.getWConds(); query = currLoc.getWQuery(); break;
                        case UP: conditions = currLoc.getUConds(); query = currLoc.getUQuery(); break;
                        case DOWN: conditions = currLoc.getDConds(); query = currLoc.getDQuery(); break;
                    }

                    // If not all conditions are met, then prevent player from moving
                    if (!GameController.roomConditionsMet(conditions, query)) {
                        if (directionIsHidden) {
                            System.out.println("You cannot move " + d.name().toLowerCase() + ".");
                            return true;
                        }
                        String blockMessage = currLoc.getDirBlockMessage(d);
                        String message = Objects.requireNonNullElseGet(blockMessage, () -> "Something is preventing you from moving " + d.name().toLowerCase() + ".");
                        if (GameController.usingEnhancedEngine() && query != null) {
                            for (String q : ((QueryCond)query).getQueries()) {
                                EnhancedExecuteCommand.addFailedQueryCond(q);
                                EnhancedExecuteCommand.setSkippedFailMessage(message);
                            }
                            return false;
                        }
                        System.out.println(message);
                        return true;
                    }

                    GameController.getPlayer().movePlayer(nextLoc);
                }
                return true;
            }
        }

        // Named room
        if (!(GameController.getPRSO() instanceof GameRoom)) { return false; }
        GameRoom nextLoc = (GameRoom)GameController.getPRSO();

        if (tryMovingToNamedRoom(currLoc, nextLoc, currLoc.getNorth(), currLoc.getNConds(), currLoc.getNQuery(),"north")) { return true; }
        if (tryMovingToNamedRoom(currLoc, nextLoc, currLoc.getSouth(), currLoc.getSConds(), currLoc.getSQuery(), "south")) { return true; }
        if (tryMovingToNamedRoom(currLoc, nextLoc, currLoc.getEast(), currLoc.getEConds(), currLoc.getEQuery(), "east")) { return true; }
        if (tryMovingToNamedRoom(currLoc, nextLoc, currLoc.getWest(), currLoc.getWConds(), currLoc.getWQuery(), "west")) { return true; }
        if (tryMovingToNamedRoom(currLoc, nextLoc, currLoc.getUp(), currLoc.getUConds(), currLoc.getUQuery(), "up")) { return true; }
        return tryMovingToNamedRoom(currLoc, nextLoc, currLoc.getDown(), currLoc.getDConds(), currLoc.getDQuery(), "down");
    }

    // Auxiliary function for moving to a named room (Auxiliary for cmd_move())
    private static boolean tryMovingToNamedRoom(GameRoom currLoc, GameRoom nextLoc, String roomInDir, Set<String> conditions, ConditionTest query, String dir) {
        if (roomInDir != null && GameState.getGameObject(roomInDir).equals(nextLoc)) {
            if (query != null) {
                if (query.satisfied()) {
                    GameController.getPlayer().movePlayer(nextLoc);
                    return true;
                }
                String blockMessage = currLoc.getDirBlockMessage(Direction.valueOf(dir.toUpperCase()));
                System.out.println(Objects.requireNonNullElseGet(blockMessage, () -> "Something is preventing you from moving " + dir + "."));
                return true;
            }
            if (conditions != null && conditions.size() > 0) {
                for (String cond : conditions) {
                    String[] flagValuePair = cond.split("=");
                    if (GameState.getFlag(flagValuePair[0]).getValue() != Integer.parseInt(flagValuePair[1])) {
                        String blockMessage = currLoc.getDirBlockMessage(Direction.valueOf(dir.toUpperCase()));
                        System.out.println(Objects.requireNonNullElseGet(blockMessage, () -> "Something is preventing you from moving " + dir + "."));
                        return true;
                    }
                }
            }
            GameController.getPlayer().movePlayer(nextLoc);
            return true;
        }
        return false;
    }

    // General action for trying to take an object
    public static boolean cmd_take() {
        GameObject obj = GameController.getPRSO();
        // There is no target object
        if (obj == null) {
            System.out.println("You can't try and pick up nothing!");
        }
        // The target object has the takeable flag
        else if (obj.hasProperty("_TAKEABLE")) {
            obj.takeItem();
            obj.setParentType(0);
        }
        // Unable to take the object
        else {
            System.out.println("What do you think you're doing trying to take the " + obj.getName() + "!?");
        }
        return true;
    }

    // General action for trying to place an object
    public static boolean cmd_place() {
        GameObject obj = GameController.getPRSO();
        // There is no target to place
        if (obj == null) {
            System.out.println("What are you trying to place!?");
        }
        // The item is in the player's inventory
        else if (GameState.getGameObject(obj.getParent()).equals(GameController.getPlayer())) {
            obj.placeItem();
            obj.setParentType(0);
        }
        // Unable to place item you do not own
        else {
            System.out.println("You don't currently possess this, so how are you planning on placing that down genius?");
        }
        return true;
    }

    // General action for looking around at the current surroundings
    public static boolean cmd_look_around() {
        GameController.describeLocation();
        return true;
    }

    // General action for looking at an object of interest
    public static boolean cmd_look() {
        GameRoom location = GameController.getPlayer().getLocation();
        // No target object to look at
        if (GameController.getPRSO() == null) {
            //System.out.println("You look at nothing in particular...");
            return false;
        }
        // Looking at player inventory
        else if (GameController.getPRSO().equals(GameController.getPlayer())) {
            GameController.getPlayer().inspectInventory();
        }
        // Look at location to the north
        else if (GameController.getPRSO().equals(GameController.northObj())) {
            GameController.describeNorth(location, true);
        }
        // Look at location to the south
        else if (GameController.getPRSO().equals(GameController.southObj())) {
            GameController.describeSouth(location, true);
        }
        // Look at location to the east
        else if (GameController.getPRSO().equals(GameController.eastObj())) {
            GameController.describeEast(location, true);
        }
        // Look at location to the west
        else if (GameController.getPRSO().equals(GameController.westObj())) {
            GameController.describeWest(location, true);
        }
        // Look at location above
        else if (GameController.getPRSO().equals(GameController.upObj())) {
            GameController.describeUp(location, true);
        }
        // Look at location below
        else if (GameController.getPRSO().equals(GameController.downObj())) {
            GameController.describeDown(location, true);
        }
        // Look at target object
        else {
            GameController.getPRSO().inspectObject();
        }
        return true;
    }

    // General action for opening something (closable container)
    public static boolean cmd_open() {
        if (GameController.getPRSO() == null) {
            return false;
        }
        GameObject obj = GameController.getPRSO();
        if (!obj.hasProperty("_CLOSABLECONTAINER")) {
            System.out.println("The " + obj.getName() + " has no doors or lid, what on earth are you trying to open?!");
            return true;
        }
        if (!Boolean.parseBoolean(obj.getVariable("isClosed"))) {
            if (GameController.getPRSA().contains("LOOK")) {
                lookInsideOnOpen(obj, false);
                return true;
            }
            System.out.println("The " + obj.getName() + " is already open.");
            return true;
        }
        // Check object is not locked
        if (obj.hasProperty("_LOCKED")) {
            System.out.println("The " + obj.getName() + " is locked.");
            return true;
        }
        // Open the object
        obj.setVariable("isClosed", "false");
        EnhancedExecuteCommand.enhanced_cmd_open();
        lookInsideOnOpen(obj, true);
        return true;
    }

    // Auxiliary method for looking inside the newly opened object
    private static void lookInsideOnOpen(GameObject obj, boolean wasOpened) {
        if (wasOpened) {
            System.out.println("You opened the " + obj.getName() + " and peered inside...");
        }
        else {
            System.out.println("You peer inside...");
        }
        if (obj.getInside().size() == 0) {
            System.out.println("... There is nothing inside, except for a spot of dust...");
            return;
        }
        System.out.println("Inside you find:");
        for (String childID : obj.getInside()) {
            System.out.println(" - A " + GameState.getGameObject(childID).getName());
        }
    }

    // General action for closing something (closable container)
    public static boolean cmd_close() {
        if (GameController.getPRSO() == null) {
            return false;
        }
        GameObject obj = GameController.getPRSO();
        if (!obj.hasProperty("_CLOSABLECONTAINER")) {
            System.out.println("The " + obj.getName() + " has no doors or lid, what on earth are you trying to close?!");
            return true;
        }
        if (Boolean.parseBoolean(obj.getVariable("isClosed"))) {
            System.out.println("The " + obj.getName() + " is already closed.");
            return true;
        }
        // Close the object
        obj.setVariable("isClosed", "true");
        EnhancedExecuteCommand.enhanced_cmd_close();
        System.out.println("You closed the " + obj.getName() + ".");
        return true;
    }

    // Return a list of all of the general commands that can be executed in the case of
    private static ArrayList<String> getVerbs() {
        ArrayList<String> verbs = new ArrayList<>();
        Class<ExecuteCommand> execcmd = ExecuteCommand.class;
        for (Method m : execcmd.getMethods()) {
            String name = m.getName();
            if (name.length() > 4 && name.substring(0, 4).equals("cmd_")) {
                verbs.add(name.substring(4).replace('_', ' '));
            }
        }
        return verbs;
    }
}