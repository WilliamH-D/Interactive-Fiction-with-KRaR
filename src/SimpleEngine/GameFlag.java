package SimpleEngine;

public class GameFlag {

    private String id;
    private int set;

    public GameFlag(String id, int val) {
        this.id = id;
        set = val;
    }

    public String getId() {
        return this.id;
    }

    public void set() { this.set = 1; }

    public void set(int val) { this.set = val; }

    public void unset() { this.set = 0; }

    public boolean isSet() { return this.set > 0; }

    public int getValue() { return this.set; }
}
