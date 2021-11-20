package ProcessInput;

import Game.Direction;
import Game.GameController;
import SimpleEngine.GameObject;
import SimpleEngine.GameRoom;
import SimpleEngine.GameState;

import java.lang.reflect.Method;
import java.util.ArrayList;

public class ExecuteCommand {

    public static void executeAction() {
        if (GameController.getPRSI() != null && GameController.getPRSI().action()) { return; }
        if (GameController.getPRSO() != null && GameController.getPRSO().action()) { return; }
        if (GameController.getPRSA() != null && decodePRSA()) { return; }
        System.out.println("I didn't understand that input.");
    }

    public static boolean decodePRSA() {
        try {
            Class c = ExecuteCommand.class;
            Method verbAction = c.getDeclaredMethod("cmd_" + GameController.getPRSA().toLowerCase());
            return (boolean)verbAction.invoke(null);
        }
        catch (Exception e) {
            return false;
        }
    }

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
                    GameController.getPlayer().movePlayer(nextLoc);
                    System.out.println("You moved " + d.name().toLowerCase() + " to the " + nextLoc.getId().toLowerCase() + ".");
                }
                return true;
            }
        }

        // Named room
        if (!(GameController.getPRSO() instanceof GameRoom)) { return false; }
        GameRoom nextLoc = (GameRoom)GameController.getPRSO();
        // TODO: This is messy, can I fix it?
        if (currLoc.getNorth().equals(nextLoc)) {
            GameController.getPlayer().movePlayer(nextLoc);
            System.out.println("You moved north to the " + nextLoc.getId().toLowerCase() + ".");
            return true;
        }
        if (currLoc.getSouth().equals(nextLoc)) {
            GameController.getPlayer().movePlayer(nextLoc);
            System.out.println("You moved south to the " + nextLoc.getId().toLowerCase() + ".");
            return true;
        }
        if (currLoc.getEast().equals(nextLoc)) {
            GameController.getPlayer().movePlayer(nextLoc);
            System.out.println("You moved east to the " + nextLoc.getId().toLowerCase() + ".");
            return true;
        }
        if (currLoc.getWest().equals(nextLoc)) {
            GameController.getPlayer().movePlayer(nextLoc);
            System.out.println("You moved west to the " + nextLoc.getId().toLowerCase() + ".");
            return true;
        }
        if (currLoc.getUp().equals(nextLoc)) {
            GameController.getPlayer().movePlayer(nextLoc);
            System.out.println("You moved up to the " + nextLoc.getId().toLowerCase() + ".");
            return true;
        }
        if (currLoc.getDown().equals(nextLoc)) {
            GameController.getPlayer().movePlayer(nextLoc);
            System.out.println("You moved down to the " + nextLoc.getId().toLowerCase() + ".");
            return true;
        }

        return false;
    }

    public static ArrayList<String> getVerbs() {
        ArrayList<String> verbs = new ArrayList<>();
        Class execcmd = ExecuteCommand.class;
        for (Method m : execcmd.getMethods()) {
            String name = m.getName();
            if (name.length() > 4 && name.substring(0, 4).equals("cmd_")) {
                verbs.add(name.substring(4));
            }
        }
        return verbs;
    }
}
