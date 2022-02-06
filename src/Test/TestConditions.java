package Test;

import Game.GameController;
import Game.Main;
import Logging.DebugLogger;
import ProcessInput.CommandConstructor;
import SimpleEngine.ExecuteCommand;
import SimpleEngine.GameRoom;
import SimpleEngine.GameState;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;


public class TestConditions {

    static {
        DebugLogger.getInstance().stopLogging();
        try {
            Main.init("testActions.txt", false);
        } catch (IOException e) {
            e.printStackTrace(System.err);
        }
    }

    private static CommandConstructor commandConstructor = new CommandConstructor();

    @Test
    public void testFlagValueCond() {
        GameController.getPlayer().movePlayer((GameRoom)GameState.getGameObject("CENTREROOM"));
        GameState.getGameObject("TESTITEM").setParent("CENTREROOM", 0);
        GameState.getFlag("_COUNTER").set(1);
        GameState.getFlag("_CONDTAKEN").unset();

        commandConstructor.setAllowedObjects(GameController.getAllowedObjects());
        commandConstructor.setVerbSynonyms(GameController.getVerbSynonyms());
        commandConstructor.processInput("Do the test item - testFlagValueCond");
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

        commandConstructor.setAllowedObjects(GameController.getAllowedObjects());
        commandConstructor.setVerbSynonyms(GameController.getVerbSynonyms());
        commandConstructor.processInput("Do the test item - testAndFlagsCondFail");
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

        commandConstructor.setAllowedObjects(GameController.getAllowedObjects());
        commandConstructor.setVerbSynonyms(GameController.getVerbSynonyms());
        commandConstructor.processInput("Do the test item - testAndFlagsCond");
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

        commandConstructor.setAllowedObjects(GameController.getAllowedObjects());
        commandConstructor.setVerbSynonyms(GameController.getVerbSynonyms());
        commandConstructor.processInput("Do the test item - testOrFlagsCondFail");
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

        commandConstructor.setAllowedObjects(GameController.getAllowedObjects());
        commandConstructor.setVerbSynonyms(GameController.getVerbSynonyms());
        commandConstructor.processInput("Do the test item - testOrFlagsCond");
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

        commandConstructor.setAllowedObjects(GameController.getAllowedObjects());
        commandConstructor.setVerbSynonyms(GameController.getVerbSynonyms());
        commandConstructor.processInput("Do the test item - testAndPropertiesCondFail");
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

        commandConstructor.setAllowedObjects(GameController.getAllowedObjects());
        commandConstructor.setVerbSynonyms(GameController.getVerbSynonyms());
        commandConstructor.processInput("Do the test item - testAndPropertiesCond");
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

        commandConstructor.setAllowedObjects(GameController.getAllowedObjects());
        commandConstructor.setVerbSynonyms(GameController.getVerbSynonyms());
        commandConstructor.processInput("Do the test item - testOrPropertiesCondFail");
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

        commandConstructor.setAllowedObjects(GameController.getAllowedObjects());
        commandConstructor.setVerbSynonyms(GameController.getVerbSynonyms());
        commandConstructor.processInput("Do the test item - testOrPropertiesCond");
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

        commandConstructor.setAllowedObjects(GameController.getAllowedObjects());
        commandConstructor.setVerbSynonyms(GameController.getVerbSynonyms());
        commandConstructor.processInput("Do the test item - testHereCondFail");
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

        commandConstructor.setAllowedObjects(GameController.getAllowedObjects());
        commandConstructor.setVerbSynonyms(GameController.getVerbSynonyms());
        commandConstructor.processInput("Do the test item - testHereCond");
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

        commandConstructor.setAllowedObjects(GameController.getAllowedObjects());
        commandConstructor.setVerbSynonyms(GameController.getVerbSynonyms());
        commandConstructor.processInput("Do the test item - testHaveItemCondFail");
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

        commandConstructor.setAllowedObjects(GameController.getAllowedObjects());
        commandConstructor.setVerbSynonyms(GameController.getVerbSynonyms());
        commandConstructor.processInput("Do the test item - testHaveItemCond");
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

        commandConstructor.setAllowedObjects(GameController.getAllowedObjects());
        commandConstructor.setVerbSynonyms(GameController.getVerbSynonyms());
        commandConstructor.processInput("Do the test item - testHaveItemsCondFail");
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

        commandConstructor.setAllowedObjects(GameController.getAllowedObjects());
        commandConstructor.setVerbSynonyms(GameController.getVerbSynonyms());
        commandConstructor.processInput("Do the test item - testHaveItemsCond");
        ExecuteCommand.executeAction();

        Assert.assertTrue(GameController.getPlayer().hasDescendant("TESTITEM").size()>0);
        Assert.assertEquals(GameState.getFlag("_CONDTAKEN").getValue(), 1);
    }

