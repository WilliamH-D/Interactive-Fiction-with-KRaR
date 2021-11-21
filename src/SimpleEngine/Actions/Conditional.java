package SimpleEngine.Actions;

import java.util.List;

public class Conditional extends ActionPart {

    private Condition conditions;
    private List<ActionPart> contents;

    public Conditional(Condition conditions, List<ActionPart> contents) {
        this.conditions = conditions;
        this.contents = contents;
    }

    public boolean satisfied() {
        return conditions.satisfied();
    }

    @Override
    public boolean performAction() {
        // All conditionals are treated as if-else
        // Multiple effects can be taken, but once a conditional's contents are entered, anything after the conditional is ignored
        boolean actionPerformed = false;
        boolean conditionalEntered = false;
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
                else if (!conditionalEntered && action.performAction()) {
                    // Effects will always be performed
                    actionPerformed = true;
                }
            }
        }
        return actionPerformed;
    }
}
