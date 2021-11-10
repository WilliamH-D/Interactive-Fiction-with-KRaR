package Game;

import SimpleEngine.GameObject;
import SimpleEngine.GameRoom;

public class HardcodedTest {

    public static void main(String[] args) {
        GameController.instantiateGameController();
        GameController.setMap(createMap());
    }

    public static GameObject createMap() {
        GameObject map = new GameObject("MAP");

        GameRoom living_room = new GameRoom("LIVING-ROOM");
        GameRoom dining_room = new GameRoom("DINING-ROOM");
        GameRoom staircase_lower = new GameRoom("STAIRCASE-LOWER");
        GameRoom staircase_upper = new GameRoom("STAIRCASE-UPPER");
        GameRoom bedroom = new GameRoom("BEDROOM");
        GameRoom bathroom = new GameRoom("BATHROOM");

        map.addChild(living_room);
        map.addChild(dining_room);
        map.addChild(staircase_lower);
        map.addChild(staircase_upper);
        map.addChild(bedroom);
        map.addChild(bathroom);

        living_room.setRoomInDir(Direction.EAST, dining_room);
        dining_room.setRoomInDir(Direction.NORTH, staircase_lower);
        staircase_lower.setRoomInDir(Direction.UP, staircase_upper);
        staircase_upper.setRoomInDir(Direction.WEST, bathroom);
        staircase_upper.setRoomInDir(Direction.EAST, bedroom);

        return map;
    }
}
