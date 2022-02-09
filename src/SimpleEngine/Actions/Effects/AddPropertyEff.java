package SimpleEngine.Actions.Effects;

import Logging.DebugLogger;
import SimpleEngine.Actions.Effect;
import SimpleEngine.GameObject;
import SimpleEngine.GameState;

public class AddPropertyEff extends Effect {

    String objID;
    String property;

    public AddPropertyEff(String objID, String property) {
        this.objID = objID;
        this.property = property;
    }

    @Override
    protected boolean effectLegalUnderEnhancedConstraints() {
        return false;
    }

    @Override
    public boolean performAction() {
        GameObject obj = GameState.getGameObject(objID);
        if (obj == null) {
            DebugLogger.getInstance().logError(objID + " DOES NOT EXIST!");
            return false;
        }
        obj.setProperty(property);
        return true;
    }
}
