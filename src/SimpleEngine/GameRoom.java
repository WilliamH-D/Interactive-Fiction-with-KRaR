package SimpleEngine;

import Game.Direction;

public class GameRoom extends GameObject {

    private GameRoom north;
    private GameRoom south;
    private GameRoom east;
    private GameRoom west;
    private GameRoom up;
    private GameRoom down;

    private ObjectFlag[] requiredNorthFlags;
    private ObjectFlag[] requiredSouthFlags;
    private ObjectFlag[] requiredEastFlags;
    private ObjectFlag[] requiredWestFlags;
    private ObjectFlag[] requiredUpFlags;
    private ObjectFlag[] requiredDownFlags;

    public GameRoom(String n) {
        super(n);
    }

    public GameRoom getNorth() {
        return this.north;
    }

    public GameRoom getSouth() {
        return this.south;
    }

    public GameRoom getEast() {
        return this.east;
    }

    public GameRoom getWest() {
        return this.west;
    }

    public GameRoom getUp() {
        return this.up;
    }

    public GameRoom getDown() {
        return this.down;
    }

    public GameRoom getDir(Direction dir) {
        switch(dir) {
            case NORTH: return this.north;
            case SOUTH: return this.south;
            case EAST: return this.east;
            case WEST: return this.west;
            case UP: return this.up;
            case DOWN: return this.down;
        }
        return null;
    }

    public void setRoomInDir(Direction dir, GameRoom room) {
        switch (dir) {
            case NORTH:
                if (this.north != null) { this.getNorth().south = null; }
                this.north = room;
                if (room.south != null) { room.getSouth().north = null; }
                room.south = this;
                break;
            case SOUTH:
                if (this.south != null) { this.getNorth().north = null; }
                this.south = room;
                if (room.north != null) { room.getSouth().south = null; }
                room.north = this;
                break;
            case EAST:
                if (this.east != null) { this.getNorth().west = null; }
                this.east = room;
                if (room.west != null) { room.getSouth().east = null; }
                room.west = this;
                break;
            case WEST:
                if (this.west != null) { this.getNorth().east = null; }
                this.west = room;
                if (room.east != null) { room.getSouth().west = null; }
                room.east = this;
                break;
            case UP:
                if (this.up != null) { this.getNorth().down = null; }
                this.up = room;
                if (room.down != null) { room.getSouth().up = null; }
                room.down = this;
                break;
            case DOWN:
                if (this.down != null) { this.getNorth().up = null; }
                this.down = room;
                if (room.up != null) { room.getSouth().down = null; }
                room.up = this;
                break;
        }
    }
}

