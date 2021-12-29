package SimpleEngine.Actions.Conditions;

import Game.GameController;
import Logging.DebugLogger;
import SimpleEngine.Actions.ConditionTest;
import SimpleEngine.GameObject;

import java.util.Set;

public class PRSACond extends ConditionTest {

    private Set<String> verbs;
    private DebugLogger logger = DebugLogger.getInstance();

    public PRSACond(Set<String> verbs) {
        this.verbs = verbs;
    }

    @Override
    public boolean satisfied() {
        if (GameController.getPRSA() == null) {
            logger.logDebug("PRSACond not satisfied since PRSA is null");
            return false;
        }
        String[] split = GameController.getPRSA().split(" ");
        if (split.length == 1) {
            boolean result = verbs.contains(split[0]);
            if (result) { logger.logDebug("PRSACond satisfied since " + split[0] + " contained in PRSA list"); }
            else { logger.logDebug("PRSACond not satisfied since " + split[0] + " not contained in PRSA list"); }
            return result;
        }
        for (String s : split) {
            if (verbs.contains(s)) {
                logger.logDebug("PRSACond satisfied since " + s + " contained in PRSA list");
                return true;
            }
        }
        return false;
    }
}