    @Test
    public void testEqualsCondValueFail() {
        GameController.getPlayer().movePlayer((GameRoom)GameState.getGameObject("CENTREROOM"));
        GameState.getGameObject("TESTITEM").setParent("CENTREROOM", 0);
        GameState.getFlag("_COUNTER").set(16);
        GameState.getFlag("_CONDTAKEN").unset();

        commandConstructor.setAllowedObjects(GameController.getAllowedObjects());
        commandConstructor.setVerbSynonyms(GameController.getVerbSynonyms());
        commandConstructor.processInput("Do the test item - testEqualsCondValueFail");
        ExecuteCommand.executeAction();

        Assert.assertTrue(GameController.getPlayer().hasDescendant("TESTITEM").size()==0);
        Assert.assertEquals(GameState.getFlag("_CONDTAKEN").getValue(), 1);
    }

    @Test
    public void testEqualsCondValue() {
        GameController.getPlayer().movePlayer((GameRoom)GameState.getGameObject("CENTREROOM"));
        GameState.getGameObject("TESTITEM").setParent("CENTREROOM", 0);
        GameState.getFlag("_COUNTER").set(17);
        GameState.getFlag("_CONDTAKEN").unset();

        commandConstructor.setAllowedObjects(GameController.getAllowedObjects());
        commandConstructor.setVerbSynonyms(GameController.getVerbSynonyms());
        commandConstructor.processInput("Do the test item - testEqualsCondValue");
        ExecuteCommand.executeAction();

        Assert.assertTrue(GameController.getPlayer().hasDescendant("TESTITEM").size()>0);
        Assert.assertEquals(GameState.getFlag("_CONDTAKEN").getValue(), 1);
    }

    @Test
    public void testEqualsCondVariableFail() {
        GameController.getPlayer().movePlayer((GameRoom)GameState.getGameObject("CENTREROOM"));
        GameState.getGameObject("TESTITEM").setParent("CENTREROOM", 0);
        GameState.getFlag("_COUNTER").set(18);
        GameState.getFlag("_CONDTAKEN").unset();

        commandConstructor.setAllowedObjects(GameController.getAllowedObjects());
        commandConstructor.setVerbSynonyms(GameController.getVerbSynonyms());
        commandConstructor.processInput("Do the test item - testEqualsCondVariableFail");
        ExecuteCommand.executeAction();

        Assert.assertTrue(GameController.getPlayer().hasDescendant("TESTITEM").size()==0);
        Assert.assertEquals(GameState.getFlag("_CONDTAKEN").getValue(), 1);
    }

    @Test
    public void testEqualsCondVariable() {
        GameController.getPlayer().movePlayer((GameRoom)GameState.getGameObject("CENTREROOM"));
        GameState.getGameObject("TESTITEM").setParent("CENTREROOM", 0);
        GameState.getFlag("_COUNTER").set(19);
        GameState.getFlag("_CONDTAKEN").unset();

        commandConstructor.setAllowedObjects(GameController.getAllowedObjects());
        commandConstructor.setVerbSynonyms(GameController.getVerbSynonyms());
        commandConstructor.processInput("Do the test item - testEqualsCondVariable");
        ExecuteCommand.executeAction();

        Assert.assertTrue(GameController.getPlayer().hasDescendant("TESTITEM").size()>0);
        Assert.assertEquals(GameState.getFlag("_CONDTAKEN").getValue(), 1);
    }

