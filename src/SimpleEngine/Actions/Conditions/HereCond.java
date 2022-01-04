package SimpleEngine.Actions.Conditions;

import Game.GameController;
import Logging.DebugLogger;
import SimpleEngine.Actions.ConditionTest;
import SimpleEngine.GameState;

import java.util.Set;

public class HereCond extends ConditionTest {

    Set<String> locIds;

    public HereCond(Set<String> locIds) {
        this.locIds = locIds;
    }

    @Override
    public boolean satisfied() {
        logger.logDebug("Checking HaveItemsCond: Check that player is located at one of: " + locIds);
        boolean result = locIds.contains(GameController.getPlayer().getLocation().getId());
        if (result) {
            logger.logDebug("HaveItemsCond satisfied since player is located at " + GameController.getPlayer().getLocation().getId());
        }
        else {
            logger.logDebug("HaveItemsCond not satisfied");
        }
        return result;
    }

    @Override
    public String toString() {
        return "Here: " + locIds;
    }
}
