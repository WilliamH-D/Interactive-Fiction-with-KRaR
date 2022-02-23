package EnhancedEngine;

import java.util.ArrayList;
import java.util.List;

public class TurnEndChecks {

    private static TurnEndChecks instance;

    private List<EndCheck> endChecks;
    private List<Boolean> checkingForIf;

    private TurnEndChecks() {
        this.endChecks = new ArrayList<>();
        this.checkingForIf = new ArrayList<>();
    }

    public static TurnEndChecks getInstance() {
        if (instance == null) {
            instance = new TurnEndChecks();
        }
        return instance;
    }

    public void addEndCheck(EndCheck check) {
        this.endChecks.add(check);
        this.checkingForIf.add(Boolean.TRUE);
    }

    public void performChecks() {
        for (int i = 0; i < endChecks.size(); i++) {
            EndCheck toCheck = endChecks.get(i);
            if (checkingForIf.get(i)) {
                if (toCheck.queriesSatisfied()) {
                    toCheck.performIfEffects();
                    checkingForIf.set(i, Boolean.FALSE);
                }
            }
            else {
                if (!toCheck.queriesSatisfied()) {
                    toCheck.performElseEffects();
                    checkingForIf.set(i, Boolean.TRUE);
                }
            }
        }
    }
}
