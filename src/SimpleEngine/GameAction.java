package SimpleEngine;

import SimpleEngine.Actions.ActionPart;
import SimpleEngine.Actions.Conditional;

import java.util.List;

public class GameAction {

    private String id;
    private List<ActionPart> actions;

    public GameAction(String id, List<ActionPart> actions) {
        this.id = id;
        this.actions = actions;
    }

    public String getId() { return this.id; }

    public boolean executeAction() {
        boolean actionPerformed = false;

        for (ActionPart action : actions) {
            // If conditions are satisfied, for each action in this conditional's contents:
            if (action instanceof Conditional) {
                // The action is a conditional
                if (action.performAction()) {
                    actionPerformed = true;
                    // Don't want to enter any more conditionals once this one has had a successful effect performed
                    break;
                }
            }
            else if (action.performAction()) {
                // Effects will always be performed
                actionPerformed = true;
            }
        }

        return actionPerformed;
    }
}
