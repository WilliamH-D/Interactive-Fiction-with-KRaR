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
        return ids.contains(GameController.getPRSO().getId());
    }
}
