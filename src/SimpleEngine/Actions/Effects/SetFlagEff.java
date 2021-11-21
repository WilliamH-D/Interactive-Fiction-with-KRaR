package SimpleEngine.Actions.Effects;

import SimpleEngine.Actions.Effect;
import SimpleEngine.GameState;

public class SetFlagEff extends Effect {

    private String flagID;
    private int val;

    public SetFlagEff(String flagID, int val) {
        this.flagID = flagID;
        this.val = val;
    }

    @Override
    public boolean performAction() {
        // Check given flagID is an actual flag
        if (!(GameState.getFlag(flagID) == null)) {
            System.err.println(flagID + " IS NOT A VALID FLAG!");
            return false;
        }
        GameState.getFlag(flagID).set(val);
        return true;
    }
}
