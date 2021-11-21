package SimpleEngine.Actions.Conditions;

import SimpleEngine.Actions.ConditionTest;
import SimpleEngine.GameState;

import java.util.Set;

public class OrFlagsCond extends ConditionTest {

    // Global flags context (e.g. not bit flag on objects)

    private Set<String> flags;

    public OrFlagsCond(Set<String> flags) {
        this.flags = flags;
    }

    @Override
    public boolean satisfied() {
        for (String flagID : flags) {
            if (GameState.getFlag(flagID).isSet()) {
                return true;
            }
        }
        return false;
    }

}
