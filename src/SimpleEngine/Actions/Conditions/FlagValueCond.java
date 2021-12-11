package SimpleEngine.Actions.Conditions;

import SimpleEngine.Actions.ConditionTest;
import SimpleEngine.GameState;

public class FlagValueCond extends ConditionTest {

    private String flag;
    private int value;

    public FlagValueCond(String flag, int value) {
        this.flag = flag;
        this.value = value;
    }

    @Override
    public boolean satisfied() {
        return GameState.getFlag(flag).getValue() == value;
    }
}
