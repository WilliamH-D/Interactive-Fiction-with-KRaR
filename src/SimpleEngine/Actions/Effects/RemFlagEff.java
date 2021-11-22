package SimpleEngine.Actions.Effects;

import SimpleEngine.Actions.Effect;
import SimpleEngine.GameState;

public class RemFlagEff extends Effect {

    private String flagID;

    public RemFlagEff(String flagID) {
        this.flagID = flagID;
    }

    @Override
    public boolean performAction() {
        // Check given flagID is an actual flag
        if (GameState.getFlag(flagID) == null) {
            System.err.println(flagID + " IS NOT A VALID FLAG!");
            return false;
        }
        GameState.getFlag(flagID).unset();
        return true;
    }
}
