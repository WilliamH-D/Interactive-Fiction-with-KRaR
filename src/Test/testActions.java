package Test;

import Game.GameController;
import Game.Main;
import ProcessInput.CommandConstructor;
import SimpleEngine.ExecuteCommand;
import SimpleEngine.GameRoom;
import SimpleEngine.GameState;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.Map;


public class testActions {

    static {
        try {
            Main.init("testActions.txt", false);
        } catch (IOException e) {
            e.printStackTrace(System.err);
        }
    }

    static CommandConstructor commandConstructor = new CommandConstructor();

    public static String getCorrectedVerb(Map<String, String> synonyms) {
        String correctedVerb = synonyms.get(GameController.getPRSA().toLowerCase());
        if (correctedVerb == null) { return null; }
        else { return correctedVerb.toUpperCase(); }
    }

    @Test
    public void testMoveNorth() {
        GameController.getPlayer().movePlayer((GameRoom)GameState.getGameObject("CENTREROOM"));
        Main.commandConstructor.setAllowedObjects(GameController.getAllowedObjects());
        Main.commandConstructor.setVerbSynonyms(GameController.getVerbSynonyms());
        Main.commandConstructor.processInput("Move North");
        ExecuteCommand.executeAction();

        Assert.assertEquals(GameController.getPlayer().getLocation().getId(), "NORTHROOM");
    }

    @Test
    public void testCantMoveSouth() {
        GameController.getPlayer().movePlayer((GameRoom)GameState.getGameObject("CENTREROOM"));
        Main.commandConstructor.setAllowedObjects(GameController.getAllowedObjects());
        Main.commandConstructor.setVerbSynonyms(GameController.getVerbSynonyms());
        Main.commandConstructor.processInput("Move South");
        ExecuteCommand.executeAction();

        Assert.assertEquals(GameController.getPlayer().getLocation().getId(), "CENTREROOM");
    }

    @Test
    public void testMoveSouth() {
        GameController.getPlayer().movePlayer((GameRoom)GameState.getGameObject("CENTREROOM"));
        GameState.getFlag("_SOUTHACCESS").set();
        Main.commandConstructor.setAllowedObjects(GameController.getAllowedObjects());
        Main.commandConstructor.setVerbSynonyms(GameController.getVerbSynonyms());
        Main.commandConstructor.processInput("Move South");
        ExecuteCommand.executeAction();

        Assert.assertEquals(GameController.getPlayer().getLocation().getId(), "SOUTHROOM");
    }

    @Test
    public void testMoveEast() {
        GameController.getPlayer().movePlayer((GameRoom)GameState.getGameObject("CENTREROOM"));
        GameState.getFlag("_SOUTHACCESS").unset();

        Main.commandConstructor.setAllowedObjects(GameController.getAllowedObjects());
        Main.commandConstructor.setVerbSynonyms(GameController.getVerbSynonyms());
        Main.commandConstructor.processInput("Move East");
        ExecuteCommand.executeAction();

        Assert.assertEquals(GameController.getPlayer().getLocation().getId(), "EASTROOM");
    }

    @Test
    public void testCantMoveWest() {
        GameController.getPlayer().movePlayer((GameRoom)GameState.getGameObject("CENTREROOM"));
        GameState.getFlag("_WESTACCESS1").unset();
        GameState.getFlag("_WESTACCESS2").unset();

        Main.commandConstructor.setAllowedObjects(GameController.getAllowedObjects());
        Main.commandConstructor.setVerbSynonyms(GameController.getVerbSynonyms());
        Main.commandConstructor.processInput("Move West");
        ExecuteCommand.executeAction();

        Assert.assertEquals(GameController.getPlayer().getLocation().getId(), "CENTREROOM");
    }

    @Test
    public void testStillCantMoveWest() {
        GameController.getPlayer().movePlayer((GameRoom)GameState.getGameObject("CENTREROOM"));
        GameState.getFlag("_WESTACCESS1").set();
        GameState.getFlag("_WESTACCESS2").unset();

        Main.commandConstructor.setAllowedObjects(GameController.getAllowedObjects());
        Main.commandConstructor.setVerbSynonyms(GameController.getVerbSynonyms());
        Main.commandConstructor.processInput("Move West");
        ExecuteCommand.executeAction();

        Assert.assertEquals(GameController.getPlayer().getLocation().getId(), "CENTREROOM");

        GameState.getFlag("_WESTACCESS1").unset();
    }

    @Test
    public void testMoveWest() {
        GameController.getPlayer().movePlayer((GameRoom)GameState.getGameObject("CENTREROOM"));
        GameState.getFlag("_WESTACCESS1").set();
        GameState.getFlag("_WESTACCESS2").set();
        Main.commandConstructor.setAllowedObjects(GameController.getAllowedObjects());
        Main.commandConstructor.setVerbSynonyms(GameController.getVerbSynonyms());
        Main.commandConstructor.processInput("Move West");
        ExecuteCommand.executeAction();

        Assert.assertEquals(GameController.getPlayer().getLocation().getId(), "WESTROOM");

        GameState.getFlag("_WESTACCESS1").unset();
        GameState.getFlag("_WESTACCESS2").unset();
    }

