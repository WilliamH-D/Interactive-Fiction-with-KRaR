package SimpleEngine.Actions.Conditions;

import Game.GameController;
import Logging.DebugLogger;
import SimpleEngine.Actions.ConditionTest;
import SimpleEngine.GameState;

import java.util.Set;

public class HaveItemsCond extends ConditionTest {

    private Set<String> objects;

    public HaveItemsCond(Set<String> objects) {
        this.objects = objects;
    }

    @Override
    public boolean satisfied() {
        logger.logDebug("Checking HaveItemsCond: Check that player has all of: " + objects);
        for (String objId : objects) {
            if (!GameState.getGameObject(GameState.getGameObject(objId).getParent()).equals(GameController.getPlayer())) {
                logger.logDebug("HaveItemsCond not satisfied since player doesn't have " + objId);
                return false;
            }
        }
        logger.logDebug("HaveItemCond satisfied");
        return true;
    }

    @Override
    public String toString() {
        return "HaveItems: " + objects;
    }
}
