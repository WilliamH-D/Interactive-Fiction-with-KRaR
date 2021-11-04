package ProcessInput;

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
        verbSynonyms.put("attack", "attack");
        verbSynonyms.put("fight", "attack");
        verbSynonyms.put("strike", "attack");
        verbSynonyms.put("ambush", "attack");
        verbSynonyms.put("assault", "attack");
        verbSynonyms.put("burn", "attack");
    }

    private String userIn;

    public ConstructCommand(String userIn) {
        this.userIn = userIn.toLowerCase();
    }

    public void processInput() {
        System.out.println(this.userIn);
        // create a document object
        CoreDocument document = new CoreDocument(this.userIn);
        // annotate the document
        pipeline.annotate(document);

        CoreSentence sentence = document.sentences().get(0);
        List<String> lemmas = sentence.lemmas();
        List<String> posTags = sentence.posTags();

        String[] rets = new String[2];
        String preprocessed = preprocess(lemmas, posTags, rets);
        //System.out.println("Preprocessed: " + preprocessed);


        CoreDocument preprocessedDocument = new CoreDocument(preprocessed);
        // annotate the document
        pipeline.annotate(preprocessedDocument);

        sentence = preprocessedDocument.sentences().get(0);
        lemmas = sentence.lemmas();

        IFCommand cmd = new IFCommand();

        // Find the main verb of the input
        for (String verb : verbSynonyms.keySet()) {
            if (lemmas.contains(verb)) {
                cmd.setFunctor(verbSynonyms.get(verb));
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
                cmd.setFirstArg(new GameObject(rets[0]));
                cmd.setSecondArg(new GameObject(rets[1]));
            }
            else {
                cmd.setFirstArg(new GameObject(rets[1]));
                cmd.setSecondArg(new GameObject(rets[0]));
            }
        }
        else {
            if (numArgs == 1) { cmd.setFirstArg(new GameObject(rets[0])); }
        }

        cmd.printCommand();
        System.out.println();

    }

    public String preprocess(List<String> lemmas, List<String> posTags, String[] rets) {
        // Pre-process the users input and replace direct/indirect object with item1/item2
        ArrayList<LemmaPOS> tokens = new ArrayList<>();
        for (int i = 0; i < lemmas.size(); i++) {
            tokens.add(new LemmaPOS(lemmas.get(i), posTags.get(i)));
        }

        HashMap<String, String> objSynonyms = getObjSynonyms();
        ArrayList<String> objects = getAllowedObjects();
        ArrayList<String[]> matchedObjects = new ArrayList<>();
        ArrayList<Integer> matchedIndxs = new ArrayList<>();

        int count = 0;
        for (String obj : objects) {
            String[] parts = obj.split(" ");
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
                            if (!tokens.get(i+j).getLemma().equals(parts[j])) {
                                match = false;
                            }
                        }
                    }
                    if (match) {
                        //System.out.println("MATCH: " + obj + " at " + i);
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
                processedInput.append(" " + lemmas.get(i));
            }
            if (removeEnd.contains(i)) { inRemoveRegion = false; }
        }
        processedInput.delete(0, 1);
        return processedInput.toString();
    }

    public HashMap<String, String> getObjSynonyms() {
        HashMap<String, String> synonyms = new HashMap<>();
        synonyms.put("monster", "goblin");
        synonyms.put("goblin", "goblin");
        synonyms.put("creature", "goblin");
        synonyms.put("sword", "sword");
        synonyms.put("weapon", "sword");
        synonyms.put("blade", "sword");
        return synonyms;
    }

    public ArrayList<String> getAllowedObjects() {
        ArrayList<String> objects = new ArrayList<>();
        objects.add("green goblin");
        objects.add("red goblin");
        objects.add("rusty sword");
        objects.add("shiny sword");
        return objects;
    }

    public static void main(String[] args) {
        ConstructCommand cc = new ConstructCommand("attack the green monster with the shiny blade");
        cc.processInput();
        cc = new ConstructCommand("With the rusty   weapon, assault the red creature.");
        cc.processInput();
    }
}
