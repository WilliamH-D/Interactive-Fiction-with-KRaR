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
        logger.logDebug("Checking OrFlagsCond: Check at least one of these flags is set: " + flags);
        for (String flagID : flags) {
            if (GameState.getFlag(flagID).isSet()) {
                logger.logDebug("OrFlagsCond satisfied since " + flagID + " is set");
                return true;
            }
        }
        logger.logDebug("OrFlagsCond not satisfied");
        return false;
    }

    @Override
    public String toString() {
        return "OrFlags: " + flags;
    }

}
