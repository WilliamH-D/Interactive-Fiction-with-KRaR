package SimpleEngine.Actions.Conditions;

import SimpleEngine.Actions.ConditionTest;
import SimpleEngine.GameObject;
import SimpleEngine.GameState;

public class GTCond extends ConditionTest {

    private String lobjID;
    private String robjID;
    private String lhs;
    private String rhs;
    private boolean bothVars;

    public GTCond(String lobjID, String robjID, String lhs, String rhs, boolean bothVars) {
        this.lobjID = lobjID;
        this.robjID = robjID;
        this.lhs = lhs;
        this.rhs = rhs;
        this.bothVars = bothVars;
    }

    @Override
    public boolean satisfied() {
        GameObject lobj = GameState.getGameObject(lobjID);
        GameObject robj = GameState.getGameObject(robjID);
        if (!lobj.hasVariable(lhs)) { return false; }
        if (bothVars) {
            if (!robj.hasVariable(rhs)) { return false; }
            rhs = robj.getVariable(rhs);
        }

        String result = lobj.getVariable(lhs);
        try {
            // Try floats
            Float ans = Float.parseFloat(result);
            Float val = Float.parseFloat(rhs);
            return ans.compareTo(val) > 0;
        } catch (Exception e) {
            try {
                // Try booleans
                Boolean ans = Boolean.parseBoolean(result);
                Boolean val = Boolean.parseBoolean(rhs);
                return ans.compareTo(val) > 0;
            } catch (Exception e2) {
                // Default
                return result.compareTo(rhs) > 0;
            }
        }
    }
}
