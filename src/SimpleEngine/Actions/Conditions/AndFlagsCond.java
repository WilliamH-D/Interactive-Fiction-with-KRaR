package SimpleEngine.Actions.Conditions;

import SimpleEngine.Actions.ConditionTest;
import SimpleEngine.GameState;

import java.util.Set;

public class AndFlagsCond extends ConditionTest {

    // Global flags context (e.g. not bit flag on objects)

    private Set<String> flags;

    public AndFlagsCond(Set<String> flags) {
        this.flags = flags;
    }

    @Override
    public boolean satisfied() {
        for (String flagID : flags) {
            if (!GameState.getFlag(flagID).isSet()) {
                System.out.println("ANDFLAGSCOND: Flag " + flagID + " not set - NOT SATISFIED");
                return false;
            }
        }
        System.out.println("ANDFLAGSCOND: All flags set - SATISFIED");
        return true;
    }
}
