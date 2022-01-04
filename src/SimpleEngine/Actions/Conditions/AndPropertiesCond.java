package SimpleEngine.Actions.Conditions;

import Logging.DebugLogger;
import SimpleEngine.Actions.ConditionTest;
import SimpleEngine.GameState;

import java.util.Set;

public class AndPropertiesCond extends ConditionTest {

    private String objID;
    private Set<String> properties;
    private DebugLogger logger = DebugLogger.getInstance();

    public AndPropertiesCond(String objID, Set<String> properties) {
        this.objID = objID;
        this.properties = properties;
    }

    @Override
    public boolean satisfied() {
        logger.logDebug("Checking AndPropertiesCond: Checking that object " + objID + " has properties: " + properties);
        for (String propertyID : properties) {
            if (!GameState.getGameObject(objID).hasProperty(propertyID)) {
                logger.logDebug("AndPropertiesCond not satisfied since object " + objID + " does not have property " + propertyID);
                return false;
            }
        }
        logger.logDebug("AndPropertiesCond satisfied");
        return true;
    }

    @Override
    public String toString() {
        return "AndProperties: " + objID + ", " + properties;
    }
}
