package Game;

import EnhancedEngine.EnhancedExecuteCommand;
import EnhancedEngine.KnowledgeBase;
import ProcessInput.CommandConstructor;
import SimpleEngine.ExecuteCommand;
import ProcessInput.NLPPipeline;
import ProcessInput.StoryCompiler;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    static boolean continueLooping = false;
    private static CommandConstructor commandConstructor;

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
        System.out.println("Exiting game.");
    }

    private static void init() throws IOException {
        // Instantiate the Game Controller
        GameController.instantiateGameController();
        GameController.useEnhancedEngine();

        // Compile the game file
        StoryCompiler.get().compile("D:\\Documents\\University\\Part II Project\\Interactive Fiction with KRaR\\src\\ProcessInput\\boxesStory.txt");

        // Print knowledge base -- FOR DEBUGGING PURPOSES
        KnowledgeBase.getInstance().printKB();
        KnowledgeBase.getInstance().setDebug(true);
        EnhancedExecuteCommand.initKB();

        // Initialise the NLP pipeline
        NLPPipeline.init();

        // Create the Command Constructor
        Main.commandConstructor = new CommandConstructor();

        // Print a starting message
        System.out.println();
        System.out.println("==============================================================");
        System.out.println("                          START                               ");
        System.out.println("==============================================================");
        System.out.println();
        GameController.describeLocation();
    }

    private static void loop() {
        // Get a user input
        System.out.println();
        Scanner myObj = new Scanner(System.in);
        System.out.print("INPUT: ");
        String userInput = myObj.nextLine();
        System.out.println();

        // Process the user's input and update the game state (via executeAction())
        Main.commandConstructor.setAllowedObjects(GameController.getAllowedObjects());
        Main.commandConstructor.setVerbSynonyms(GameController.getVerbSynonyms());
        Main.commandConstructor.processInput(userInput);
        ExecuteCommand.executeAction();
        KnowledgeBase.getInstance().printKB();
    }

    public static void quitGame() {
        continueLooping = false;
    }
}
