package Game;

import ProcessInput.ConstructCommand;
import ProcessInput.ExecuteCommand;
import ProcessInput.NLPPipeline;
import ProcessInput.StoryCompiler;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static boolean continueLooping = false;

    // Initialise the game ready for running
    // If initialisation fails, print the stack trace and safely exit
    public static void main(String[] args) {
        try {
            init();
        } catch (IOException e) {
            e.printStackTrace(System.err);
            return;
        }

        // Until something sets continueLooping to false, execute the game loop
        continueLooping = true;
        while (continueLooping) {
            loop();
        }
    }

    private static void init() throws IOException {
        // Instantiate the Game Controller
        GameController.instantiateGameController();

        // Compile the game file
        StoryCompiler.get().compile("D:\\Documents\\University\\Part II Project\\Interactive Fiction with KRaR\\src\\ProcessInput\\testStory.txt");

        // Initialise the NLP pipeline
        NLPPipeline.init();

        // Print a starting message
        System.out.println();
        System.out.println("==============================================================");
        System.out.println("                          START                               ");
        System.out.println("==============================================================");
        System.out.println();
        GameController.describeLocation();
        System.out.println();
    }

    private static void loop() {
        // Get a user input
        Scanner myObj = new Scanner(System.in);
        System.out.print("INPUT: ");
        String userInput = myObj.nextLine();
        System.out.println();

        // Process the user's input and update the game state (via executeAction())
        ConstructCommand.processInput(userInput);
        ExecuteCommand.executeAction();
        System.out.println();
    }
}