    @Test
    public void testGTCondValueFail() {
        GameController.getPlayer().movePlayer((GameRoom)GameState.getGameObject("CENTREROOM"));
        GameState.getGameObject("TESTITEM").setParent("CENTREROOM", 0);
        GameState.getFlag("_COUNTER").set(20);
        GameState.getFlag("_CONDTAKEN").unset();

        commandConstructor.setAllowedObjects(GameController.getAllowedObjects());
        commandConstructor.setVerbSynonyms(GameController.getVerbSynonyms());
        commandConstructor.processInput("Do the test item - testGTCondValueFail");
        ExecuteCommand.executeAction();

        Assert.assertTrue(GameController.getPlayer().hasDescendant("TESTITEM").size()==0);
        Assert.assertEquals(GameState.getFlag("_CONDTAKEN").getValue(), 1);
    }

    @Test
    public void testGTCondValue() {
        GameController.getPlayer().movePlayer((GameRoom)GameState.getGameObject("CENTREROOM"));
        GameState.getGameObject("TESTITEM").setParent("CENTREROOM", 0);
        GameState.getFlag("_COUNTER").set(21);
        GameState.getFlag("_CONDTAKEN").unset();

        commandConstructor.setAllowedObjects(GameController.getAllowedObjects());
        commandConstructor.setVerbSynonyms(GameController.getVerbSynonyms());
        commandConstructor.processInput("Do the test item - testGTCondValue");
        ExecuteCommand.executeAction();

        Assert.assertTrue(GameController.getPlayer().hasDescendant("TESTITEM").size()>0);
        Assert.assertEquals(GameState.getFlag("_CONDTAKEN").getValue(), 1);
    }

    @Test
    public void testGTCondVariableFail() {
        GameController.getPlayer().movePlayer((GameRoom)GameState.getGameObject("CENTREROOM"));
        GameState.getGameObject("TESTITEM").setParent("CENTREROOM", 0);
        GameState.getFlag("_COUNTER").set(22);
        GameState.getFlag("_CONDTAKEN").unset();

        commandConstructor.setAllowedObjects(GameController.getAllowedObjects());
        commandConstructor.setVerbSynonyms(GameController.getVerbSynonyms());
        commandConstructor.processInput("Do the test item - testGTCondVariableFail");
        ExecuteCommand.executeAction();

        Assert.assertTrue(GameController.getPlayer().hasDescendant("TESTITEM").size()==0);
        Assert.assertEquals(GameState.getFlag("_CONDTAKEN").getValue(), 1);
    }

    @Test
    public void testGTCondVariable() {
        GameController.getPlayer().movePlayer((GameRoom)GameState.getGameObject("CENTREROOM"));
        GameState.getGameObject("TESTITEM").setParent("CENTREROOM", 0);
        GameState.getFlag("_COUNTER").set(23);
        GameState.getFlag("_CONDTAKEN").unset();

        commandConstructor.setAllowedObjects(GameController.getAllowedObjects());
        commandConstructor.setVerbSynonyms(GameController.getVerbSynonyms());
        commandConstructor.processInput("Do the test item - testGTCondVariable");
        ExecuteCommand.executeAction();

        Assert.assertTrue(GameController.getPlayer().hasDescendant("TESTITEM").size()>0);
        Assert.assertEquals(GameState.getFlag("_CONDTAKEN").getValue(), 1);
    }

