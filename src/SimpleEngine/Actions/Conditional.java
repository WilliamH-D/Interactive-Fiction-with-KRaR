package SimpleEngine.Actions;

import Game.GameController;

import java.util.List;

public class Conditional extends Action {

    Condition conditions;
    List<Action> contents;

    public boolean satisfied() {
        return conditions.satisfied();
    }

    @Override
    public boolean performAction() {
        if (satisfied()) {
            for (Action action : contents) {
                if (action.performAction()) {
                    return true;
                }
            }
        }
        return false;
    }
}
