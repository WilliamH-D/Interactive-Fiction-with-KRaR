package SimpleEngine.Actions.Conditions;

import Logging.DebugLogger;
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
        logger.logDebug("Checking AndFlagsCond: Checking to see that all flags are set: " + flags);
        for (String flagID : flags) {
            if (!GameState.getFlag(flagID).isSet()) {
                logger.logDebug("AndFlagsCond not satisfied since flag " + flagID + " is not set");
                return false;
            }
        }
        logger.logDebug("AndFlagsCond satisfied");
        return true;
    }

    @Override
    public String toString() {
        return "AndFlags: " + flags;
    }
}
