package SimpleEngine.Actions.Effects;

import SimpleEngine.Actions.Effect;
import SimpleEngine.GameState;

public class SetVarEff extends Effect {

    private String objID;
    private String variable;
    private String value;

    public SetVarEff(String objID, String variable, String value) {
        this.objID = objID;
        this.variable = variable;
        this.value = value;
    }

    @Override
    public boolean performAction() {
        // Check that this object has the attribute
        if (GameState.getGameObject(objID) == null || !GameState.getGameObject(objID).hasVariable(variable)) {
            System.err.println(objID + " DOES NOT HAVE THE VARIABLE " + variable + "!");
            return false;
        }
        GameState.getGameObject(objID).setVariable(variable, value);
        return true;
    }

    @Override
    protected boolean effectLegalUnderEnhancedConstraints() {
        return false;
    }
}