    @Test
    public void testMoveUp() {
        GameController.getPlayer().movePlayer((GameRoom)GameState.getGameObject("CENTREROOM"));
        Main.commandConstructor.setAllowedObjects(GameController.getAllowedObjects());
        Main.commandConstructor.setVerbSynonyms(GameController.getVerbSynonyms());
        Main.commandConstructor.processInput("Go Up");
        ExecuteCommand.executeAction();

        Assert.assertEquals(GameController.getPlayer().getLocation().getId(), "UPROOM");
    }

    @Test
    public void testMoveDown() {
        GameController.getPlayer().movePlayer((GameRoom)GameState.getGameObject("CENTREROOM"));
        Main.commandConstructor.setAllowedObjects(GameController.getAllowedObjects());
        Main.commandConstructor.setVerbSynonyms(GameController.getVerbSynonyms());
        Main.commandConstructor.processInput("Go Down");
        ExecuteCommand.executeAction();

        Assert.assertEquals(GameController.getPlayer().getLocation().getId(), "DOWNROOM");
    }

    @Test
    public void testFlagValueCond() {
        GameController.getPlayer().movePlayer((GameRoom)GameState.getGameObject("CENTREROOM"));
        GameState.getGameObject("TESTITEM").setParent("CENTREROOM", 0);
        GameState.getFlag("_COUNTER").set(1);
        GameState.getFlag("_CONDTAKEN").unset();

        Main.commandConstructor.setAllowedObjects(GameController.getAllowedObjects());
        Main.commandConstructor.setVerbSynonyms(GameController.getVerbSynonyms());
        Main.commandConstructor.processInput("Do the test item - testFlagValueCond");
        ExecuteCommand.executeAction();

        Assert.assertTrue(GameController.getPlayer().hasDescendant("TESTITEM").size()>0);
        Assert.assertEquals(GameState.getFlag("_CONDTAKEN").getValue(), 1);
    }

    @Test
    public void testAndFlagsCondFail() {
        GameController.getPlayer().movePlayer((GameRoom)GameState.getGameObject("CENTREROOM"));
        GameState.getGameObject("TESTITEM").setParent("CENTREROOM", 0);
        GameState.getFlag("_COUNTER").set(2);
        GameState.getFlag("_CONDTAKEN").unset();

        Main.commandConstructor.setAllowedObjects(GameController.getAllowedObjects());
        Main.commandConstructor.setVerbSynonyms(GameController.getVerbSynonyms());
        Main.commandConstructor.processInput("Do the test item - testAndFlagsCondFail");
        ExecuteCommand.executeAction();

        Assert.assertTrue(GameController.getPlayer().hasDescendant("TESTITEM").size()==0);
        Assert.assertEquals(GameState.getFlag("_CONDTAKEN").getValue(), 1);
    }

    @Test
    public void testAndFlagsCond() {
        GameController.getPlayer().movePlayer((GameRoom)GameState.getGameObject("CENTREROOM"));
        GameState.getGameObject("TESTITEM").setParent("CENTREROOM", 0);
        GameState.getFlag("_COUNTER").set(3);
        GameState.getFlag("_CONDTAKEN").unset();

        Main.commandConstructor.setAllowedObjects(GameController.getAllowedObjects());
        Main.commandConstructor.setVerbSynonyms(GameController.getVerbSynonyms());
        Main.commandConstructor.processInput("Do the test item - testAndFlagsCond");
        ExecuteCommand.executeAction();

        Assert.assertTrue(GameController.getPlayer().hasDescendant("TESTITEM").size()>0);
        Assert.assertEquals(GameState.getFlag("_CONDTAKEN").getValue(), 1);
    }

    @Test
    public void testOrFlagsCondFail() {
        GameController.getPlayer().movePlayer((GameRoom)GameState.getGameObject("CENTREROOM"));
        GameState.getGameObject("TESTITEM").setParent("CENTREROOM", 0);
        GameState.getFlag("_COUNTER").set(4);
        GameState.getFlag("_CONDTAKEN").unset();

        Main.commandConstructor.setAllowedObjects(GameController.getAllowedObjects());
        Main.commandConstructor.setVerbSynonyms(GameController.getVerbSynonyms());
        Main.commandConstructor.processInput("Do the test item - testOrFlagsCondFail");
        ExecuteCommand.executeAction();

        Assert.assertTrue(GameController.getPlayer().hasDescendant("TESTITEM").size()==0);
        Assert.assertEquals(GameState.getFlag("_CONDTAKEN").getValue(), 1);
    }

