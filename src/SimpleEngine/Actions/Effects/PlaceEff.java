package SimpleEngine.Actions.Effects;

import Game.GameController;
import SimpleEngine.Actions.Effect;
import SimpleEngine.GameState;

public class PlaceEff extends Effect {

    private String itemID;
    private String locID;

    public PlaceEff(String itemID, String locID) {
        this.itemID = itemID;
        this.locID = locID;
    }

    @Override
    public boolean performAction() {
        // Check given itemID is an actual item
        if (!(GameState.getGameObject(itemID) == null)) {
            System.err.println(itemID + " IS NOT A VALID OBJECT!");
            return false;
        }
        // Check item is in player's inventory
        if (!GameState.getGameObject(itemID).getParent().equals(GameController.getPlayer().getId())) {
            System.err.println(itemID + " IS NOT IN THE PLAYER'S INVENTORY!");
            return false;
        }
        if (!locID.toUpperCase().equals("CURR")) {
            // Check given location exists
            if (!(GameState.getGameObject(locID) == null)) {
                System.err.println(locID + " IS NOT A VALID LOCATION!");
                return false;
            }
            GameState.getGameObject(itemID).setParent(locID);
        }
        else {
            GameState.getGameObject(itemID).setParent(GameController.getPlayer().getLocation().getId());
        }
        return true;
    }
}
