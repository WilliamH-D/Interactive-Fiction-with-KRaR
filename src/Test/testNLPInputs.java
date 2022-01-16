package Test;

import Game.GameController;
import ProcessInput.CommandConstructor;
import ProcessInput.NLPPipeline;
import SimpleEngine.GameObject;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;


public class testNLPInputs {

    static {
        // Instantiate the Game Controller
        GameController.instantiateGameController();
        // Initialise the NLP pipeline
        NLPPipeline.init();
    }

    static CommandConstructor commandConstructor = new CommandConstructor();

    public static String getCorrectedVerb(Map<String, String> synonyms) {
        String correctedVerb = synonyms.get(GameController.getPRSA().toLowerCase());
        if (correctedVerb == null) { return null; }
        else { return correctedVerb.toUpperCase(); }
    }

    @Test
    public void testInputMoveNorth() {
        // Create synonyms map
        Map<String, String> synonyms = new TreeMap<>();
        synonyms.put("move", "move");

        // Create interactable objects list
        ArrayList<GameObject> objects = new ArrayList<>();
        objects.add(GameController.northObj());

        testNLPInputs.commandConstructor.setVerbSynonyms(synonyms);
        testNLPInputs.commandConstructor.setAllowedObjects(objects);
        testNLPInputs.commandConstructor.processInput("move north");

        Assert.assertEquals(GameController.getPRSA(), "MOVE");
        Assert.assertEquals(GameController.getPRSO().getId(), "NORTH");
        Assert.assertNull(GameController.getPRSI());
    }

    @Test
    public void testInputWalkSouth() {
        // Create synonyms map
        Map<String, String> synonyms = new TreeMap<>();
        synonyms.put("move", "move");
        synonyms.put("walk", "move");

        // Create interactable objects list
        ArrayList<GameObject> objects = new ArrayList<>();
        objects.add(GameController.southObj());

        testNLPInputs.commandConstructor.setVerbSynonyms(synonyms);
        testNLPInputs.commandConstructor.setAllowedObjects(objects);
        testNLPInputs.commandConstructor.processInput("walk south");

        Assert.assertEquals(getCorrectedVerb(synonyms), "MOVE");
        Assert.assertEquals(GameController.getPRSO().getId(), "SOUTH");
        Assert.assertNull(GameController.getPRSI());
    }

    @Test
    public void testInputTakeSmallBox() {
        // Create synonyms map
        Map<String, String> synonyms = new TreeMap<>();
        synonyms.put("pick up", "take");
        synonyms.put("take", "take");
        synonyms.put("obtain", "take");
        synonyms.put("get", "take");

        // Create interactable objects list
        ArrayList<GameObject> objects = new ArrayList<>();
        GameObject smallbox = new GameObject("SMALLBOX");
        smallbox.setName("small box");
        objects.add(smallbox);

        testNLPInputs.commandConstructor.setVerbSynonyms(synonyms);
        testNLPInputs.commandConstructor.setAllowedObjects(objects);
        testNLPInputs.commandConstructor.processInput("take small box");

        Assert.assertEquals(getCorrectedVerb(synonyms), "TAKE");
        Assert.assertEquals(GameController.getPRSO().getId(), "SMALLBOX");
        Assert.assertNull(GameController.getPRSI());
    }

    @Test
    public void testInputClimbUp() {
        // Create synonyms map
        Map<String, String> synonyms = new TreeMap<>();
        synonyms.put("pick up", "take");
        synonyms.put("take", "take");
        synonyms.put("obtain", "take");
        synonyms.put("get", "take");
        synonyms.put("move", "move");
        synonyms.put("climb", "move");

        // Create interactable objects list
        ArrayList<GameObject> objects = new ArrayList<>();
        objects.add(GameController.upObj());

        testNLPInputs.commandConstructor.setVerbSynonyms(synonyms);
        testNLPInputs.commandConstructor.setAllowedObjects(objects);
        testNLPInputs.commandConstructor.processInput("climb up");

        Assert.assertEquals(getCorrectedVerb(synonyms), "MOVE");
        Assert.assertEquals(GameController.getPRSO().getId(), "UP");
        Assert.assertNull(GameController.getPRSI());
    }

