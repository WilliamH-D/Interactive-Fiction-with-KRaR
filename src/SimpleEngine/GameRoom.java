package SimpleEngine;

import Game.Direction;
import edu.stanford.nlp.util.ArraySet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class GameRoom extends GameObject {

    private String north;
    private Set<String> nconds;
    private String south;
    private Set<String> sconds;
    private String east;
    private Set<String> econds;
    private String west;
    private Set<String> wconds;
    private String up;
    private Set<String> uconds;
    private String down;
    private Set<String> dconds;

    public GameRoom(String n) {
        super(n);
    }

    public String getNorth() { return this.north;  }

    public String getSouth() { return this.south; }

    public String getEast() { return this.east; }

    public String getWest() { return this.west; }

    public String getUp() { return this.up; }

    public String getDown() { return this.down; }

    public Set<String> getNConds() { return this.nconds;  }

    public Set<String> getSConds() { return this.sconds; }

    public Set<String> getEConds() { return this.econds; }

    public Set<String> getWConds() { return this.wconds; }

    public Set<String> getUConds() { return this.uconds; }

    public Set<String> getDConds() { return this.dconds; }

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

    public void setNConds(Set<String> conds) {
        if (conds != null) {
            this.nconds = new HashSet<>(conds);
        }
    }

    public void setSConds(Set<String> conds) {
        if (conds != null) {
            this.sconds = new HashSet<>(conds);
        }
    }

    public void setEConds(Set<String> conds) {
        if (conds != null) {
            this.econds = new HashSet<>(conds);
        }
    }

    public void setWConds(Set<String> conds) {
        if (conds != null) {
            this.wconds = new HashSet<>(conds);
        }
    }

    public void setUConds(Set<String> conds) {
        if (conds != null) {
            this.uconds = new HashSet<>(conds);
        }
    }

    public void setDConds(Set<String> conds) {
        if (conds != null) {
            this.dconds = new HashSet<>(conds);
        }
    }

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

