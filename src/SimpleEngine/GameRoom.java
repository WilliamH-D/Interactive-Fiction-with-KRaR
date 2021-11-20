package SimpleEngine;

import Game.Direction;

public class GameRoom extends GameObject {

    private String north;
    private String south;
    private String east;
    private String west;
    private String up;
    private String down;

    public GameRoom(String n) {
        super(n);
    }

    public String getNorth() { return this.north;  }

    public String getSouth() { return this.south; }

    public String getEast() { return this.east; }

    public String getWest() { return this.west; }

    public String getUp() { return this.up; }

    public String getDown() { return this.down; }

    public String getDir(Direction dir) {
        switch(dir) {
            case NORTH: return getNorth();
            case SOUTH: return getSouth();
            case EAST: return getEast();
            case WEST: return getWest();
            case UP: return getUp();
            case DOWN: return getDown();
        }
        return null;
    }

    public void setNorth(String room) { this.north = room; }

    public void setSouth(String room) { this.south = room; }

    public void setEast(String room) { this.east = room; }

    public void setWest(String room) { this.west = room; }

    public void setUp(String room) { this.up = room; }

    public void setDown(String room) { this.down = room; }

    public void setDir(Direction dir, String room) {
        switch (dir) {
            case NORTH: setNorth(room); break;
            case SOUTH: setSouth(room); break;
            case EAST: setEast(room); break;
            case WEST: setWest(room); break;
            case UP: setUp(room); break;
            case DOWN: setDown(room); break;
        }
    }
}

