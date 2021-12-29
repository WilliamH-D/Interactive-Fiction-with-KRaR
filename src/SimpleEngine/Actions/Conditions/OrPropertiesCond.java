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
        for (String propertyID : properties) {
            if (GameState.getGameObject(objID).hasProperty(propertyID)) {
                return true;
            }
        }
        return false;
    }
}
