package Game;

import SimpleEngine.GameObject;
import SimpleEngine.GameRoom;
import SimpleEngine.GameState;

import java.util.List;
import java.util.Stack;

public class GameController {
    private static GameController GC;

    private Player player;
    private GameObject map;

    private GameObject PRSO;
    private GameObject PRSI;
    private String PRSA;
    private List<String> lemmas;

    private GameObject north;
    private GameObject south;
    private GameObject east;
    private GameObject west;
    private GameObject up;
    private GameObject down;

    private GameController() {
        this.player = new Player();
        GameState.addGameObject(this.player);
        this.north = new GameObject("NORTH");
        this.south = new GameObject("SOUTH");
        this.east = new GameObject("EAST");
        this.west = new GameObject("WEST");
        this.up = new GameObject("UP");
        this.down = new GameObject("DOWN");
    }

    public static GameController instantiateGameController() {
        if (GC == null) { GC = new GameController(); }
        return GC;
    }

    public static GameObject getPRSO() { return GC.PRSO; }
    public static GameObject getPRSI() { return GC.PRSI; }
    public static String getPRSA() { return GC.PRSA; }
    public static List<String> getLemmas() { return GC.lemmas; }

    public static void setPRSO(GameObject o) { GC.PRSO = o; }
    public static void setPRSI(GameObject o) { GC.PRSI = o; }
    public static void setPRSA(String s) {
        if (s == null) { GC.PRSA = null; }
        else { GC.PRSA = s.toUpperCase(); }
    }
    public static void setLemmas(List<String> lemmas) { GC.lemmas = lemmas; }

    public static GameObject getMap() { return GC.map; }
    public static void setMap(GameObject map) { GC.map = map; }
    public static Player getPlayer() { return GC.player; }

    public static GameObject northObj() { return GC.north; }
    public static GameObject southObj() { return GC.south; }
    public static GameObject eastObj() { return GC.east; }
    public static GameObject westObj() { return GC.west; }
    public static GameObject upObj() { return GC.up; }
    public static GameObject downObj() { return GC.down; }

    public static void describeLocation() {
        GameRoom location = GameController.getPlayer().getLocation();
        System.out.println("You find yourself in the " + location.getName() + ".");
        System.out.println(GameController.getPlayer().getLocation().getDesc());

        System.out.println();

        if (location.getNorth() != null) {
            System.out.println("To the north is a " + GameState.getGameObject(location.getNorth()).getName() + ".");
        }
        if (location.getEast() != null) {
            System.out.println("To the east is a " + GameState.getGameObject(location.getEast()).getName() + ".");
        }
        if (location.getSouth() != null) {
            System.out.println("To the south is a " + GameState.getGameObject(location.getSouth()).getName() + ".");
        }
        if (location.getWest() != null) {
            System.out.println("To the west is a " + GameState.getGameObject(location.getWest()).getName() + ".");
        }
        if (location.getUp() != null) {
            System.out.println("Above you is a " + GameState.getGameObject(location.getUp()).getName() + ".");
        }
        if (location.getDown() != null) {
            System.out.println("Below is a " + GameState.getGameObject(location.getDown()).getName() + ".");
        }


        // Class for pairing up parents and children in the search stack
        class ParentChildPair {
            private GameObject parent;
            private GameObject child;

            public ParentChildPair(GameObject parent, GameObject child) {
                this.parent = parent;
                this.child = child;
            }
        }

        // Depth first search on objects in the scene
        Stack<ParentChildPair> stack = new Stack<>();
        stack.push(new ParentChildPair(null, location));

        boolean printedGap = false;

        while (!stack.empty()) {
            ParentChildPair pair = stack.pop();
            if (!pair.child.equals(location) && !pair.child.equals(GameController.getPlayer())) {
                if (!pair.child.hasFlag("_HIDE")) {
                    if (pair.child.hasFlag("_SURFACE")) {
                        if (!printedGap) {
                            System.out.println();
                            printedGap = true;
                        }
                        System.out.println("A " + pair.child.getName() + " is on the " + pair.parent.getName() + ".");
                    }
                    else {
                        if (!printedGap) {
                            System.out.println();
                            printedGap = true;
                        }
                        System.out.println("A " + pair.child.getName() + " is in the " + pair.parent.getName() + ".");
                    }
                }
            }
            if (!pair.child.equals(GameController.getPlayer())) {
                for (String childID : pair.child.getChildren()) {
                    GameObject child = GameState.getGameObject(childID);
                    stack.push(new ParentChildPair(pair.child, child));
                }
            }
        }
    }
}
