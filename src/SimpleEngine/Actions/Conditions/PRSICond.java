package SimpleEngine.Actions.Conditions;

import Game.GameController;
import SimpleEngine.Actions.ConditionTest;

import java.util.Set;

public class PRSICond extends ConditionTest {

    private Set<String> ids;

    public PRSICond(Set<String> ids) {
        this.ids = ids;
    }

    @Override
    public boolean satisfied() {
        logger.logDebug("Checking PRSICond: Checking PRSI is one of: " + ids);
        if (GameController.getPRSI() == null) {
            logger.logDebug("PRSICond not satisfied since PRSI = null");
            return false;
        }
        boolean result = ids.contains(GameController.getPRSI().getId());
        if (result) {
            logger.logDebug("PRSICond satisfied since PRSI = " + GameController.getPRSI().getId());
        }
        else {
            logger.logDebug("PRSICond not satisfied since PRSI = " + GameController.getPRSI().getId());
        }
        return result;
    }

    @Override
    public String toString() {
        return "PRSI: " + ids;
    }
}
