package SimpleEngine.Actions;

import Logging.DebugLogger;

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
        DebugLogger.getInstance().logDebug("Checking Condition list for condition: " + test.toString() + ". Properties: isAnd = " + isAnd + ", isOr = " + isOr + ", test is NOTed = " + test.not() + ", has continuation = " + (continuation != null));
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
