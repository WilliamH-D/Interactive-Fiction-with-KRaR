package SimpleEngine.Actions.Effects;

import Game.GameController;
import SimpleEngine.Actions.Effect;
import SimpleEngine.GameRoom;
import SimpleEngine.GameState;

public class GotoEff extends Effect {

    private String locID;

    public GotoEff(String locID) {
        this.locID = locID;
    }

    @Override
    public boolean performAction() {
        // Check that loc is valid
        if (!(GameState.getGameObject(locID) instanceof GameRoom)) {
            System.err.println(locID + " IS NOT A VALID LOCATION TO TELEPORT TOO!");
            return false;
        }
        GameController.getPlayer().movePlayer((GameRoom)GameState.getGameObject(locID));
        return true;
    }

    @Override
    protected boolean effectLegalUnderEnhancedConstraints() {
        return false;
    }
}
