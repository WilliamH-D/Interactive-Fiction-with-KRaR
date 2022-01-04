package SimpleEngine.Actions.Effects;

import EnhancedEngine.KnowledgeBase;
import Game.GameController;
import Game.Main;
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

           if (GameController.usingEnhancedEngine() && !effectLegalUnderEnhancedConstraints()) { return false; }

            GameState.getGameObject(itemID).placeItem(GameState.getGameObject(locID), parentType, true);
        }
        else {
            // Place item in location
            GameState.getGameObject(itemID).placeItem(true);
        }
        return true;
    }

    @Override
    protected boolean effectLegalUnderEnhancedConstraints() {
        KnowledgeBase kb = KnowledgeBase.getInstance();
        if (kb.query("isRoom(" + locID.toLowerCase() + ")").size() > 0) {
            return true;
        }
        boolean legal;
        switch (parentType) {
            case 0: legal = kb.query("putInIgnoreScope(" + itemID.toLowerCase() + "," + locID.toLowerCase() + ")").size() > 0; break;
            case 1: legal = kb.query("putOnIgnoreScope(" + itemID.toLowerCase() + "," + locID.toLowerCase() + ")").size() > 0; break;
            case 2: legal = kb.query("putBelowIgnoreScope(" + itemID.toLowerCase() + "," + locID.toLowerCase() + ")").size() > 0; break;
            default: legal = false;
        }
        if (!legal) {
            switch (parentType) {
                case 0: System.out.println("There is not enough space in the " + GameState.getGameObject(locID).getName() + " for the " + GameState.getGameObject(itemID).getName() + "."); break;
                case 1: System.out.println("There is not enough space on the " + GameState.getGameObject(locID).getName() + " for the " + GameState.getGameObject(itemID).getName() + "."); break;
                case 2: System.out.println("There is not enough space under the " + GameState.getGameObject(locID).getName() + " for the " + GameState.getGameObject(itemID).getName() + "."); break;
            }
        }
        return legal;
    }
}
