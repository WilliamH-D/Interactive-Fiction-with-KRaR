package Game;

import SimpleEngine.GameObject;
import SimpleEngine.GameRoom;

public class Player extends GameObject {

    public Player() {
        super("PLAYER");
    }

    public GameRoom getLocation() {
        return (GameRoom)this.getParent();
    }

    public void movePlayer(GameRoom loc) {
        this.setParent(loc);
    }
}
