package SimpleEngine.Actions;

public abstract class ConditionTest {

    private boolean isNot;

    public abstract boolean satisfied();

    public void setIsNot() {
        this.isNot = true;
    }

    public boolean not() { return this.isNot; }
}
