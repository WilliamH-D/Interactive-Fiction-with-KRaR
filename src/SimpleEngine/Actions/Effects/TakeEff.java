package SimpleEngine.Actions.Effects;

import EnhancedEngine.KnowledgeBase;
import Game.GameController;
import Logging.DebugLogger;
import SimpleEngine.Actions.Effect;
import SimpleEngine.GameObject;
import SimpleEngine.GameState;

import java.util.logging.Logger;

public class TakeEff extends Effect {

    private String itemID;

    public TakeEff(String itemID) {
        this.itemID = itemID;
    }

    @Override
    public boolean performAction() {
        // Check given itemID is an actual item
        if (GameState.getGameObject(itemID) == null) {
            DebugLogger.getInstance().logError(itemID + " IS NOT A VALID OBJECT!");
            return false;
        }
        GameState.getGameObject(itemID).takeItem();
        return true;
    }
}
