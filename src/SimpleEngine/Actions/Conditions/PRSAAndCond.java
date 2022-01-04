package SimpleEngine.Actions.Conditions;

import Game.GameController;
import Logging.DebugLogger;
import SimpleEngine.Actions.ConditionTest;
import SimpleEngine.GameObject;

import java.util.Arrays;
import java.util.Set;

public class PRSAAndCond extends ConditionTest {

    private Set<String> verbs;

    public PRSAAndCond(Set<String> verbs) {
        this.verbs = verbs;
    }

    @Override
    public boolean satisfied() {
        logger.logDebug("Checking PRSAAndCond: Checking PRSA for all verbs: " + verbs);
        if (GameController.getPRSA() == null) {
            logger.logDebug("PRSAAndCond not satisfied since PRSA is null");
            return false;
        }
        String[] split = GameController.getPRSA().split(" ");
        for (String verb : verbs) {
            if (!Arrays.asList(split).contains(verb)) {
                logger.logDebug("PRSAAndCond not satisfied since " + verb + " is not in the PRSA (PRSA: " + GameController.getPRSA() + ")");
                return false;
            }
        }
        logger.logDebug("PRSAAndCond satisfied");
        return true;
    }

    @Override
    public String toString() {
        return "PRSAAnd: " + verbs;
    }
}
