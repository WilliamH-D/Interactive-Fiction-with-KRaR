package SimpleEngine.Actions.Conditions;

import Game.GameController;
import Logging.DebugLogger;
import SimpleEngine.Actions.ConditionTest;
import SimpleEngine.GameState;

import java.util.Set;

public class HaveItemCond extends ConditionTest {

    private Set<String> objects;

    public HaveItemCond(Set<String> objects) {
        this.objects = objects;
    }

    @Override
    public boolean satisfied() {
        logger.logDebug("Checking HaveItemCond: Check that player has at least one of: " + objects);
        for (String objId : objects) {
            if (GameState.getGameObject(GameState.getGameObject(objId).getParent()).equals(GameController.getPlayer())) {
                logger.logDebug("HaveItemCond satisfied since player has " + objId);
                return true;
            }
        }
        logger.logDebug("HaveItemCond not satisfied since player has none of the listed objects");
        return false;
    }

    @Override
    public String toString() {
        return "HaveItem: " + objects;
    }
}
