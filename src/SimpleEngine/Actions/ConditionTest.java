package SimpleEngine.Actions;

import Logging.DebugLogger;

public abstract class ConditionTest {

    private boolean isNot;
    public DebugLogger logger = DebugLogger.getInstance();

    public abstract boolean satisfied();

    public abstract String toString();

    public void setIsNot() {
        this.isNot = true;
    }

    public boolean not() { return this.isNot; }
}
