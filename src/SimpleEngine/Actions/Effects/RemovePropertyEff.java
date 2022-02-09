package SimpleEngine.Actions.Effects;

import Logging.DebugLogger;
import SimpleEngine.Actions.Effect;
import SimpleEngine.GameObject;
import SimpleEngine.GameState;

public class RemovePropertyEff extends Effect {

    String objID;
    String property;

    public RemovePropertyEff(String objID, String property) {
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
        obj.removeProperty(property);
        return true;
    }
}
