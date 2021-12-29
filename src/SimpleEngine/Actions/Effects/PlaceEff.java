package SimpleEngine.Actions.Effects;

import EnhancedEngine.KnowledgeBase;
import Game.GameController;
import Logging.DebugLogger;
import SimpleEngine.Actions.Effect;
import SimpleEngine.GameObject;
import SimpleEngine.GameState;

public class PlaceEff extends Effect {

    private String itemID;
    private String locID;
    private int parentType;
    private DebugLogger logger = DebugLogger.getInstance();

    public PlaceEff(String itemID, String locID, int parentType) {
        this.itemID = itemID;
        this.locID = locID;
        this.parentType = parentType;
    }

    @Override
    public boolean performAction() {
        // Check given itemID is an actual item
        if (GameState.getGameObject(itemID) == null) {
            logger.logError(itemID + " IS NOT A VALID OBJECT!");
            return false;
        }
        if (!locID.toUpperCase().equals("HERE")) {
            // Check given location exists
            if (GameState.getGameObject(locID) == null) {
                logger.logError(locID + " IS NOT A VALID LOCATION!");
                return false;
            }

            GameState.getGameObject(itemID).placeItem(GameState.getGameObject(locID), parentType, true);
        }
        else {
            // Place item in location
            GameState.getGameObject(itemID).placeItem(true);
        }
        return true;
    }
}
