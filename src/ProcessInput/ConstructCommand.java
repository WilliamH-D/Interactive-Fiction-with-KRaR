package ProcessInput;

import Game.GameController;
import SimpleEngine.GameObject;
import SimpleEngine.GameRoom;
import SimpleEngine.GameState;
import edu.stanford.nlp.ling.*;
import edu.stanford.nlp.pipeline.*;
import edu.stanford.nlp.semgraph.*;
import java.util.*;

public class ConstructCommand {

    public static Map<String, String> verbSynonyms;
    static {
        verbSynonyms = GameController.getVerbSynonyms();
    }



    public static void processInput(String userIn) {
        // Initialise command parts to null
        GameController.setPRSA(null);
        GameController.setPRSO(null);
        GameController.setPRSI(null);

        // Make the user's input upper case
        userIn = userIn.toUpperCase();

        // Set up the NLP pipeline
        CoreDocument document = new CoreDocument(userIn);
        NLPPipeline.getPipeline().annotate(document);
        CoreSentence sentence = document.sentences().get(0);
        List<String> lemmas = sentence.lemmas();
        List<String> posTags = sentence.posTags();

        // Check to see if the input matches a special instruction
        if (specialCase(lemmas)) { return; }

        // Pre-process user input to extract any direct and indirect object (replacing them with 'item1' and 'item2')
        GameObject[] rets = new GameObject[2];
        String preprocessed = preprocess(lemmas, posTags, rets);

        // Create a new annotated pipeline for the pre-processed input
        CoreDocument preprocessedDocument = new CoreDocument(preprocessed);
        NLPPipeline.getPipeline().annotate(preprocessedDocument);
        sentence = preprocessedDocument.sentences().get(0);
        lemmas = sentence.lemmas();

        // Give the game controller access to the lemmas (words)
        GameController.setLemmas(lemmas);

        // Find the main verb of the input
        for (String verb : verbSynonyms.keySet()) {
            String[] parts = verb.toLowerCase().split(" ");
            if (parts.length == 1 && lemmas.contains(verb)) {
                GameController.setPRSA(verb);
                break;
            }
            else {
                // Verb has multiple parts
                boolean breakLoop = false;
                for (int i = 0; i < lemmas.size() - parts.length + 1; i++) {
                    if (lemmas.get(i).equals(parts[0])) {
                        boolean match = true;
                        for (int j = 1; j < parts.length; j++) {
                            if (!lemmas.get(i+j).equals(parts[j])) {
                                match = false;
                            }
                        }
                        if (match) {
                            // Verb found
                            GameController.setPRSA(verb);
                            breakLoop = true;
                        }
                    }
                }
                if (breakLoop) {
                    break;
                }
            }
        }

        // Try non-command verbs if they exist
        if (GameController.getPRSA() == null) {
            for (int i=0; i<posTags.size(); i++) {
                if (posTags.get(i).equals("VB") || posTags.get(i).equals("NNP")) {
                    if (!lemmas.get(i).equals("item1") && !lemmas.get(i).equals("item2")) {
                        StringBuilder verb = new StringBuilder(lemmas.get(i));
                        for (int j = i + 1; j < posTags.size(); j++) {
                            if (!posTags.get(j).equals("RB")) {
                                break;
                            } else {
                                verb.append(" ").append(lemmas.get(j));
                            }
                        }
                        GameController.setPRSA(verb.toString());
                    }
                    break;
                }
            }
        }

        // Find the inputs
        int numArgs = 0;
        if (lemmas.contains("item1")) { numArgs++; }
        if (lemmas.contains("item2")) { numArgs++; }

        // Only inspect dependency parse if there are two arguments (determine which is direct and which is indirect)
        if (numArgs == 2) {
            SemanticGraph dependencyParse = sentence.dependencyParse();

            boolean found = false;
            boolean item1First = false;
            IndexedWord root = dependencyParse.getFirstRoot();
            ArrayList<IndexedWord> toVisit = new ArrayList<>(List.of(root));
            while (!found) {
                IndexedWord curr = toVisit.remove(0);
                if (curr.lemma().equals("item1")) {
                    found = true;
                    item1First = true;
                }
                if (curr.lemma().equals("item2")) {
                    found = true;
                }
                toVisit.addAll(dependencyParse.getChildList(curr));
            }
            if (item1First) {
                GameController.setPRSO(rets[0]);
                GameController.setPRSI(rets[1]);
            }
            else {
                GameController.setPRSO(rets[1]);
                GameController.setPRSI(rets[0]);
            }
        }
        else {
            if (numArgs == 1) { GameController.setPRSO(rets[0]); }
        }
    }

