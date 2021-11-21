package Game;

import SimpleEngine.GameObject;
import SimpleEngine.GameState;

import java.util.List;

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
}
