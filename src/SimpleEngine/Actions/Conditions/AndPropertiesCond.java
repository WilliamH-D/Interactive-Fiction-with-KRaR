package SimpleEngine.Actions.Conditions;

import SimpleEngine.Actions.ConditionTest;
import SimpleEngine.GameState;

import java.util.Set;

public class AndPropertiesCond extends ConditionTest {

    private String objID;
    private Set<String> properties;

    public AndPropertiesCond(String objID, Set<String> properties) {
        this.objID = objID;
        this.properties = properties;
    }

    @Override
    public boolean satisfied() {
        for (String propertyID : properties) {
            if (!GameState.getGameObject(objID).hasProperty(propertyID)) {
                System.out.println("ANDPROPERTIESCOND: Object " + objID + " does not have property " + propertyID + " - NOT SATISFIED");
                return false;
            }
        }
        System.out.println("ANDPROPERTIESCOND: All properties - SATISFIED");
        return true;
    }
}