    public static String preprocess(List<String> lemmas, List<String> posTags, GameObject[] rets) {
        // Pre-process the users input and replace direct/indirect object with item1/item2
        System.out.println("Lemmas: " + lemmas);
        System.out.println("PosTags: " + posTags);
        ArrayList<LemmaPOS> tokens = new ArrayList<>();
        for (int i = 0; i < lemmas.size(); i++) {
            tokens.add(new LemmaPOS(lemmas.get(i), posTags.get(i)));
        }

        HashMap<String, String> objSynonyms = getObjSynonyms();
        ArrayList<GameObject> objects = getAllowedObjects();
        ArrayList<String[]> matchedObjects = new ArrayList<>();
        ArrayList<Integer> matchedIndxs = new ArrayList<>();

        int count = 0;
        for (GameObject obj : objects) {

            CoreDocument objName = new CoreDocument(obj.getName().toUpperCase());
            NLPPipeline.getPipeline().annotate(objName);
            CoreSentence sentence = objName.sentences().get(0);
            List<String> nameLemmas = sentence.lemmas();

            String[] parts = nameLemmas.toArray(new String[0]);
            //System.out.println();
            //System.out.println("PARTS: " + Arrays.toString(parts));
            for (int i = 0; i < tokens.size(); i++) {
                if (i + parts.length <= tokens.size()) {
                    boolean match = true;
                    for (int j = 0; j < parts.length; j++) {
                        if (posTags.get(i+j).equals("NN")) {
                            match = false;
                            continue;
                        }
                        if (objSynonyms.containsKey(tokens.get(i+j).getLemma().toUpperCase())) {
                            if (!objSynonyms.get(tokens.get(i+j).getLemma().toUpperCase()).equals(parts[j].toUpperCase())) {
                                match = false;
                            }
                        }
                        else if (!tokens.get(i+j).getLemma().toUpperCase().equals(parts[j].toUpperCase())) {
                            //System.out.println("LEMMA: " + tokens.get(i+j).getLemma().toUpperCase() + ", PART: " + parts[j].toUpperCase());
                            match = false;
                        }
                        else {
                            //System.out.println("MATCH!!! LEMMA: " + tokens.get(i+j).getLemma().toUpperCase() + ", PART: " + parts[j].toUpperCase());
                        }
                    }
                    if (match) {
                        //System.out.println("MATCH ADDED TO RETS");
                        rets[count] = obj;
                        count++;
                        matchedObjects.add(parts);
                        matchedIndxs.add(i);
                    }
                }
            }
        }

        ArrayList<Integer> removeStart = new ArrayList<>();
        ArrayList<Integer> removeEnd = new ArrayList<>();
        for (int i = 0; i < matchedObjects.size(); i++) {
            int idx = matchedIndxs.get(i);
            if (idx > 0 && tokens.get(idx-1).getPos().equals("DT")) { removeStart.add(idx-1); }
            else { removeStart.add(idx); }
            removeEnd.add(idx + matchedObjects.get(i).length - 1);
        }

        StringBuilder processedInput = new StringBuilder();
        boolean inRemoveRegion = false;
        int itemCounter = 1;
        for (int i = 0; i < lemmas.size(); i++) {
            if (removeStart.contains(i)) {
                inRemoveRegion = true;
                processedInput.append(" item").append(itemCounter);
                itemCounter++;
            }
            if (!inRemoveRegion) {
                processedInput.append(" ").append(lemmas.get(i));
            }
            if (removeEnd.contains(i)) { inRemoveRegion = false; }
        }
        processedInput.delete(0, 1);
        System.out.println("Pre-processed: " + processedInput.toString());
        return processedInput.toString();
    }