    @Test
    public void testInputClimbDownTheLadder() {
        // Create synonyms map
        Map<String, String> synonyms = new TreeMap<>();
        synonyms.put("pick up", "take");
        synonyms.put("put down", "place");
        synonyms.put("place", "place");
        synonyms.put("take", "take");
        synonyms.put("obtain", "take");
        synonyms.put("get", "take");
        synonyms.put("move", "move");
        synonyms.put("climb", "move");

        // Create interactable objects list
        ArrayList<GameObject> objects = new ArrayList<>();
        GameObject ladder = new GameObject("LADDER");
        ladder.setName("ladder");
        objects.add(ladder);
        objects.add(GameController.downObj());

        testNLPInputs.commandConstructor.setVerbSynonyms(synonyms);
        testNLPInputs.commandConstructor.setAllowedObjects(objects);
        testNLPInputs.commandConstructor.processInput("climb down the ladder");

        Assert.assertEquals(getCorrectedVerb(synonyms), "MOVE");
        Assert.assertEquals(GameController.getPRSO().getId(), "LADDER");
        Assert.assertEquals(GameController.getPRSI().getId(), "DOWN");
    }

    @Test
    public void testInputPickUpTheLadder() {
        // Create synonyms map
        Map<String, String> synonyms = new TreeMap<>();
        synonyms.put("pick up", "take");
        synonyms.put("put down", "place");
        synonyms.put("place", "place");
        synonyms.put("take", "take");
        synonyms.put("obtain", "take");
        synonyms.put("get", "take");
        synonyms.put("move", "move");
        synonyms.put("climb", "move");

        // Create interactable objects list
        ArrayList<GameObject> objects = new ArrayList<>();
        GameObject ladder = new GameObject("LADDER");
        ladder.setName("ladder");
        objects.add(ladder);
        objects.add(GameController.upObj());

        testNLPInputs.commandConstructor.setVerbSynonyms(synonyms);
        testNLPInputs.commandConstructor.setAllowedObjects(objects);
        testNLPInputs.commandConstructor.processInput("pick up the ladder");

        Assert.assertEquals(getCorrectedVerb(synonyms), "TAKE");
        Assert.assertEquals(GameController.getPRSO().getId(), "LADDER");
        Assert.assertNull(GameController.getPRSI());
    }

    @Test
    public void testInputPickUpBigBox() {
        // Create synonyms map
        Map<String, String> synonyms = new TreeMap<>();
        synonyms.put("pick up", "take");
        synonyms.put("take", "take");
        synonyms.put("obtain", "take");
        synonyms.put("get", "take");

        // Create interactable objects list
        ArrayList<GameObject> objects = new ArrayList<>();
        GameObject bigbox = new GameObject("BIGBOX");
        bigbox.setName("big box");
        objects.add(bigbox);
        objects.add(GameController.upObj());

        testNLPInputs.commandConstructor.setVerbSynonyms(synonyms);
        testNLPInputs.commandConstructor.setAllowedObjects(objects);
        testNLPInputs.commandConstructor.processInput("pick up big box");

        Assert.assertEquals(getCorrectedVerb(synonyms), "TAKE");
        Assert.assertEquals(GameController.getPRSO().getId(), "BIGBOX");
        Assert.assertNull(GameController.getPRSI());
    }

    @Test
    public void testInputHitGoblinWithTheSword() {
        // Create synonyms map
        Map<String, String> synonyms = new TreeMap<>();
        synonyms.put("attack", "attack");
        synonyms.put("fight", "attack");
        synonyms.put("hit", "attack");
        synonyms.put("assault", "attack");

        // Create interactable objects list
        ArrayList<GameObject> objects = new ArrayList<>();
        GameObject sword = new GameObject("SWORD");
        sword.setName("sword");
        objects.add(sword);
        GameObject goblin = new GameObject("GOBLIN");
        goblin.setName("goblin");
        objects.add(goblin);

        testNLPInputs.commandConstructor.setVerbSynonyms(synonyms);
        testNLPInputs.commandConstructor.setAllowedObjects(objects);
        testNLPInputs.commandConstructor.processInput("hit goblin with the sword");

        Assert.assertEquals(getCorrectedVerb(synonyms), "ATTACK");
        Assert.assertEquals(GameController.getPRSO().getId(), "GOBLIN");
        Assert.assertEquals(GameController.getPRSI().getId(), "SWORD");
    }

