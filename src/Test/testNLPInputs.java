package Test;

import Game.GameController;
import ProcessInput.ConstructCommand;
import ProcessInput.NLPPipeline;
import org.junit.Assert;
import org.junit.Test;



public class testNLPInputs {

    static {
        // Instantiate the Game Controller
        GameController.instantiateGameController();
        // Initialise the NLP pipeline
        NLPPipeline.init();
    }

    @Test
    public void testInput() {
        ConstructCommand.processInput("move north");
        Assert.assertEquals(GameController.getPRSA(), "move");
    }
}
