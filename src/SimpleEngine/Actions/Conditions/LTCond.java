package SimpleEngine.Actions.Conditions;

import SimpleEngine.Actions.ConditionTest;
import SimpleEngine.GameObject;
import SimpleEngine.GameState;

public class LTCond extends ConditionTest {

    String objID;
    String lhs;
    String rhs;
    boolean bothVars;

    public LTCond(String objID, String lhs, String rhs, boolean bothVars) {
        this.objID = objID;
        this.lhs = lhs;
        this.rhs = rhs;
        this.bothVars = bothVars;
    }

    @Override
    public boolean satisfied() {
        GameObject obj = GameState.getGameObject(objID);
        if (!obj.hasVariable(lhs)) { return false; }
        if (bothVars) {
            if (!obj.hasVariable(rhs)) { return false; }
            rhs = obj.getVariable(rhs);
        }

        String result = obj.getVariable(lhs);
        try {
            Float ans = Float.parseFloat(result);
            Float val = Float.parseFloat(rhs);
            return ans.compareTo(val) < 0;
        } catch (Exception e) {
            try {
                Boolean ans = Boolean.parseBoolean(result);
                Boolean val = Boolean.parseBoolean(rhs);
                return ans.compareTo(val) < 0;
            } catch (Exception e2) {
                return result.compareTo(rhs) < 0;
            }
        }
    }
}