    @Test
    public void testInputUseTheSwordToFightTheGoblin() {
        // Create synonyms map
        Map<String, String> synonyms = new TreeMap<>();
        synonyms.put("attack", "attack");
        synonyms.put("fight", "attack");
        synonyms.put("hit", "attack");
        synonyms.put("assault", "attack");

        // Create interactable objects list
        ArrayList<GameObject> objects = new ArrayList<>();
        GameObject sword = new GameObject("SWORD");
        sword.setName("sword");
        objects.add(sword);
        GameObject goblin = new GameObject("GOBLIN");
        goblin.setName("goblin");
        objects.add(goblin);

        testNLPInputs.commandConstructor.setVerbSynonyms(synonyms);
        testNLPInputs.commandConstructor.setAllowedObjects(objects);
        testNLPInputs.commandConstructor.processInput("With the sword fight the goblin");

        Assert.assertEquals(getCorrectedVerb(synonyms), "ATTACK");
        Assert.assertEquals(GameController.getPRSO().getId(), "GOBLIN");
        Assert.assertEquals(GameController.getPRSI().getId(), "SWORD");
    }

    @Test
    public void testInputPutTheSmallBoxInTheBigBox() {
        // Create synonyms map
        Map<String, String> synonyms = new TreeMap<>();
        synonyms.put("place in", "place in");
        synonyms.put("place item in item", "place in");
        synonyms.put("put item in item", "place in");
        synonyms.put("place item inside item", "place in");
        synonyms.put("put item inside item", "place in");
        synonyms.put("place", "place");
        synonyms.put("put down", "place");
        synonyms.put("drop", "place");
        synonyms.put("discard", "place");
        synonyms.put("place down", "place");

        // Create interactable objects list
        ArrayList<GameObject> objects = new ArrayList<>();
        GameObject smallbox = new GameObject("SMALLBOX");
        smallbox.setName("small box");
        objects.add(smallbox);
        GameObject bigbox = new GameObject("BIGBOX");
        bigbox.setName("big box");
        objects.add(bigbox);

        testNLPInputs.commandConstructor.setVerbSynonyms(synonyms);
        testNLPInputs.commandConstructor.setAllowedObjects(objects);
        testNLPInputs.commandConstructor.processInput("put the small box in the big box");

        Assert.assertEquals(getCorrectedVerb(synonyms), "PLACE IN");
        Assert.assertEquals(GameController.getPRSO().getId(), "SMALLBOX");
        Assert.assertEquals(GameController.getPRSI().getId(), "BIGBOX");
    }

    @Test
    public void testLookAround() {
        // Create synonyms map
        Map<String, String> synonyms = new TreeMap<>();
        synonyms.put("look around", "look around");
        synonyms.put("look at", "look around");
        synonyms.put("observe around", "look around");
        synonyms.put("look", "look");
        synonyms.put("observe", "look");

        // Create interactable objects list
        ArrayList<GameObject> objects = new ArrayList<>();
        GameObject smallbox = new GameObject("SMALLBOX");
        smallbox.setName("small box");
        objects.add(smallbox);

        testNLPInputs.commandConstructor.setVerbSynonyms(synonyms);
        testNLPInputs.commandConstructor.setAllowedObjects(objects);
        testNLPInputs.commandConstructor.processInput("look around the small box");

        Assert.assertEquals(getCorrectedVerb(synonyms), "LOOK AROUND");
        Assert.assertEquals(GameController.getPRSO().getId(), "SMALLBOX");
        Assert.assertNull(GameController.getPRSI());
    }
}
