package Game;

import EnhancedEngine.KnowledgeBase;
import SimpleEngine.GameObject;
import SimpleEngine.GameRoom;
import SimpleEngine.GameState;

import java.util.Arrays;
import java.util.HashSet;

public class Player extends GameObject {

    public Player() {

        super("PLAYER");
        GameState.addGameObject(this);
        // Looking at inventory will be done by using this Player object as the PRSO
        this.setSynonyms(new HashSet<>(Arrays.asList("\"inventory\"", "\"pocket\"", "\"items\"", "\"objects\"", "\"belongings\"")));
    }

    public GameRoom getLocation() {
        return (GameRoom) GameState.getGameObject(this.getParent());
    }

    public void movePlayer(GameRoom loc) {
        this.setParent(loc.getId(), 0);
        KnowledgeBase.getInstance().removeClause("isLocated(" + getId().toLowerCase() + ",X,0)", true);
        KnowledgeBase.getInstance().addClause("isLocated(" + getId().toLowerCase() + "," + loc.getId().toLowerCase() + ",0)");
        if (Main.continueLooping) {
            GameController.describeLocation();
        }
    }

    public void inspectInventory() {
        System.out.println("You look into your inventory. You have:");
        if (getChildren().size() == 0) {
            System.out.println("... nothing. Not a single belonging to your name...");
            return;
        }
        for (String c : getChildren()) {
            GameObject obj = GameState.getGameObject(c);
            System.out.println("\t- " + obj.getName());
        }
    }
}
