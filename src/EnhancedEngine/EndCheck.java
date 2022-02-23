package EnhancedEngine;

import SimpleEngine.Actions.ActionPart;
import SimpleEngine.Actions.ConditionTest;

import java.util.List;

public class EndCheck {

    private List<ConditionTest> queries;
    private List<ActionPart> ifEffects;
    private List<ActionPart> elseEffects;

    public EndCheck(List<ConditionTest> queries, List<ActionPart> ifEffects, List<ActionPart> elseEffects) {
        this.queries = queries;
        this.ifEffects = ifEffects;
        this.elseEffects = elseEffects;
    }

    boolean queriesSatisfied() {
        for (ConditionTest query : queries) {
            if (!query.satisfied()) {
                return false;
            }
        }
        return true;
    }

    void performIfEffects() {
        for (ActionPart action : ifEffects) {
            action.performAction();
        }
    }

    void performElseEffects() {
        for (ActionPart action : elseEffects) {
            action.performAction();
        }
    }
}
