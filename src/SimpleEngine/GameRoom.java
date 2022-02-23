package SimpleEngine;

import Game.Direction;
import SimpleEngine.Actions.ConditionTest;
import edu.stanford.nlp.util.ArraySet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class GameRoom extends GameObject {

    private String north;
    private Set<String> nconds;
    private ConditionTest nquery;
    private boolean nhidden;
    private String nblockmessage;
    private String south;
    private Set<String> sconds;
    private ConditionTest squery;
    private boolean shidden;
    private String sblockmessage;
    private String east;
    private Set<String> econds;
    private ConditionTest equery;
    private boolean ehidden;
    private String eblockmessage;
    private String west;
    private Set<String> wconds;
    private ConditionTest wquery;
    private boolean whidden;
    private String wblockmessage;
    private String up;
    private Set<String> uconds;
    private ConditionTest uquery;
    private boolean uhidden;
    private String ublockmessage;
    private String down;
    private Set<String> dconds;
    private ConditionTest dquery;
    private boolean dhidden;
    private String dblockmessage;

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

    public ConditionTest getNQuery() { return this.nquery;  }

    public ConditionTest getSQuery() { return this.squery; }

    public ConditionTest getEQuery() { return this.equery; }

    public ConditionTest getWQuery() { return this.wquery; }

    public ConditionTest getUQuery() { return this.uquery; }

    public ConditionTest getDQuery() { return this.dquery; }

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

    public String getNorthBlockMessage() { return this.nblockmessage;  }

    public String getSouthBlockMessage() { return this.sblockmessage; }

    public String getEastBlockMessage() { return this.eblockmessage; }

    public String getWestBlockMessage() { return this.wblockmessage; }

    public String getUpBlockMessage() { return this.ublockmessage; }

    public String getDownBlockMessage() { return this.dblockmessage; }

    public String getDirBlockMessage(Direction dir) {
        switch (dir) {
            case NORTH: return getNorthBlockMessage();
            case SOUTH: return getSouthBlockMessage();
            case EAST: return getEastBlockMessage();
            case WEST: return getWestBlockMessage();
            case UP: return getUpBlockMessage();
            case DOWN: return getDownBlockMessage();
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

    public void setNQuery(ConditionTest query) { this.nquery = query; }

    public void setSQuery(ConditionTest query) { this.squery = query; }

    public void setEQuery(ConditionTest query) { this.equery = query; }

    public void setWQuery(ConditionTest query) { this.wquery = query; }

    public void setUQuery(ConditionTest query) { this.uquery = query; }

    public void setDQuery(ConditionTest query) { this.dquery = query; }

    public void setNorthBlockMessage(String message) { this.nblockmessage = message; }

    public void setSouthBlockMessage(String message) { this.sblockmessage = message; }

    public void setEastBlockMessage(String message) { this.eblockmessage = message; }

    public void setWestBlockMessage(String message) { this.wblockmessage = message; }

    public void setUpBlockMessage(String message) { this.ublockmessage = message; }

    public void setDownBlockMessage(String message) { this.dblockmessage = message; }

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

    public boolean isNhidden() { return this.nhidden; }

    public void setNhidden(boolean hidden) { this.nhidden = hidden; }

    public boolean isShidden() { return this.shidden; }

    public void setShidden(boolean hidden) { this.shidden = hidden; }

    public boolean isEhidden() { return this.ehidden; }

    public void setEhidden(boolean hidden) { this.ehidden = hidden; }

    public boolean isWhidden() { return this.whidden; }

    public void setWhidden(boolean hidden) { this.whidden = hidden; }

    public boolean isUhidden() { return this.uhidden; }

    public void setUhidden(boolean hidden) { this.uhidden = hidden; }

    public boolean isDhidden() { return this.dhidden; }

    public void setDhidden(boolean hidden) { this.dhidden = hidden; }
}

