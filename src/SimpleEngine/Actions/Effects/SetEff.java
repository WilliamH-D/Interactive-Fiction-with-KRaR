package SimpleEngine.Actions.Effects;

import SimpleEngine.Actions.Effect;
import SimpleEngine.GameState;

public class SetEff extends Effect {

    private String objID;
    private String variable;
    private String value;

    public SetEff(String objID, String variable, String value) {
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
}
