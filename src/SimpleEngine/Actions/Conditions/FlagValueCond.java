package SimpleEngine.Actions.Conditions;

import Logging.DebugLogger;
import SimpleEngine.Actions.ConditionTest;
import SimpleEngine.GameState;

public class FlagValueCond extends ConditionTest {

    private String flag;
    private int value;

    public FlagValueCond(String flag, int value) {
        this.flag = flag;
        this.value = value;
    }

    @Override
    public boolean satisfied() {
        logger.logDebug("Checking FlagValueCond: Check that " + flag + " = " + value);
        boolean result = GameState.getFlag(flag).getValue() == value;
        if (result) {
            logger.logDebug("FlagValueCond satisfied");
        }
        else {
            logger.logDebug("FlagValueCond not satisfied since " + flag + " = " + GameState.getFlag(flag).getValue());
        }
        return result;
    }

    @Override
    public String toString() {
        return "FlagValue: " + flag + ", " + value;
    }
}
