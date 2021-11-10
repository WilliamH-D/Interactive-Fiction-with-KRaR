package ProcessInput;

import Game.Direction;
import Game.GameController;
import SimpleEngine.GameObject;
import SimpleEngine.GameRoom;

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
        System.out.println("Decoding PRSA: " + GameController.getPRSA());
        if (GameController.getPRSA().equals("ATTACK")) { return cmd_attack(); }
        if (GameController.getPRSA().equals("MOVE")) { return cmd_move(); }
        return false;
    }

    public static boolean cmd_attack() {
        return false;
    }

    public static boolean cmd_move() {
        // PRSO should be a direction (NORTH/SOUTH/EAST/WEST/UP/DOWN), or a named room
        GameRoom currLoc = GameController.getPlayer().getLocation();
        for (Direction d : Direction.values()) {
            if (GameController.getPRSO().getId().equals(d.name())) {
                // Cardinal direction

                // This is only for testing purposes whilst player loc has not been set TODO: remove
                GameRoom nextLoc = null;
                if (currLoc != null) { nextLoc = currLoc.getDir(d); }


                if (nextLoc == null) { System.out.println("You cannot move " + d.name().toLowerCase() + "."); }
                else {
                    GameController.getPlayer().movePlayer(nextLoc);
                    System.out.println("You moved " + d.name().toLowerCase() + " to the " + nextLoc.getId().toLowerCase() + ".");
                }
                return true;
            }
        }

        // Named room

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
