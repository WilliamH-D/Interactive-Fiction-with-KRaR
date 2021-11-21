package SimpleEngine;

public class GameFlag {

    private String id;
    private boolean set;

    public GameFlag(String id) {
        this.id = id;
        set = false;
    }

    public String getId() {
        return this.id;
    }

    public void set() { this.set = true; }

    public void unset() { this.set = false; }

    public boolean isSet() { return this.set; }
}
