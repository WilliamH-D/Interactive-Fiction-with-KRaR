package SimpleEngine.Actions.Conditions;

import Game.GameController;
import SimpleEngine.Actions.ConditionTest;
import SimpleEngine.GameObject;
import SimpleEngine.GameState;

import java.util.Set;

public class InScopeCond extends ConditionTest {

    String objID;
    Set<String> scopeIDs;

    public InScopeCond(String objID, Set<String> scopeIDs) {
        this.objID = objID;
        this.scopeIDs = scopeIDs;
    }

    @Override
    public boolean satisfied() {
        logger.logDebug("Checking InScopeCond: Check that object: " + objID + " is descendant of one of: " + scopeIDs);
        for (String scopeID : scopeIDs) {
            GameObject scope = GameState.getGameObject(scopeID);
            if (scope.hasDescendant(objID).size() > 0) {
                logger.logDebug("InScopeCond satisfied since object " + objID + " is descendant of " + scopeID);
                return true;
            }
        }
        logger.logDebug("InScopeCond not satisfied");
        return false;
    }

    @Override
    public String toString() {
        return "InScope: " + objID + ", " + scopeIDs;
    }
}
