package SimpleEngine.Actions.Effects;

import Game.GameController;
import SimpleEngine.Actions.Effect;
import SimpleEngine.GameObject;
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
            System.err.println(itemID + " IS NOT A VALID OBJECT!");
            return false;
        }
        GameState.getGameObject(itemID).takeItem();
        return true;
    }
}
