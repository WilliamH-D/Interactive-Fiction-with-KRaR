package ProcessInput;

import Game.Direction;
import Game.GameController;
import SimpleEngine.GameRoom;
import SimpleEngine.GameState;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Set;

public class ExecuteCommand {

    public static void executeAction() {
        //System.out.println("PRSA: " + GameController.getPRSA() + ", PRSO: " + (GameController.getPRSO() == null ? "null" : GameController.getPRSO().getId()) + ", PRSI: " + (GameController.getPRSI() == null ? "null" : GameController.getPRSI().getId()));

        if (GameController.getPRSI() != null && GameController.getPRSI().action()) { return; }
        if (GameController.getPRSO() != null && GameController.getPRSO().action()) { return; }
        if (GameController.getPRSA() != null && decodePRSA()) { return; }
        System.out.println("I didn't understand that input.");
    }

    private static String getCorrectedVerb() {
        String correctedVerb = GameController.getVerbSynonyms().get(GameController.getPRSA());
        if (correctedVerb == null) { return null; }
        else { return correctedVerb.toLowerCase(); }
    }

    private static boolean decodePRSA() {
        String correctedVerb = getCorrectedVerb();

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



    public static boolean cmd_move() {
        // PRSO should be a direction (NORTH/SOUTH/EAST/WEST/UP/DOWN), or a named room
        if (GameController.getPRSO() == null) {
            System.out.println("You try moving your legs, but you don't end up getting anywhere...");
            return true;
        }

        GameRoom currLoc = GameController.getPlayer().getLocation();

        for (Direction d : Direction.values()) {
            if (GameController.getPRSO().getId().equals(d.name())) {
                // Cardinal direction

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
                    //System.out.println("You moved " + d.name().toLowerCase() + " to the " + nextLoc.getName() + ".");
                }
                return true;
            }
        }

        // Named room
        if (!(GameController.getPRSO() instanceof GameRoom)) { return false; }
        GameRoom nextLoc = (GameRoom)GameController.getPRSO();
        // TODO: This is messy, can I fix it?
        if (currLoc.getNorth() != null && GameState.getGameObject(currLoc.getNorth()).equals(nextLoc)) {
            Set<String> conditions = currLoc.getNConds();
            if (conditions != null && conditions.size() > 0) {
                for (String cond : conditions) {
                    String[] flagValuePair = cond.split("=");
                    if (GameState.getFlag(flagValuePair[0]).getValue() != Integer.parseInt(flagValuePair[1])) {
                        System.out.println("Something is preventing you from moving north.");
                        return true;
                    }
                }
            }
            GameController.getPlayer().movePlayer(nextLoc);
            return true;
        }
        if (currLoc.getSouth() != null && GameState.getGameObject(currLoc.getSouth()).equals(nextLoc)) {
            Set<String> conditions = currLoc.getSConds();
            if (conditions != null && conditions.size() > 0) {
                for (String cond : conditions) {
                    String[] flagValuePair = cond.split("=");
                    if (GameState.getFlag(flagValuePair[0]).getValue() != Integer.parseInt(flagValuePair[1])) {
                        System.out.println("Something is preventing you from moving south.");
                        return true;
                    }
                }
            }
            GameController.getPlayer().movePlayer(nextLoc);
            return true;
        }
        if (currLoc.getEast() != null && GameState.getGameObject(currLoc.getEast()).equals(nextLoc)) {
            Set<String> conditions = currLoc.getEConds();
            if (conditions != null && conditions.size() > 0) {
                for (String cond : conditions) {
                    String[] flagValuePair = cond.split("=");
                    if (GameState.getFlag(flagValuePair[0]).getValue() != Integer.parseInt(flagValuePair[1])) {
                        System.out.println("Something is preventing you from moving east.");
                        return true;
                    }
                }
            }
            GameController.getPlayer().movePlayer(nextLoc);
            return true;
        }
        if (currLoc.getWest() != null && GameState.getGameObject(currLoc.getWest()).equals(nextLoc)) {
            Set<String> conditions = currLoc.getWConds();
            if (conditions != null && conditions.size() > 0) {
                for (String cond : conditions) {
                    String[] flagValuePair = cond.split("=");
                    if (GameState.getFlag(flagValuePair[0]).getValue() != Integer.parseInt(flagValuePair[1])) {
                        System.out.println("Something is preventing you from moving west.");
                        return true;
                    }
                }
            }
            GameController.getPlayer().movePlayer(nextLoc);
            return true;
        }
        if (currLoc.getUp() != null && GameState.getGameObject(currLoc.getUp()).equals(nextLoc)) {
            Set<String> conditions = currLoc.getUConds();
            if (conditions != null && conditions.size() > 0) {
                for (String cond : conditions) {
                    String[] flagValuePair = cond.split("=");
                    if (GameState.getFlag(flagValuePair[0]).getValue() != Integer.parseInt(flagValuePair[1])) {
                        System.out.println("Something is preventing you from moving up.");
                        return true;
                    }
                }
            }
            GameController.getPlayer().movePlayer(nextLoc);
            return true;
        }
        if (currLoc.getDown() != null && GameState.getGameObject(currLoc.getDown()).equals(nextLoc)) {
            Set<String> conditions = currLoc.getDConds();
            if (conditions != null && conditions.size() > 0) {
                for (String cond : conditions) {
                    String[] flagValuePair = cond.split("=");
                    if (GameState.getFlag(flagValuePair[0]).getValue() != Integer.parseInt(flagValuePair[1])) {
                        System.out.println("Something is preventing you from moving down.");
                        return true;
                    }
                }
            }
            GameController.getPlayer().movePlayer(nextLoc);
            return true;
        }

        return false;
    }


    public static boolean cmd_take() {
        System.out.println("You can't try and pick up nothing!");
        return true;
    }


    public static boolean cmd_place() {
        System.out.println("What are you trying to place?!");
        return true;
    }

    public static boolean cmd_look_around() {
        GameController.describeLocation();
        return true;
    }

    public static boolean cmd_look() {
        System.out.println("You look at nothing in particular...");
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
