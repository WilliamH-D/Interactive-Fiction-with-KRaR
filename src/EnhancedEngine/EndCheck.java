package EnhancedEngine;

import SimpleEngine.Actions.ActionPart;
import SimpleEngine.Actions.ConditionTest;

import java.util.List;

public class EndCheck {

    private List<ConditionTest> queries;
    private boolean isDefault;
    private List<ActionPart> ifEffects;
    private List<ActionPart> elseEffects;

    public EndCheck(List<ConditionTest> queries, boolean isDefault, List<ActionPart> ifEffects, List<ActionPart> elseEffects) {
        this.queries = queries;
        this.isDefault = isDefault;
        this.ifEffects = ifEffects;
        this.elseEffects = elseEffects;
    }

    public boolean getIsDefault() { return isDefault; }

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