    // Check for special cases (e.g. input = "north")
    private static boolean specialCase(List<String> lemmas) {
        if (lemmas.size() == 1) {
            String l = lemmas.get(0).toUpperCase();
            if (l.equals("NORTH") || l.equals("N")) { GameController.setPRSO(GameController.northObj()); GameController.setPRSA("move"); return true; }
            if (l.equals("SOUTH") || l.equals("S")) { GameController.setPRSO(GameController.southObj()); GameController.setPRSA("move"); return true; }
            if (l.equals("EAST") || l.equals("E")) { GameController.setPRSO(GameController.eastObj()); GameController.setPRSA("move"); return true; }
            if (l.equals("WEST") || l.equals("W")) { GameController.setPRSO(GameController.westObj()); GameController.setPRSA("move"); return true; }
            if (l.equals("UP") || l.equals("U")) { GameController.setPRSO(GameController.upObj()); GameController.setPRSA("move"); return true; }
            if (l.equals("DOWN") || l.equals("D")) { GameController.setPRSO(GameController.downObj()); GameController.setPRSA("move"); return true; }
        }
        return false;
    }

    private static HashMap<String, String> getObjSynonyms() {
        //Todo: Generate automatically
        HashMap<String, String> synonyms = new HashMap<>();
        return synonyms;
    }

    // Return a list of all Game Objects that can be referenced by the player in their current location
    private static ArrayList<GameObject> getAllowedObjects() {
        ArrayList<GameObject> objects = new ArrayList<>();
        objects.add(GameController.northObj());
        objects.add(GameController.southObj());
        objects.add(GameController.eastObj());
        objects.add(GameController.westObj());
        objects.add(GameController.upObj());
        objects.add(GameController.downObj());

        GameRoom currLocation = GameController.getPlayer().getLocation();
        //System.out.println("CURRENT LOCATION: " + currLocation.getId());

        // Perform a depth first search on the game tree using the current location as the root
        Stack<GameObject> stack = new Stack<>();
        stack.push(currLocation);
        while (!stack.empty()) {
            GameObject obj = stack.pop();
            if (!obj.equals(GameController.getPlayer()) && !obj.equals(currLocation)) {
                objects.add(obj);
            }
            for (String child : obj.getChildren()) {
                //System.out.println("PUSHING CHILD <" + child + "> OF <" + obj.getId() + ">");
                stack.push(GameState.getGameObject(child));
            }
        }

        if (currLocation.getNorth() != null) {
            objects.add(GameState.getGameObject(currLocation.getNorth()));
        }
        if (currLocation.getSouth() != null) {
            objects.add(GameState.getGameObject(currLocation.getSouth()));
        }
        if (currLocation.getEast() != null) {
            objects.add(GameState.getGameObject(currLocation.getEast()));
        }
        if (currLocation.getWest() != null) {
            objects.add(GameState.getGameObject(currLocation.getWest()));
        }
        if (currLocation.getUp() != null) {
            objects.add(GameState.getGameObject(currLocation.getUp()));
        }
        if (currLocation.getDown() != null) {
            objects.add(GameState.getGameObject(currLocation.getDown()));
        }

        /*System.out.println("///////////////");
        System.out.println("OBJECTS:");
        for (GameObject object : objects) {
            System.out.println(object.getId());
        }
        System.out.println("///////////////");*/

        return objects;
    }
}
