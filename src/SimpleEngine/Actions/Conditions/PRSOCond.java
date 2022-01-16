package SimpleEngine.Actions.Conditions;

import Game.GameController;
import SimpleEngine.Actions.ConditionTest;

import java.util.Set;

public class PRSOCond extends ConditionTest {
    private Set<String> ids;

    public PRSOCond(Set<String> ids) {
        this.ids = ids;
    }

    @Override
    public boolean satisfied() {
        logger.logDebug("Checking PRSOCond: Checking PRSO is one of: " + ids);
        boolean result = ids.contains(GameController.getPRSO().getId());
        if (result) {
            logger.logDebug("PRSOCond satisfied since PRSO = " + GameController.getPRSO().getId());
        }
        else {
            logger.logDebug("PRSOCond not satisfied since PRSO = " + GameController.getPRSO().getId());
        }
        return result;
    }

    @Override
    public String toString() {
        return "PRSO: " + ids;
    }
}
