package SimpleEngine.Actions.Conditions;

import SimpleEngine.Actions.ConditionTest;
import SimpleEngine.GameState;

import java.util.Set;

public class OrPropertiesCond extends ConditionTest {

    private String objID;
    private Set<String> properties;

    public OrPropertiesCond(String objID, Set<String> properties) {
        this.objID = objID;
        this.properties = properties;
    }

    @Override
    public boolean satisfied() {
        logger.logDebug("Checking OrPropertiesCond: Checking object " + objID + " has at least one of these properties: " + properties);
        for (String propertyID : properties) {
            if (GameState.getGameObject(objID).hasProperty(propertyID)) {
                logger.logDebug("OrPropertiesCond satisfied since " + objID + " has property: " + propertyID);
                return true;
            }
        }
        logger.logDebug("OrFlagsCond not satisfied");
        return false;
    }

    @Override
    public String toString() {
        return "OrProperties: " + objID + ", " + properties;
    }
}
