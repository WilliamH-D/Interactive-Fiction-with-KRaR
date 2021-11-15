package ProcessInput;

import Game.GameController;
import SimpleEngine.GameObject;
import com.sun.xml.bind.v2.runtime.unmarshaller.XsiNilLoader;
import edu.stanford.nlp.coref.data.CorefChain;
import edu.stanford.nlp.ling.*;
import edu.stanford.nlp.ie.util.*;
import edu.stanford.nlp.pipeline.*;
import edu.stanford.nlp.semgraph.*;
import edu.stanford.nlp.trees.*;

import java.io.OutputStream;
import java.io.PrintStream;
import java.util.*;

public class ConstructCommand {

    static StanfordCoreNLP pipeline = new NLPPipeline().getPipeline();

    public static Map<String, String> verbSynonyms;
    static {
        verbSynonyms = new HashMap<>();
        for (String verb : ExecuteCommand.getVerbs()) {
            verbSynonyms.put(verb, verb);
            System.out.println("Verb: " + verb);
        }
        System.out.println();
        /*verbSynonyms.put("attack", "attack");
        verbSynonyms.put("fight", "attack");
        verbSynonyms.put("strike", "attack");
        verbSynonyms.put("ambush", "attack");
        verbSynonyms.put("assault", "attack");
        verbSynonyms.put("burn", "attack");*/
    }

    public static void processInput(String userIn) {
        GameController.setPRSA(null);
        GameController.setPRSO(null);
        GameController.setPRSI(null);

        System.out.println(userIn);
        // create a document object
        CoreDocument document = new CoreDocument(userIn);
        // annotate the document
        pipeline.annotate(document);

        CoreSentence sentence = document.sentences().get(0);
        List<String> lemmas = sentence.lemmas();
        List<String> posTags = sentence.posTags();

        if (specialCase(lemmas)) { return; }

        GameObject[] rets = new GameObject[2];
        String preprocessed = preprocess(lemmas, posTags, rets);

        CoreDocument preprocessedDocument = new CoreDocument(preprocessed);
        // annotate the document
        pipeline.annotate(preprocessedDocument);

        sentence = preprocessedDocument.sentences().get(0);
        lemmas = sentence.lemmas();
        GameController.setLemmas(lemmas);

        // Find the main verb of the input
        for (String verb : verbSynonyms.keySet()) {
            if (lemmas.contains(verb)) {
                GameController.setPRSA(verbSynonyms.get(verb));
                break;
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
            String[] parts = obj.getId().split(" ");
            for (int i = 0; i < tokens.size(); i++) {
                if (i + parts.length <= tokens.size()) {
                    boolean match = true;
                    for (int j = 0; j < parts.length; j++) {

                        if (objSynonyms.containsKey(tokens.get(i+j).getLemma())) {
                            if (!objSynonyms.get(tokens.get(i+j).getLemma()).equals(parts[j])) {
                                match = false;
                            }
                        }
                        else {
                            if (!tokens.get(i+j).getLemma().toUpperCase().equals(parts[j])) {
                                match = false;
                            }
                        }
                    }
                    if (match) {
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
        synonyms.put("monster", "goblin");
        synonyms.put("goblin", "goblin");
        synonyms.put("creature", "goblin");
        synonyms.put("sword", "sword");
        synonyms.put("weapon", "sword");
        synonyms.put("blade", "sword");
        return synonyms;
    }

    private static ArrayList<GameObject> getAllowedObjects() {
        //Todo: Generate automatically
        ArrayList<GameObject> objects = new ArrayList<>();
        objects.add(GameController.northObj());
        objects.add(GameController.southObj());
        objects.add(GameController.eastObj());
        objects.add(GameController.westObj());
        objects.add(GameController.upObj());
        objects.add(GameController.downObj());
        /*objects.add(new GameObject("green goblin"));
        objects.add(new GameObject("red goblin"));
        objects.add(new GameObject("rusty sword"));
        objects.add(new GameObject("shiny sword"));*/
        return objects;
    }

    public static void main(String[] args) {
        GameController.instantiateGameController();
        processInput("attack the green monster with the shiny blade");
        ExecuteCommand.executeAction();
        processInput("With the rusty   weapon, attack the red creature.");
        ExecuteCommand.executeAction();
    }
}