    @Test
    public void testLTCondValueFail() {
        GameController.getPlayer().movePlayer((GameRoom)GameState.getGameObject("CENTREROOM"));
        GameState.getGameObject("TESTITEM").setParent("CENTREROOM", 0);
        GameState.getFlag("_COUNTER").set(24);
        GameState.getFlag("_CONDTAKEN").unset();

        commandConstructor.setAllowedObjects(GameController.getAllowedObjects());
        commandConstructor.setVerbSynonyms(GameController.getVerbSynonyms());
        commandConstructor.processInput("Do the test item - testLTCondValueFail");
        ExecuteCommand.executeAction();

        Assert.assertTrue(GameController.getPlayer().hasDescendant("TESTITEM").size()==0);
        Assert.assertEquals(GameState.getFlag("_CONDTAKEN").getValue(), 1);
    }

    @Test
    public void testLTCondValue() {
        GameController.getPlayer().movePlayer((GameRoom)GameState.getGameObject("CENTREROOM"));
        GameState.getGameObject("TESTITEM").setParent("CENTREROOM", 0);
        GameState.getFlag("_COUNTER").set(25);
        GameState.getFlag("_CONDTAKEN").unset();

        commandConstructor.setAllowedObjects(GameController.getAllowedObjects());
        commandConstructor.setVerbSynonyms(GameController.getVerbSynonyms());
        commandConstructor.processInput("Do the test item - testLTCondValue");
        ExecuteCommand.executeAction();

        Assert.assertTrue(GameController.getPlayer().hasDescendant("TESTITEM").size()>0);
        Assert.assertEquals(GameState.getFlag("_CONDTAKEN").getValue(), 1);
    }

    @Test
    public void testLTCondVariableFail() {
        GameController.getPlayer().movePlayer((GameRoom)GameState.getGameObject("CENTREROOM"));
        GameState.getGameObject("TESTITEM").setParent("CENTREROOM", 0);
        GameState.getFlag("_COUNTER").set(26);
        GameState.getFlag("_CONDTAKEN").unset();

        commandConstructor.setAllowedObjects(GameController.getAllowedObjects());
        commandConstructor.setVerbSynonyms(GameController.getVerbSynonyms());
        commandConstructor.processInput("Do the test item - testLTCondVariableFail");
        ExecuteCommand.executeAction();

        Assert.assertTrue(GameController.getPlayer().hasDescendant("TESTITEM").size()==0);
        Assert.assertEquals(GameState.getFlag("_CONDTAKEN").getValue(), 1);
    }

    @Test
    public void testLTCondVariable() {
        GameController.getPlayer().movePlayer((GameRoom)GameState.getGameObject("CENTREROOM"));
        GameState.getGameObject("TESTITEM").setParent("CENTREROOM", 0);
        GameState.getFlag("_COUNTER").set(27);
        GameState.getFlag("_CONDTAKEN").unset();

        commandConstructor.setAllowedObjects(GameController.getAllowedObjects());
        commandConstructor.setVerbSynonyms(GameController.getVerbSynonyms());
        commandConstructor.processInput("Do the test item - testLTCondVariable");
        ExecuteCommand.executeAction();

        Assert.assertTrue(GameController.getPlayer().hasDescendant("TESTITEM").size()>0);
        Assert.assertEquals(GameState.getFlag("_CONDTAKEN").getValue(), 1);
    }

    @Test
    public void testPRSICondFail() {
        GameController.getPlayer().movePlayer((GameRoom)GameState.getGameObject("CENTREROOM"));
        GameState.getGameObject("TESTITEM").setParent("CENTREROOM", 0);
        GameState.getFlag("_COUNTER").set(28);
        GameState.getFlag("_CONDTAKEN").unset();

        commandConstructor.setAllowedObjects(GameController.getAllowedObjects());
        commandConstructor.setVerbSynonyms(GameController.getVerbSynonyms());
        commandConstructor.processInput("Do the test item with dummy item 1 - testPRSICondFail");
        ExecuteCommand.executeAction();

        Assert.assertTrue(GameController.getPlayer().hasDescendant("TESTITEM").size()==0);
        Assert.assertEquals(GameState.getFlag("_CONDTAKEN").getValue(), 1);
    }

