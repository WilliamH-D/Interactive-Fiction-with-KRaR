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
        return ids.contains(GameController.getPRSI().getId());
    }
}
