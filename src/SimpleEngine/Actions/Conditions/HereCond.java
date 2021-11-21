package SimpleEngine.Actions.Conditions;

import Game.GameController;
import SimpleEngine.Actions.ConditionTest;

import java.util.Set;

public class HereCond extends ConditionTest {

    Set<String> locIds;

    public HereCond(Set<String> locIds) {
        this.locIds = locIds;
    }

    @Override
    public boolean satisfied() {
        return locIds.contains(GameController.getPlayer().getLocation().getId());
    }
}