    @Test
    public void testPRSICond() {
        GameController.getPlayer().movePlayer((GameRoom)GameState.getGameObject("CENTREROOM"));
        GameState.getGameObject("TESTITEM").setParent("CENTREROOM", 0);
        GameState.getFlag("_COUNTER").set(29);
        GameState.getFlag("_CONDTAKEN").unset();

        commandConstructor.setAllowedObjects(GameController.getAllowedObjects());
        commandConstructor.setVerbSynonyms(GameController.getVerbSynonyms());
        commandConstructor.processInput("Do the test item with dummy item 1 - testPRSICond");
        ExecuteCommand.executeAction();

        Assert.assertTrue(GameController.getPlayer().hasDescendant("TESTITEM").size()>0);
        Assert.assertEquals(GameState.getFlag("_CONDTAKEN").getValue(), 1);
    }

    @Test
    public void testPRSOCondFail() {
        GameController.getPlayer().movePlayer((GameRoom)GameState.getGameObject("CENTREROOM"));
        GameState.getGameObject("TESTITEM").setParent("CENTREROOM", 0);
        GameState.getFlag("_COUNTER").set(30);
        GameState.getFlag("_CONDTAKEN").unset();

        commandConstructor.setAllowedObjects(GameController.getAllowedObjects());
        commandConstructor.setVerbSynonyms(GameController.getVerbSynonyms());
        commandConstructor.processInput("Do the test item - testPRSOCondFail");
        ExecuteCommand.executeAction();

        Assert.assertTrue(GameController.getPlayer().hasDescendant("TESTITEM").size()==0);
        Assert.assertEquals(GameState.getFlag("_CONDTAKEN").getValue(), 1);
    }

    @Test
    public void testPRSOCond() {
        GameController.getPlayer().movePlayer((GameRoom)GameState.getGameObject("CENTREROOM"));
        GameState.getGameObject("TESTITEM").setParent("CENTREROOM", 0);
        GameState.getFlag("_COUNTER").set(31);
        GameState.getFlag("_CONDTAKEN").unset();

        commandConstructor.setAllowedObjects(GameController.getAllowedObjects());
        commandConstructor.setVerbSynonyms(GameController.getVerbSynonyms());
        commandConstructor.processInput("Do the test item - testPRSOCond");
        ExecuteCommand.executeAction();

        Assert.assertTrue(GameController.getPlayer().hasDescendant("TESTITEM").size()>0);
        Assert.assertEquals(GameState.getFlag("_CONDTAKEN").getValue(), 1);
    }

    @Test
    public void testPRSACondFail() {
        GameController.getPlayer().movePlayer((GameRoom)GameState.getGameObject("CENTREROOM"));
        GameState.getGameObject("TESTITEM").setParent("CENTREROOM", 0);
        GameState.getFlag("_COUNTER").set(32);
        GameState.getFlag("_CONDTAKEN").unset();

        commandConstructor.setAllowedObjects(GameController.getAllowedObjects());
        commandConstructor.setVerbSynonyms(GameController.getVerbSynonyms());
        commandConstructor.processInput("Do the test item - testPRSACondFail");
        ExecuteCommand.executeAction();

        Assert.assertTrue(GameController.getPlayer().hasDescendant("TESTITEM").size()==0);
        Assert.assertEquals(GameState.getFlag("_CONDTAKEN").getValue(), 1);
    }

