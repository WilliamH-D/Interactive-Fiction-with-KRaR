package ProcessInput;

import Game.Direction;
import Game.GameController;
import Logging.DebugLogger;
import SimpleEngine.GameObject;
import SimpleEngine.GameRoom;
import SimpleEngine.GameState;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Set;

public class ExecuteCommand {

    private static DebugLogger logger;
    static { logger = DebugLogger.getInstance(); }

    // Execute the command extracted from the user input
    public static void executeAction() {
        logger.logLine();
        logger.logDebug("PRSA: " + GameController.getPRSA() + ", PRSO: " + (GameController.getPRSO() == null ? "null" : GameController.getPRSO().getId()) + ", PRSI: " + (GameController.getPRSI() == null ? "null" : GameController.getPRSI().getId()));

        // Handle object conflict
        if (GameController.getPRSA() != null && GameController.getPRSA().equals("CONFLICT")) {
            System.out.println("I cannot determine which object you are referencing, please be more specific.");
            return;
        }

        if (GameController.getPRSI() != null && GameController.getPRSI().action()) { return; }
        if (GameController.getPRSO() != null && GameController.getPRSO().action()) { return; }
        if (GameController.getPRSA() != null && decodePRSA()) { return; }
        System.out.println("I didn't understand that input.");
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
            Class c = ExecuteCommand.class;
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

    public static boolean cmd_attack() {
        System.out.println("You Attacked!");
        return true;
    }

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

                if (nextLoc == null) { System.out.println("You cannot move " + d.name().toLowerCase() + "."); }
                else {
                    // Check if there are any pre-conditions
                    Set<String> conditions = null;

                    switch (d) {
                        case NORTH: conditions = currLoc.getNConds(); break;
                        case SOUTH: conditions = currLoc.getSConds(); break;
                        case EAST: conditions = currLoc.getEConds(); break;
                        case WEST: conditions = currLoc.getWConds(); break;
                        case UP: conditions = currLoc.getUConds(); break;
                        case DOWN: conditions = currLoc.getDConds(); break;
                    }

                    // If not all conditions are met, then prevent player from moving
                    if (conditions != null && conditions.size() > 0) {
                        for (String cond : conditions) {
                            String[] flagValuePair = cond.split("=");
                            if (GameState.getFlag(flagValuePair[0]).getValue() != Integer.parseInt(flagValuePair[1])) {
                                System.out.println("Something is preventing you from moving " + d.name().toLowerCase() + ".");
                                return true;
                            }
                        }
                    }

                    GameController.getPlayer().movePlayer(nextLoc);
                }
                return true;
            }
        }

        // Named room
        if (!(GameController.getPRSO() instanceof GameRoom)) { return false; }
        GameRoom nextLoc = (GameRoom)GameController.getPRSO();

        if (tryMovingToNamedRoom(nextLoc, currLoc.getNorth(), currLoc.getNConds(), "north")) { return true; }
        if (tryMovingToNamedRoom(nextLoc, currLoc.getSouth(), currLoc.getSConds(), "south")) { return true; }
        if (tryMovingToNamedRoom(nextLoc, currLoc.getEast(), currLoc.getEConds(), "east")) { return true; }
        if (tryMovingToNamedRoom(nextLoc, currLoc.getWest(), currLoc.getWConds(), "west")) { return true; }
        if (tryMovingToNamedRoom(nextLoc, currLoc.getUp(), currLoc.getUConds(), "up")) { return true; }
        return tryMovingToNamedRoom(nextLoc, currLoc.getDown(), currLoc.getDConds(), "down");
    }

    // Auxiliary function for moving to a named room (Auxiliary for cmd_move())
    private static boolean tryMovingToNamedRoom(GameRoom nextLoc, String roomInDir, Set<String> conditions, String dir) {
        if (roomInDir != null && GameState.getGameObject(roomInDir).equals(nextLoc)) {
            if (conditions != null && conditions.size() > 0) {
                for (String cond : conditions) {
                    String[] flagValuePair = cond.split("=");
                    if (GameState.getFlag(flagValuePair[0]).getValue() != Integer.parseInt(flagValuePair[1])) {
                        System.out.println("Something is preventing you from moving " + dir + ".");
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
            GameController.describeNorth();
        }
        // Look at location to the south
        else if (GameController.getPRSO().equals(GameController.southObj())) {
            GameController.describeSouth();
        }
        // Look at location to the east
        else if (GameController.getPRSO().equals(GameController.eastObj())) {
            GameController.describeEast();
        }
        // Look at location to the west
        else if (GameController.getPRSO().equals(GameController.westObj())) {
            GameController.describeWest();
        }
        // Look at location above
        else if (GameController.getPRSO().equals(GameController.upObj())) {
            GameController.describeUp();
        }
        // Look at location below
        else if (GameController.getPRSO().equals(GameController.downObj())) {
            GameController.describeDown();
        }
        // Look at target object
        else {
            GameController.getPRSO().inspectObject();
        }
        return true;
    }

    // Return a list of all of the general commands that can be executed in the case of
    private static ArrayList<String> getVerbs() {
        ArrayList<String> verbs = new ArrayList<>();
        Class execcmd = ExecuteCommand.class;
        for (Method m : execcmd.getMethods()) {
            String name = m.getName();
            if (name.length() > 4 && name.substring(0, 4).equals("cmd_")) {
                verbs.add(name.substring(4).replace('_', ' '));
            }
        }
        return verbs;
    }
}