package SimpleEngine.Actions;

public class Condition {

    boolean isAnd;
    boolean isOr;
    ConditionTest test;
    Condition continuation;

    public Condition(ConditionTest test, boolean isAnd, boolean isOr, Condition continuation) {
        this.test = test;
        this.isAnd = isAnd;
        this.isOr = isOr;
        this.continuation = continuation;
    }

    public boolean satisfied() {
        if (continuation != null) {
            if (isAnd) {
                if (test.not()) { return !test.satisfied() && continuation.satisfied(); }
                else { return test.satisfied() && continuation.satisfied(); }
            }
            if (isOr) {
                if (test.not()) { return !test.satisfied() || continuation.satisfied(); }
                else { return test.satisfied() || continuation.satisfied(); }
            }
        }
        if (test.not()) { return !test.satisfied(); }
        else { return test.satisfied(); }
    }
}