    @Test
    public void testPRSACond() {
        GameController.getPlayer().movePlayer((GameRoom)GameState.getGameObject("CENTREROOM"));
        GameState.getGameObject("TESTITEM").setParent("CENTREROOM", 0);
        GameState.getFlag("_COUNTER").set(33);
        GameState.getFlag("_CONDTAKEN").unset();

        commandConstructor.setAllowedObjects(GameController.getAllowedObjects());
        commandConstructor.setVerbSynonyms(GameController.getVerbSynonyms());
        commandConstructor.processInput("Do the test item - testPRSACond");
        ExecuteCommand.executeAction();

        Assert.assertTrue(GameController.getPlayer().hasDescendant("TESTITEM").size()>0);
        Assert.assertEquals(GameState.getFlag("_CONDTAKEN").getValue(), 1);
    }

    @Test
    public void testPRSAAndCondFail() {
        GameController.getPlayer().movePlayer((GameRoom)GameState.getGameObject("CENTREROOM"));
        GameState.getGameObject("TESTITEM").setParent("CENTREROOM", 0);
        GameState.getFlag("_COUNTER").set(34);
        GameState.getFlag("_CONDTAKEN").unset();

        commandConstructor.setAllowedObjects(GameController.getAllowedObjects());
        commandConstructor.setVerbSynonyms(GameController.getVerbSynonyms());
        commandConstructor.processInput("Look around the test item - testPRSAAndCondFail");
        ExecuteCommand.executeAction();

        Assert.assertTrue(GameController.getPlayer().hasDescendant("TESTITEM").size()==0);
        Assert.assertEquals(GameState.getFlag("_CONDTAKEN").getValue(), 1);
    }

    @Test
    public void testPRSAAndCond() {
        GameController.getPlayer().movePlayer((GameRoom)GameState.getGameObject("CENTREROOM"));
        GameState.getGameObject("TESTITEM").setParent("CENTREROOM", 0);
        GameState.getFlag("_COUNTER").set(35);
        GameState.getFlag("_CONDTAKEN").unset();

        commandConstructor.setAllowedObjects(GameController.getAllowedObjects());
        commandConstructor.setVerbSynonyms(GameController.getVerbSynonyms());
        commandConstructor.processInput("Look around the test item - testPRSAAndCond");
        ExecuteCommand.executeAction();

        Assert.assertTrue(GameController.getPlayer().hasDescendant("TESTITEM").size()>0);
        Assert.assertEquals(GameState.getFlag("_CONDTAKEN").getValue(), 1);
    }

    @Test
    public void testAndingCondsFail() {
        GameController.getPlayer().movePlayer((GameRoom)GameState.getGameObject("CENTREROOM"));
        GameState.getGameObject("TESTITEM").setParent("CENTREROOM", 0);
        GameState.getFlag("_COUNTER").set(36);
        GameState.getFlag("_CONDTAKEN").unset();
        GameState.getFlag("_TESTFLAG1").set();
        GameState.getFlag("_TESTFLAG2").set();

        commandConstructor.setAllowedObjects(GameController.getAllowedObjects());
        commandConstructor.setVerbSynonyms(GameController.getVerbSynonyms());
        commandConstructor.processInput("Do the test item - testAndingCondsFail");
        ExecuteCommand.executeAction();

        Assert.assertTrue(GameController.getPlayer().hasDescendant("TESTITEM").size()==0);
        Assert.assertEquals(GameState.getFlag("_CONDTAKEN").getValue(), 1);

        GameState.getFlag("_TESTFLAG1").unset();
        GameState.getFlag("_TESTFLAG2").unset();
    }

    @Test
    public void testAndingConds() {
        GameController.getPlayer().movePlayer((GameRoom)GameState.getGameObject("CENTREROOM"));
        GameState.getGameObject("TESTITEM").setParent("CENTREROOM", 0);
        GameState.getFlag("_COUNTER").set(37);
        GameState.getFlag("_CONDTAKEN").unset();
        GameState.getFlag("_TESTFLAG1").set();
        GameState.getFlag("_TESTFLAG2").set();

        commandConstructor.setAllowedObjects(GameController.getAllowedObjects());
        commandConstructor.setVerbSynonyms(GameController.getVerbSynonyms());
        commandConstructor.processInput("Do the test item - testAndingConds");
        ExecuteCommand.executeAction();

        Assert.assertTrue(GameController.getPlayer().hasDescendant("TESTITEM").size()>0);
        Assert.assertEquals(GameState.getFlag("_CONDTAKEN").getValue(), 1);

        GameState.getFlag("_TESTFLAG1").unset();
        GameState.getFlag("_TESTFLAG2").unset();
    }

