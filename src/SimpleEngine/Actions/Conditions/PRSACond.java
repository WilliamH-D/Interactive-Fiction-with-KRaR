package SimpleEngine.Actions.Conditions;

import Game.GameController;
import SimpleEngine.Actions.ConditionTest;

import java.util.Set;

public class PRSACond extends ConditionTest {

    private Set<String> verbs;

    public PRSACond(Set<String> verbs) {
        this.verbs = verbs;
    }

    @Override
    public boolean satisfied() {
        return verbs.contains(GameController.getPRSA());
    }
}
