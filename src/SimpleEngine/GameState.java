package SimpleEngine;

import Game.GameController;
import Logging.DebugLogger;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

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
        if (id != null && id.toUpperCase().equals("HERE")) {
            id = GameController.getPlayer().getLocation().getId();
        }
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
                gameObjects.get(obj.getParent()).addChild(obj.getId(), obj.getParentType());
            }
        }
    }

    // Debugging method to print the game state tree
    public static void printState() {
        DebugLogger logger = DebugLogger.getInstance();
        logger.logLine();
        logger.logRaw("Game State Tree: " + printTreeHelper(gameObjects.get("ROOT")));

        // Print actions
        StringBuilder actionString = new StringBuilder("Actions: ");
        for (String act : actions.keySet()) {
            actionString.append(act + ", ");
        }
        if (actions.keySet().size() > 0) {
            actionString.deleteCharAt(actionString.length()-2);
        }
        logger.logRaw(actionString.toString());

        // Print flags
        StringBuilder flagsString = new StringBuilder("Global Flags: ");
        for (String flag : globalFlags.keySet()) {
            flagsString.append(flag + ", ");
        }
        if (globalFlags.keySet().size() > 0) {
            flagsString.deleteCharAt(flagsString.length()-2);
        }
        logger.logRaw(flagsString.toString());

        logger.logLine();
    }

    private static String printTreeHelper(GameObject obj)  {
        StringBuilder node = new StringBuilder(obj.getId() + "(");
        for (String child : obj.getChildren()) {
            node.append(printTreeHelper(gameObjects.get(child))).append(",");
        }
        if (obj.getChildren().size() > 0) {
            node.deleteCharAt(node.length()-1);
        }
        node.append(")");
        return node.toString();
    }
}
