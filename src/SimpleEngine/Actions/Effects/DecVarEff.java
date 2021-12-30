package SimpleEngine.Actions.Effects;

import Logging.DebugLogger;
import SimpleEngine.Actions.Effect;
import SimpleEngine.GameObject;
import SimpleEngine.GameState;

public class DecVarEff extends Effect {

    private String objID;
    private String variable;
    private float value;

    public DecVarEff(String objID, String variable, float value) {
        this.objID = objID;
        this.variable = variable;
        this.value = value;
    }

    @Override
    public boolean performAction() {
        GameObject obj = GameState.getGameObject(objID);
        // Check that this object has the attribute
        if (obj == null || !obj.hasVariable(variable)) {
            DebugLogger.getInstance().logError(objID + " DOES NOT HAVE THE VARIABLE " + variable + "!");
            return false;
        }
        float val = 0;
        try {
            val = Float.parseFloat(obj.getVariable(variable));
        }
        catch (Exception e) {
            DebugLogger.getInstance().logError(objID + "'S VARIABLE' " + variable + " IS NOT A NUMBER!");
            return false;
        }

        obj.setVariable(variable, String.valueOf(val - value));
        return true;
    }

    @Override
    protected boolean effectLegalUnderEnhancedConstraints() {
        return false;
    }
}
