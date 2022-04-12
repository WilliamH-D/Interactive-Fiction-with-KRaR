package Game;

import EnhancedEngine.EnhancedExecuteCommand;
import EnhancedEngine.KnowledgeBase;
import EnhancedEngine.TurnEndChecks;
import ProcessInput.CommandConstructor;
import SimpleEngine.ExecuteCommand;
import ProcessInput.NLPPipeline;
import ProcessInput.StoryCompiler;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;;
import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;

public class Main {

    static boolean continueLooping = false;
    private static CommandConstructor commandConstructor;

    // Initialise the game ready for running
    // If initialisation fails, print the stack trace and safely exit
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, FileNotFoundException {
        if (args.length == 0 || !args[0].substring(args[0].length() - 4).equals(".txt")) {
            System.err.println("No story file argument.");
            return;
        }

        boolean useEnhanced;
        try {
            useEnhanced = args.length > 1 && args[1].equals("enhanced");
            init(args[0], useEnhanced);
        } catch (IOException e) {
            e.printStackTrace(System.err);
            return;
        }

        File readInputs = null;
        Scanner inputReader = null;
        if (useEnhanced) {
            if(args.length > 2 && args[2].substring(args[2].length() - 4).equals(".txt")) {
                readInputs = new File("src\\Test\\" + args[2]);
            }
        }
        else {
            if(args.length > 1 && args[1].substring(args[1].length() - 4).equals(".txt")) {
                readInputs = new File("src\\Test\\" + args[1]);
            }
        }
        if (readInputs != null) {
            inputReader = new Scanner(readInputs);
        }

        // Until something sets continueLooping to false, execute the game loop
        continueLooping = true;
        while (continueLooping) {
            loop(useEnhanced, readInputs, inputReader);
        }
        System.out.println("Exiting game.");
    }

    public static void init(String storyFile, boolean useEnhanced) throws IOException {

        // Instantiate the Game Controller
        GameController.instantiateGameController();
        if (useEnhanced) {
            GameController.useEnhancedEngine();
        }
        else {
            GameController.useTraditionalEngine();
        }

        // Compile the game file
        StoryCompiler.get().compile("src\\StoryFiles\\" + storyFile);

        // Print knowledge base -- FOR DEBUGGING PURPOSES
        KnowledgeBase.getInstance().printKB();
        KnowledgeBase.getInstance().setDebug(true);
        EnhancedExecuteCommand.initKB();

        // Initialise the NLP pipeline
        NLPPipeline.init();

        // Create the Command Constructor
        Main.commandConstructor = new CommandConstructor();

        //System.setErr(System.out);

        // Print a starting message
        System.out.println();
        System.out.println("==============================================================");
        System.out.println("                          START                               ");
        System.out.println("==============================================================");
        System.out.println();
        GameController.describeLocation();
    }

    private static void loop(boolean useEnhanced) {
        loop(useEnhanced, null, null);
    }

    private static void loop(boolean useEnhanced, File readInputs, Scanner inputReader) {
        // Get a user input
        System.out.println();
        String userInput;
        if (readInputs == null) {
            Scanner myObj = new Scanner(System.in);
            System.out.print("INPUT: ");
            userInput = myObj.nextLine();
        }
        else {
            if (inputReader.hasNextLine()) {
                userInput = inputReader.nextLine();
                System.out.print("INPUT: ");
                System.out.println(GameController.greenText + userInput + GameController.resetText);
            }
            else {
                quitGame();
                inputReader.close();
                return;
            }
        }
        System.out.println();

        // Process the user's input and update the game state (via executeAction())
        Main.commandConstructor.setAllowedObjects(GameController.getAllowedObjects());
        Main.commandConstructor.setVerbSynonyms(GameController.getVerbSynonyms());
        Main.commandConstructor.processInput(userInput);
        ExecuteCommand.executeAction();
        if (useEnhanced) {
            TurnEndChecks.getInstance().performChecks();
            EnhancedExecuteCommand.resetFailedQueryConds();
            EnhancedExecuteCommand.resetSkippedFailMessage();
            KnowledgeBase.getInstance().printKB();
        }
    }

    public static void quitGame() {
        continueLooping = false;
    }
}
