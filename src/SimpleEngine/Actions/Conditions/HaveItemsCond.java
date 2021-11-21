package SimpleEngine.Actions.Conditions;

import Game.GameController;
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
        for (String objId : objects) {
            if (!GameState.getGameObject(GameState.getGameObject(objId).getParent()).equals(GameController.getPlayer())) {
                return false;
            }
        }
        return true;
    }
}
