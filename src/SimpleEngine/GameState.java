package SimpleEngine;

import java.util.HashMap;
import java.util.Map;

public class GameState {

    private static Map<String, GameObject> gameObjects = new HashMap<>();
    static {
        gameObjects.put("ROOT", new GameObject("ROOT"));
    }

    private static Map<String, GameFlag> globalFlags = new HashMap<>();

    private static Map<String, GameAction> actions = new HashMap<>();

    public static GameObject getGameObject(String id) {
        return gameObjects.get(id);
    }

    public static void addGameObject(GameObject obj) {
        gameObjects.put(obj.getId(), obj);
    }

    public static GameFlag getFlag(String id) {
        return globalFlags.get(id);
    }

    public static void addFlag(GameFlag flag) {
        globalFlags.put(flag.getId(), flag);
    }

    // TODO: Create action classes
    public static GameAction getAction(String id) {
        return actions.get(id);
    }

    public static void addAction(GameAction action) {
        actions.put(action.getId(), action);
    }

    public static boolean existsAction(String id) {
        return actions.containsKey(id);
    }
}
