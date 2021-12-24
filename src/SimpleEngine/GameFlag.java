package SimpleEngine;

import EnhancedEngine.KnowledgeBase;

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

    public void set() {
        this.set = 1;
        KnowledgeBase.getInstance().removeClause("flag(" + id.toLowerCase() + ",X)", true);
        KnowledgeBase.getInstance().addClause("flag(" + id.toLowerCase() + ",1)");
    }

    public void set(int val) {
        this.set = val;
        KnowledgeBase.getInstance().removeClause("flag(" + id.toLowerCase() + ",X)", true);
        KnowledgeBase.getInstance().addClause("flag(" + id.toLowerCase() + "," + val + ")");
    }

    public void unset() {
        this.set = 0;
        KnowledgeBase.getInstance().removeClause("flag(" + id.toLowerCase() + ",X)", true);
        KnowledgeBase.getInstance().addClause("flag(" + id.toLowerCase() + ",0)");
    }

    public boolean isSet() { return this.set > 0; }

    public int getValue() { return this.set; }
}
