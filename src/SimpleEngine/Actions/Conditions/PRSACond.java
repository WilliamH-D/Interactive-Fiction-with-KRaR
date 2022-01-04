package SimpleEngine.Actions.Conditions;

import Game.GameController;
import Logging.DebugLogger;
import SimpleEngine.Actions.ConditionTest;
import SimpleEngine.GameObject;

import java.util.Set;

public class PRSACond extends ConditionTest {

    private Set<String> verbs;

    public PRSACond(Set<String> verbs) {
        this.verbs = verbs;
    }

    @Override
    public boolean satisfied() {
        logger.logDebug("Checking PRSACond: Checking PRSA for verb(s) out of: " + verbs);
        if (GameController.getPRSA() == null) {
            logger.logDebug("PRSACond not satisfied since PRSA is null");
            return false;
        }
        String[] split = GameController.getPRSA().split(" ");
        for (String s : split) {
            if (verbs.contains(s)) {
                logger.logDebug("PRSACond satisfied since " + s + " contained in PRSA list (PRSA: " + GameController.getPRSA() + ")");
                return true;
            }
        }
        logger.logDebug("PRSACond not satisfied since no expected verbs are in the PRSA (PRSA: " + GameController.getPRSA() + ")");
        return false;
    }

    @Override
    public String toString() {
        return "PRSA: " + verbs;
    }
}
