package SimpleEngine.Actions.Effects;

import EnhancedEngine.KnowledgeBase;
import Game.GameController;
import Logging.DebugLogger;
import SimpleEngine.Actions.Effect;
import SimpleEngine.GameState;

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

        if (!effectLegalUnderEnhancedConstraints()) {
            return false;
        }

        GameState.getGameObject(itemID).takeItem();
        return true;
    }

    @Override
    protected boolean effectLegalUnderEnhancedConstraints() {
        KnowledgeBase kb = KnowledgeBase.getInstance();
        if (kb.query("isLocated(X," + itemID.toLowerCase() + ",1)").size() > 0) {
            System.out.println("The " + GameState.getGameObject(itemID).getName() + " has stuff on top of it, you're unable to take it without removing them first!");
            return false;
        }
        return true;
    }
}
