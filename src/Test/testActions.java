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


public class testActions {

    static {
        try {
            Main.init("testActions.txt", false);
        } catch (IOException e) {
            e.printStackTrace(System.err);
        }
    }

    private static CommandConstructor commandConstructor = new CommandConstructor();

    @Test
    public void testMoveNorth() {
        GameController.getPlayer().movePlayer((GameRoom)GameState.getGameObject("CENTREROOM"));
        commandConstructor.setAllowedObjects(GameController.getAllowedObjects());
        commandConstructor.setVerbSynonyms(GameController.getVerbSynonyms());
        commandConstructor.processInput("Move North");
        ExecuteCommand.executeAction();

        Assert.assertEquals(GameController.getPlayer().getLocation().getId(), "NORTHROOM");
    }

    @Test
    public void testCantMoveSouth() {
        GameController.getPlayer().movePlayer((GameRoom)GameState.getGameObject("CENTREROOM"));
        commandConstructor.setAllowedObjects(GameController.getAllowedObjects());
        commandConstructor.setVerbSynonyms(GameController.getVerbSynonyms());
        commandConstructor.processInput("Move South");
        ExecuteCommand.executeAction();

        Assert.assertEquals(GameController.getPlayer().getLocation().getId(), "CENTREROOM");
    }

    @Test
    public void testMoveSouth() {
        GameController.getPlayer().movePlayer((GameRoom)GameState.getGameObject("CENTREROOM"));
        GameState.getFlag("_SOUTHACCESS").set();
        commandConstructor.setAllowedObjects(GameController.getAllowedObjects());
        commandConstructor.setVerbSynonyms(GameController.getVerbSynonyms());
        commandConstructor.processInput("Move South");
        ExecuteCommand.executeAction();

        Assert.assertEquals(GameController.getPlayer().getLocation().getId(), "SOUTHROOM");
    }

    @Test
    public void testMoveEast() {
        GameController.getPlayer().movePlayer((GameRoom)GameState.getGameObject("CENTREROOM"));
        GameState.getFlag("_SOUTHACCESS").unset();

        commandConstructor.setAllowedObjects(GameController.getAllowedObjects());
        commandConstructor.setVerbSynonyms(GameController.getVerbSynonyms());
        commandConstructor.processInput("Move East");
        ExecuteCommand.executeAction();

        Assert.assertEquals(GameController.getPlayer().getLocation().getId(), "EASTROOM");
    }

    @Test
    public void testCantMoveWest() {
        GameController.getPlayer().movePlayer((GameRoom)GameState.getGameObject("CENTREROOM"));
        GameState.getFlag("_WESTACCESS1").unset();
        GameState.getFlag("_WESTACCESS2").unset();

        commandConstructor.setAllowedObjects(GameController.getAllowedObjects());
        commandConstructor.setVerbSynonyms(GameController.getVerbSynonyms());
        commandConstructor.processInput("Move West");
        ExecuteCommand.executeAction();

        Assert.assertEquals(GameController.getPlayer().getLocation().getId(), "CENTREROOM");
    }

    @Test
    public void testStillCantMoveWest() {
        GameController.getPlayer().movePlayer((GameRoom)GameState.getGameObject("CENTREROOM"));
        GameState.getFlag("_WESTACCESS1").set();
        GameState.getFlag("_WESTACCESS2").unset();

        commandConstructor.setAllowedObjects(GameController.getAllowedObjects());
        commandConstructor.setVerbSynonyms(GameController.getVerbSynonyms());
        commandConstructor.processInput("Move West");
        ExecuteCommand.executeAction();

        Assert.assertEquals(GameController.getPlayer().getLocation().getId(), "CENTREROOM");

        GameState.getFlag("_WESTACCESS1").unset();
    }

    @Test
    public void testMoveWest() {
        GameController.getPlayer().movePlayer((GameRoom)GameState.getGameObject("CENTREROOM"));
        GameState.getFlag("_WESTACCESS1").set();
        GameState.getFlag("_WESTACCESS2").set();
        commandConstructor.setAllowedObjects(GameController.getAllowedObjects());
        commandConstructor.setVerbSynonyms(GameController.getVerbSynonyms());
        commandConstructor.processInput("Move West");
        ExecuteCommand.executeAction();

        Assert.assertEquals(GameController.getPlayer().getLocation().getId(), "WESTROOM");

        GameState.getFlag("_WESTACCESS1").unset();
        GameState.getFlag("_WESTACCESS2").unset();
    }

    @Test
    public void testMoveUp() {
        GameController.getPlayer().movePlayer((GameRoom)GameState.getGameObject("CENTREROOM"));
        commandConstructor.setAllowedObjects(GameController.getAllowedObjects());
        commandConstructor.setVerbSynonyms(GameController.getVerbSynonyms());
        commandConstructor.processInput("Go Up");
        ExecuteCommand.executeAction();

        Assert.assertEquals(GameController.getPlayer().getLocation().getId(), "UPROOM");
    }

    @Test
    public void testMoveDown() {
        GameController.getPlayer().movePlayer((GameRoom)GameState.getGameObject("CENTREROOM"));
        commandConstructor.setAllowedObjects(GameController.getAllowedObjects());
        commandConstructor.setVerbSynonyms(GameController.getVerbSynonyms());
        commandConstructor.processInput("Go Down");
        ExecuteCommand.executeAction();

        Assert.assertEquals(GameController.getPlayer().getLocation().getId(), "DOWNROOM");
    }
}
