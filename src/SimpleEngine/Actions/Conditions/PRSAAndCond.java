package SimpleEngine.Actions.Conditions;

import Game.GameController;
import Logging.DebugLogger;
import SimpleEngine.Actions.ConditionTest;
import SimpleEngine.GameObject;

import java.util.Arrays;
import java.util.Set;

public class PRSAAndCond extends ConditionTest {

    private Set<String> verbs;
    private DebugLogger logger = DebugLogger.getInstance();

    public PRSAAndCond(Set<String> verbs) {
        this.verbs = verbs;
    }

    @Override
    public boolean satisfied() {
        if (GameController.getPRSA() == null) {
            logger.logDebug("PRSACond not satisfied since PRSA is null");
            return false;
        }
        String[] split = GameController.getPRSA().split(" ");
        if (split.length == 1 && verbs.size() == 1) {
            logger.logDebug("PRSAAndCond not satisfied since PRSA is not same size as list");
            return false;
        }
        for (String verb : verbs) {
            if (!Arrays.asList(split).contains(verb)) {
                logger.logDebug("PRSACond not satisfied since " + verb + " is not in the PRSA");
                return false;
            }
        }
        logger.logDebug("PRSAAndCond satisfied");
        return true;
    }
}
