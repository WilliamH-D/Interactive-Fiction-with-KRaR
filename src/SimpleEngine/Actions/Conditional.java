package SimpleEngine.Actions;

import Logging.DebugLogger;

import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;

public class Conditional extends ActionPart {

    private Condition conditions;
    private List<ActionPart> contents;
    private DebugLogger logger;

    public Conditional(Condition conditions, List<ActionPart> contents) {
        this.conditions = conditions;
        this.contents = contents;
        this.logger = DebugLogger.getInstance();
    }

    public boolean satisfied() {
        logger.logLine();
        logger.logDebug("Checking whether conditional: " + toString() + " is satisfied");
        boolean isSatisfied = conditions.satisfied();
        if (isSatisfied) {
            logger.logDebug("Condition is satisfied");
        }
        else {
            logger.logDebug("Condition is not satisfied");
        }
        return isSatisfied;
    }

    @Override
    public boolean performAction() {
        // All conditionals are treated as if-else
        // Multiple effects can be taken, but once a conditional's contents are entered, anything after the conditional is ignored
        boolean actionPerformed = false;
        boolean conditionalEntered = false;
        boolean continueEffects = true;
        if (satisfied()) {
            for (ActionPart action : contents) {
                // If conditions are satisfied, for each action in this conditional's contents:
                if (action instanceof Conditional) {
                    // The action is a conditional
                    if (!conditionalEntered && action.performAction()) {
                        actionPerformed = true;
                        // Don't want to enter any more conditionals once this one has had a successful effect performed
                        conditionalEntered = true;
                    }
                }
                else if (!conditionalEntered && continueEffects) {
                    actionPerformed = true;
                    if (!action.performAction()) {
                        continueEffects = false;
                    }
                }
            }
        }
        return actionPerformed;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        Queue<Condition> conds = new ArrayDeque<>();
        str.append("<");
        conds.add(conditions);
        while (conds.size() > 0) {
            Condition currCond = conds.remove();
            if (currCond.test.not()) {
                str.append("!");
            }
            str.append(currCond.test.toString());
            if (currCond.continuation != null) {
                conds.add(currCond.continuation);
                if (currCond.isAnd) {
                    str.append(" && ");
                }
                else if (currCond.isOr) {
                    str.append(" || ");
                }
            }
        }
        str.append(">");

        return str.toString();
    }
}
