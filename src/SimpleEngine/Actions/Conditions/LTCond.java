package SimpleEngine.Actions.Conditions;

import Logging.DebugLogger;
import SimpleEngine.Actions.ConditionTest;
import SimpleEngine.GameObject;
import SimpleEngine.GameState;

public class LTCond extends ConditionTest {

    private String lobjID;
    private String robjID;
    private String lhs;
    private String rhs;
    private boolean bothVars;

    public LTCond(String lobjID, String robjID, String lhs, String rhs, boolean bothVars) {
        this.lobjID = lobjID;
        this.robjID = robjID;
        this.lhs = lhs;
        this.rhs = rhs;
        this.bothVars = bothVars;
    }

    @Override
    public boolean satisfied() {
        logger.logDebug("Checking LTCond: Check that " + lobjID + "::" + lhs + " < " + robjID + "::" + rhs);
        GameObject lobj = GameState.getGameObject(lobjID);
        GameObject robj = GameState.getGameObject(robjID);
        if (!lobj.hasVariable(lhs)) {
            logger.logDebug("LTCond not satisfied since " + lobjID + " does not have variable " + lhs);
            return false;
        }
        if (bothVars) {
            if (!robj.hasVariable(rhs)) {
                logger.logDebug("LTCond not satisfied since " + robjID + " does not have variable " + rhs);
                return false;
            }
            rhs = robj.getVariable(rhs);
        }

        String result = lobj.getVariable(lhs);
        try {
            // Try floats
            Float ans = Float.parseFloat(result);
            Float val = Float.parseFloat(rhs);
            boolean equal = ans.compareTo(val) < 0;
            if (equal) {
                logger.logDebug("LTCond satisfied");
            }
            else {
                logger.logDebug("LTCond not satisfied since " + ans + " !< " + val);
            }
            return equal;
        } catch (Exception e) {
            try {
                // Try booleans
                Boolean ans = Boolean.parseBoolean(result);
                Boolean val = Boolean.parseBoolean(rhs);
                boolean equal = ans.compareTo(val) < 0;
                if (equal) {
                    logger.logDebug("LTCond satisfied");
                }
                else {
                    logger.logDebug("LTCond not satisfied since " + ans + " !< " + val);
                }
                return equal;
            } catch (Exception e2) {
                // Default
                boolean equal = result.compareTo(rhs) < 0;
                if (equal) {
                    logger.logDebug("LTCond satisfied");
                }
                else {
                    logger.logDebug("LTCond not satisfied since " + result + " !< " + rhs);
                }
                return equal;
            }
        }
    }

    @Override
    public String toString() {
        return "LT: " + lobjID + ", " + lhs + ", " + robjID + ", " + rhs;
    }
}
