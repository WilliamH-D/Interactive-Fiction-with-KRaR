package SimpleEngine.Actions;

public class Condition {

    boolean isAnd;
    boolean isOr;
    boolean isNot;
    ConditionTest test;
    Condition continuation;

    public Condition(ConditionTest test, boolean isNot, boolean isAnd, boolean isOr, Condition continuation) {
        this.test = test;
        this.isNot = isNot;
        this.isAnd = isAnd;
        this.isOr = isOr;
        this.continuation = continuation;
    }

    public boolean satisfied() {
        if (continuation != null) {
            if (isAnd) {
                if (isNot) { return !test.satisfied() && continuation.satisfied(); }
                else { return test.satisfied() && continuation.satisfied(); }
            }
            if (isOr) {
                if (isNot) { return !test.satisfied() || continuation.satisfied(); }
                else { return test.satisfied() || continuation.satisfied(); }
            }
        }
        if (isNot) { return !test.satisfied(); }
        else { return test.satisfied(); }
    }
}