    @Test
    public void testOrFlagsCond() {
        GameController.getPlayer().movePlayer((GameRoom)GameState.getGameObject("CENTREROOM"));
        GameState.getGameObject("TESTITEM").setParent("CENTREROOM", 0);
        GameState.getFlag("_COUNTER").set(5);
        GameState.getFlag("_CONDTAKEN").unset();

        Main.commandConstructor.setAllowedObjects(GameController.getAllowedObjects());
        Main.commandConstructor.setVerbSynonyms(GameController.getVerbSynonyms());
        Main.commandConstructor.processInput("Do the test item - testOrFlagsCond");
        ExecuteCommand.executeAction();

        Assert.assertTrue(GameController.getPlayer().hasDescendant("TESTITEM").size()>0);
        Assert.assertEquals(GameState.getFlag("_CONDTAKEN").getValue(), 1);
    }

    @Test
    public void testAndPropertiesCondFail() {
        GameController.getPlayer().movePlayer((GameRoom)GameState.getGameObject("CENTREROOM"));
        GameState.getGameObject("TESTITEM").setParent("CENTREROOM", 0);
        GameState.getFlag("_COUNTER").set(6);
        GameState.getFlag("_CONDTAKEN").unset();

        Main.commandConstructor.setAllowedObjects(GameController.getAllowedObjects());
        Main.commandConstructor.setVerbSynonyms(GameController.getVerbSynonyms());
        Main.commandConstructor.processInput("Do the test item - testAndPropertiesCondFail");
        ExecuteCommand.executeAction();

        Assert.assertTrue(GameController.getPlayer().hasDescendant("TESTITEM").size()==0);
        Assert.assertEquals(GameState.getFlag("_CONDTAKEN").getValue(), 1);
    }

    @Test
    public void testAndPropertiesCond() {
        GameController.getPlayer().movePlayer((GameRoom)GameState.getGameObject("CENTREROOM"));
        GameState.getGameObject("TESTITEM").setParent("CENTREROOM", 0);
        GameState.getFlag("_COUNTER").set(7);
        GameState.getFlag("_CONDTAKEN").unset();

        Main.commandConstructor.setAllowedObjects(GameController.getAllowedObjects());
        Main.commandConstructor.setVerbSynonyms(GameController.getVerbSynonyms());
        Main.commandConstructor.processInput("Do the test item - testAndPropertiesCond");
        ExecuteCommand.executeAction();

        Assert.assertTrue(GameController.getPlayer().hasDescendant("TESTITEM").size()>0);
        Assert.assertEquals(GameState.getFlag("_CONDTAKEN").getValue(), 1);
    }

    @Test
    public void testOrPropertiesCondFail() {
        GameController.getPlayer().movePlayer((GameRoom)GameState.getGameObject("CENTREROOM"));
        GameState.getGameObject("TESTITEM").setParent("CENTREROOM", 0);
        GameState.getFlag("_COUNTER").set(8);
        GameState.getFlag("_CONDTAKEN").unset();

        Main.commandConstructor.setAllowedObjects(GameController.getAllowedObjects());
        Main.commandConstructor.setVerbSynonyms(GameController.getVerbSynonyms());
        Main.commandConstructor.processInput("Do the test item - testOrPropertiesCondFail");
        ExecuteCommand.executeAction();

        Assert.assertTrue(GameController.getPlayer().hasDescendant("TESTITEM").size()==0);
        Assert.assertEquals(GameState.getFlag("_CONDTAKEN").getValue(), 1);
    }

    @Test
    public void testOrPropertiesCond() {
        GameController.getPlayer().movePlayer((GameRoom)GameState.getGameObject("CENTREROOM"));
        GameState.getGameObject("TESTITEM").setParent("CENTREROOM", 0);
        GameState.getFlag("_COUNTER").set(9);
        GameState.getFlag("_CONDTAKEN").unset();

        Main.commandConstructor.setAllowedObjects(GameController.getAllowedObjects());
        Main.commandConstructor.setVerbSynonyms(GameController.getVerbSynonyms());
        Main.commandConstructor.processInput("Do the test item - testOrPropertiesCond");
        ExecuteCommand.executeAction();

        Assert.assertTrue(GameController.getPlayer().hasDescendant("TESTITEM").size()>0);
        Assert.assertEquals(GameState.getFlag("_CONDTAKEN").getValue(), 1);
    }

