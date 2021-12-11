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
        String[] split = GameController.getPRSA().split(" ");
        if (split.length == 1) {
            return verbs.contains(split[0]);
        }
        for (String s : split) {
            if (verbs.contains(s)) {
                return true;
            }
        }
        return false;
    }
}
