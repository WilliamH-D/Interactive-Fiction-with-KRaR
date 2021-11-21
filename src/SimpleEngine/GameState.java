package SimpleEngine;

import java.util.HashMap;
import java.util.Map;

public class GameState {

    // Tree of game objects. Objects can be looked up by their IDs
    private static Map<String, GameObject> gameObjects = new HashMap<>();
    static {
        // Instantiate the root of the state tree
        gameObjects.put("ROOT", new GameObject("ROOT"));
    }

    // Map of global flags that can be set on or off (Different to the bit flags on objects)
    private static Map<String, GameFlag> globalFlags = new HashMap<>();

    // Map of actions. Action is associated with the game object ID (key)
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


    // To be called once input file has been fully parsed - sets the children for each game object
    public static void setChildren() {
        for (GameObject obj : gameObjects.values()) {
            if (obj.getParent() != null) {
                gameObjects.get(obj.getParent()).addChild(obj.getId());
            }
        }
    }
}