    @Test
    public void testHereCondFail() {
        GameController.getPlayer().movePlayer((GameRoom)GameState.getGameObject("CENTREROOM"));
        GameState.getGameObject("TESTITEM").setParent("CENTREROOM", 0);
        GameState.getFlag("_COUNTER").set(10);
        GameState.getFlag("_CONDTAKEN").unset();

        Main.commandConstructor.setAllowedObjects(GameController.getAllowedObjects());
        Main.commandConstructor.setVerbSynonyms(GameController.getVerbSynonyms());
        Main.commandConstructor.processInput("Do the test item - testHereCondFail");
        ExecuteCommand.executeAction();

        Assert.assertTrue(GameController.getPlayer().hasDescendant("TESTITEM").size()==0);
        Assert.assertEquals(GameState.getFlag("_CONDTAKEN").getValue(), 1);
    }

    @Test
    public void testHereCond() {
        GameController.getPlayer().movePlayer((GameRoom)GameState.getGameObject("CENTREROOM"));
        GameState.getGameObject("TESTITEM").setParent("CENTREROOM", 0);
        GameState.getFlag("_COUNTER").set(11);
        GameState.getFlag("_CONDTAKEN").unset();

        Main.commandConstructor.setAllowedObjects(GameController.getAllowedObjects());
        Main.commandConstructor.setVerbSynonyms(GameController.getVerbSynonyms());
        Main.commandConstructor.processInput("Do the test item - testHereCond");
        ExecuteCommand.executeAction();

        Assert.assertTrue(GameController.getPlayer().hasDescendant("TESTITEM").size()>0);
        Assert.assertEquals(GameState.getFlag("_CONDTAKEN").getValue(), 1);
    }

    @Test
    public void testHaveItemCondFail() {
        GameController.getPlayer().movePlayer((GameRoom)GameState.getGameObject("CENTREROOM"));
        GameState.getGameObject("TESTITEM").setParent("CENTREROOM", 0);
        GameState.getFlag("_COUNTER").set(12);
        GameState.getFlag("_CONDTAKEN").unset();

        Main.commandConstructor.setAllowedObjects(GameController.getAllowedObjects());
        Main.commandConstructor.setVerbSynonyms(GameController.getVerbSynonyms());
        Main.commandConstructor.processInput("Do the test item - testHaveItemCondFail");
        ExecuteCommand.executeAction();

        Assert.assertTrue(GameController.getPlayer().hasDescendant("TESTITEM").size()==0);
        Assert.assertEquals(GameState.getFlag("_CONDTAKEN").getValue(), 1);
    }

    @Test
    public void testHaveItemCond() {
        GameController.getPlayer().movePlayer((GameRoom)GameState.getGameObject("CENTREROOM"));
        GameState.getGameObject("TESTITEM").setParent("CENTREROOM", 0);
        GameState.getFlag("_COUNTER").set(13);
        GameState.getFlag("_CONDTAKEN").unset();

        Main.commandConstructor.setAllowedObjects(GameController.getAllowedObjects());
        Main.commandConstructor.setVerbSynonyms(GameController.getVerbSynonyms());
        Main.commandConstructor.processInput("Do the test item - testHaveItemCond");
        ExecuteCommand.executeAction();

        Assert.assertTrue(GameController.getPlayer().hasDescendant("TESTITEM").size()>0);
        Assert.assertEquals(GameState.getFlag("_CONDTAKEN").getValue(), 1);
    }

    @Test
    public void testHaveItemsCondFail() {
        GameController.getPlayer().movePlayer((GameRoom)GameState.getGameObject("CENTREROOM"));
        GameState.getGameObject("TESTITEM").setParent("CENTREROOM", 0);
        GameState.getFlag("_COUNTER").set(14);
        GameState.getFlag("_CONDTAKEN").unset();

        Main.commandConstructor.setAllowedObjects(GameController.getAllowedObjects());
        Main.commandConstructor.setVerbSynonyms(GameController.getVerbSynonyms());
        Main.commandConstructor.processInput("Do the test item - testHaveItemsCondFail");
        ExecuteCommand.executeAction();

        Assert.assertTrue(GameController.getPlayer().hasDescendant("TESTITEM").size()==0);
        Assert.assertEquals(GameState.getFlag("_CONDTAKEN").getValue(), 1);
    }

    @Test
    public void testHaveItemsCond() {
        GameController.getPlayer().movePlayer((GameRoom)GameState.getGameObject("CENTREROOM"));
        GameState.getGameObject("TESTITEM").setParent("CENTREROOM", 0);
        GameState.getFlag("_COUNTER").set(15);
        GameState.getFlag("_CONDTAKEN").unset();

        Main.commandConstructor.setAllowedObjects(GameController.getAllowedObjects());
        Main.commandConstructor.setVerbSynonyms(GameController.getVerbSynonyms());
        Main.commandConstructor.processInput("Do the test item - testHaveItemsCond");
        ExecuteCommand.executeAction();

        Assert.assertTrue(GameController.getPlayer().hasDescendant("TESTITEM").size()>0);
        Assert.assertEquals(GameState.getFlag("_CONDTAKEN").getValue(), 1);
    }
}
