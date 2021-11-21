package SimpleEngine;

import SimpleEngine.Actions.Action;

public class GameAction {

    private String id;
    private Action action;

    public GameAction(String id, Action action) {
        this.id = id;
        this.action = action;
    }

    public String getId() { return this.id; }

    public boolean executeAction() {
        return action.performAction();
    }
}