    @Test
    public void testOringCondsFail() {
        GameController.getPlayer().movePlayer((GameRoom)GameState.getGameObject("CENTREROOM"));
        GameState.getGameObject("TESTITEM").setParent("CENTREROOM", 0);
        GameState.getFlag("_COUNTER").set(38);
        GameState.getFlag("_CONDTAKEN").unset();
        GameState.getFlag("_TESTFLAG1").set();

        commandConstructor.setAllowedObjects(GameController.getAllowedObjects());
        commandConstructor.setVerbSynonyms(GameController.getVerbSynonyms());
        commandConstructor.processInput("Do the test item - testOringCondsFail");
        ExecuteCommand.executeAction();

        Assert.assertTrue(GameController.getPlayer().hasDescendant("TESTITEM").size()==0);
        Assert.assertEquals(GameState.getFlag("_CONDTAKEN").getValue(), 1);

        GameState.getFlag("_TESTFLAG1").unset();
    }

    @Test
    public void testOringConds() {
        GameController.getPlayer().movePlayer((GameRoom)GameState.getGameObject("CENTREROOM"));
        GameState.getGameObject("TESTITEM").setParent("CENTREROOM", 0);
        GameState.getFlag("_COUNTER").set(39);
        GameState.getFlag("_CONDTAKEN").unset();
        GameState.getFlag("_TESTFLAG1").set();

        commandConstructor.setAllowedObjects(GameController.getAllowedObjects());
        commandConstructor.setVerbSynonyms(GameController.getVerbSynonyms());
        commandConstructor.processInput("Do the test item - testOringConds");
        ExecuteCommand.executeAction();

        Assert.assertTrue(GameController.getPlayer().hasDescendant("TESTITEM").size()>0);
        Assert.assertEquals(GameState.getFlag("_CONDTAKEN").getValue(), 1);
    }

    @Test
    public void testNotingCondsFail() {
        GameController.getPlayer().movePlayer((GameRoom)GameState.getGameObject("CENTREROOM"));
        GameState.getGameObject("TESTITEM").setParent("CENTREROOM", 0);
        GameState.getFlag("_COUNTER").set(40);
        GameState.getFlag("_CONDTAKEN").unset();

        commandConstructor.setAllowedObjects(GameController.getAllowedObjects());
        commandConstructor.setVerbSynonyms(GameController.getVerbSynonyms());
        commandConstructor.processInput("Do the test item - testNotingCondsFail");
        ExecuteCommand.executeAction();

        Assert.assertTrue(GameController.getPlayer().hasDescendant("TESTITEM").size()==0);
        Assert.assertEquals(GameState.getFlag("_CONDTAKEN").getValue(), 1);
    }

    @Test
    public void testNotingConds() {
        GameController.getPlayer().movePlayer((GameRoom)GameState.getGameObject("CENTREROOM"));
        GameState.getGameObject("TESTITEM").setParent("CENTREROOM", 0);
        GameState.getFlag("_COUNTER").set(41);
        GameState.getFlag("_CONDTAKEN").unset();

        commandConstructor.setAllowedObjects(GameController.getAllowedObjects());
        commandConstructor.setVerbSynonyms(GameController.getVerbSynonyms());
        commandConstructor.processInput("Do the test item - testNotingConds");
        ExecuteCommand.executeAction();

        Assert.assertTrue(GameController.getPlayer().hasDescendant("TESTITEM").size()>0);
        Assert.assertEquals(GameState.getFlag("_CONDTAKEN").getValue(), 1);
    }
}
