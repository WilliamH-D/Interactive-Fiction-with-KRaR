package Game;

import SimpleEngine.GameObject;
import SimpleEngine.GameRoom;
import SimpleEngine.GameState;

public class Player extends GameObject {

    public Player() {

        super("PLAYER");
        GameState.addGameObject(this);
    }

    public GameRoom getLocation() {
        return (GameRoom) GameState.getGameObject(this.getParent());
    }

    public void movePlayer(GameRoom loc) {
        this.setParent(loc.getId());
    }
}
