package ProcessInput;

import Game.GameController;
import Game.Main;
import Logging.DebugLogger;
import SimpleEngine.GameObject;
import com.sun.xml.bind.v2.runtime.unmarshaller.XsiNilLoader;
import edu.stanford.nlp.ling.*;
import edu.stanford.nlp.pipeline.*;
import edu.stanford.nlp.semgraph.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CommandConstructor {

    // Mapping of verb synonyms
    private Map<String, String> verbSynonyms;

    // List of objects that can be used for PRSO/PRSI
    private List<GameObject> allowedObjects;
    
    private DebugLogger logger = DebugLogger.getInstance();

    // Create a new command constructor
    public CommandConstructor() {}

    // Set the verb synonym table
    public void setVerbSynonyms(Map<String, String> verbSynonyms) { this.verbSynonyms = verbSynonyms; }

    // Set the accessible objects
    public void setAllowedObjects(List<GameObject> allowedObjects) { this.allowedObjects = allowedObjects; }

    // Process a user input by extracting PRSA/PRSO/PRSI
    public void processInput(String userIn) {
        userIn = userIn.replaceAll("'", " nop ");
        logger.logLine();
        logger.logRaw("======================================================================================");
        logger.logRaw("Processing user input: " + userIn);
        logger.logRaw("======================================================================================");
        logger.logLine();

        // Initialise command parts to null
        GameController.setPRSA(null);
        GameController.setPRSO(null);
        GameController.setPRSI(null);

        // Make the user's input upper case
        userIn = userIn.toUpperCase();

        // Set up the NLP pipeline
        CoreDocument document = new CoreDocument(userIn);
        NLPPipeline.getPipeline().annotate(document);
        CoreSentence sentence = document.sentences().get(0);;
        List<String> lemmas = getTokens(userIn);
        List<String> posTags = sentence.posTags();

        // Check to see if the input matches a special instruction
        if (specialCase(lemmas)) { return; }

        // Pre-process user input to extract any direct and indirect object (replacing them with 'item1' and 'item2')
        GameObject[] rets = new GameObject[2];
        String preprocessed;
        try {
            preprocessed = extractObjects(lemmas, posTags, rets);
        } catch (ConflictException e) {
            GameController.setPRSA("CONFLICT");
            return;
        }

        // Create a new annotated pipeline for the pre-processed input
        CoreDocument preprocessedDocument = new CoreDocument(preprocessed);
        NLPPipeline.getPipeline().annotate(preprocessedDocument);
        sentence = preprocessedDocument.sentences().get(0);
        lemmas = getTokens(preprocessed);
        posTags = sentence.posTags();

        // Give the game controller access to the lemmas (words)
        GameController.setLemmas(lemmas);

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

        // Try extracting the longest matching verb from the input
        extractLongestVerb(lemmas);

        // Try non-command verbs if they exist
        if (GameController.getPRSA() == null) {
            tryExtractNewVerb(lemmas, posTags);
        }
    }

    private void makeLemmasLowerCase(List<String> lemmas) {
        for (int i=0; i<lemmas.size(); i++) {
            lemmas.set(i, lemmas.get(i).toLowerCase());
        }
    }

    private void extractLongestVerb(List<String> lemmas) {

        // Replace item1 and item2 with just item so that it matches the complex patterns
        if (lemmas.contains("item1")) {
            lemmas.set(lemmas.indexOf("item1"),"item");
        }
        if (lemmas.contains("item2")) {
            lemmas.set(lemmas.indexOf("item2"),"item");
        }
        logger.logDebug("Lemmas: " + lemmas);

        makeLemmasLowerCase(lemmas);
        String[] lemmaParts = lemmas.toArray(new String[0]);

        String longestVerb = "";
        int longestLength = 0;

        // Find the main verb of the input
        for (String verb : verbSynonyms.keySet()) {
            String[] verbParts = verb.toLowerCase().split(" ");

            if (arrayContainsSubArray(lemmaParts, verbParts) > -1) {
                logger.logDebug("Verb found: " + verb);
                if (verbParts.length > longestLength) {
                    longestVerb = verb;
                    longestLength = verbParts.length;
                }
            }
        }

        if (!longestVerb.equals("")) {
            GameController.setPRSA(longestVerb.toLowerCase());
            logger.logDebug("PRSA set to: " + GameController.getPRSA());
        }
    }

    private void tryExtractNewVerb(List<String> lemmas, List<String> posTags) {
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
                    logger.logDebug("Extracted non-listed verb: " + verb.toString());
                }
                break;
            }
        }
    }

    // CoreNLP lemmaisation changes lemmas based on POS tagging, so implement custom tokenizer
    private List<String> getTokens(String input) {
        List<String> tokens = new ArrayList<>();
        StringBuilder currentToken = new StringBuilder();
        for (Character c : input.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                currentToken.append(c);
            }
            else if (!c.equals(' ')){
                if (!currentToken.toString().equals("")) {
                    tokens.add(currentToken.toString());
                    currentToken = new StringBuilder();
                }
                currentToken.append(c);
                tokens.add(currentToken.toString());
                currentToken = new StringBuilder();
            }
            else {
                if (!currentToken.toString().equals("")) {
                    tokens.add(currentToken.toString());
                    currentToken = new StringBuilder();
                }
            }
        }
        tokens.add(currentToken.toString());
        makeLemmasLowerCase(tokens);
        return tokens;
    }

    // Given two arrays, check if the larger array contains the sub array
    private int arrayContainsSubArray(String[] array, String[] subArray)
    {
        return Collections.indexOfSubList(Arrays.asList(array), Arrays.asList(subArray));
    }

    // Make sure that the object doesn't conflict with a verb (e.g. PRSA: "put down" and PRSO: DOWN)
    private boolean potentialObjectConflictsPotentialVerb(String[] lemmas, String[] objName) {
        for (String verb : verbSynonyms.keySet()) {
            List<String> verbLemmas = getTokens(verb);
            makeLemmasLowerCase(verbLemmas);
            String[] verbParts = verbLemmas.toArray(new String[0]);
            if (arrayContainsSubArray(lemmas, verbParts) > -1 && arrayContainsSubArray(verbParts, objName) > -1) {
                logger.logDebug("Verb object conflict with verb: " + verb + ", and object: " + Arrays.toString(objName));
                return true;
            }
        }
        return false;
    }

    private String extractObjects(List<String> lemmas, List<String> posTags, GameObject[] rets) throws ConflictException {
        // Pre-process the users input and replace direct/indirect object with item1/item2

        logger.logDebug("Pre-process input lemmas: " + lemmas);
        logger.logDebug("Pre-process input posTags: " + posTags);
        ArrayList<LemmaPOS> tokens = new ArrayList<>();
        for (int i = 0; i < lemmas.size(); i++) {
            if (lemmas.get(i).equals("")) { continue; }
            tokens.add(new LemmaPOS(lemmas.get(i), posTags.get(i)));
        }

        makeLemmasLowerCase(lemmas);
        String[] lemmaParts = lemmas.toArray(new String[0]);

        SynonymsAndConflicts synsAndCons = getObjSynonyms(allowedObjects);
        HashMap<String, String> objSynonyms = synsAndCons.synonyms;
        HashSet<String> conflicts = synsAndCons.conflicts;
        ArrayList<String[]> matchedObjects = new ArrayList<>();
        ArrayList<Integer> matchedIndxs = new ArrayList<>();

        int count = 0;
        boolean conflictFound = false;
        for (GameObject obj : allowedObjects) {
            boolean match = false;
            int startInd = -1;
            int maxSize = 0;
            List<String> nameLemmas = getTokens(obj.getName());
            makeLemmasLowerCase(nameLemmas);
            String[] parts = nameLemmas.toArray(new String[0]);
            String[] matchedInput = parts;

            // Find only the synonyms for this object from the synonyms map
            Map<String, String> synonyms = objSynonyms.entrySet()
                    .stream()
                    .filter(entry -> entry.getValue().equals(obj.getName().toLowerCase()))
                    .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

            for (String syn : synonyms.keySet()) {
                List<String> synLemmas = getTokens(syn);
                if (synLemmas.size() <= maxSize) { continue; }
                makeLemmasLowerCase(synLemmas);
                String[] synParts = synLemmas.toArray(new String[0]);

                int newStartInd = arrayContainsSubArray(lemmaParts, synParts);
                if (newStartInd > -1) {
                    startInd = newStartInd;
                    maxSize = synLemmas.size();
                    match = true;
                    matchedInput = synParts;
                }
            }

            // try match on conflicts
            if (!match && !conflictFound) {
                for (String conflict : conflicts) {
                    List<String> conLemmas = getTokens(conflict);
                    makeLemmasLowerCase(conLemmas);
                    String[] conParts = conLemmas.toArray(new String[0]);

                    //logger.logDebug("Check that " + Arrays.toString(lemmaParts) + " contains " + Arrays.toString(conParts));
                    conflictFound = arrayContainsSubArray(lemmaParts, conParts) > -1;
                    //logger.logDebug("conflict " + (conflictFound ? "found" : "not found"));

                    // If we find a matching synonym for this object, ignore all other synonyms
                    if (conflictFound) { break; }
                }
            }

            // A match has been found
            if (match) {
                // Make sure that the object doesn't conflict with a verb (e.g. PRSA: "put down" and PRSO: DOWN)
                if (!potentialObjectConflictsPotentialVerb(lemmaParts, parts)) {
                    matchedObjects.add(matchedInput);
                    logger.logDebug("Adding " + Arrays.toString(matchedInput) + " to matched objects");
                    matchedIndxs.add(startInd);
                    logger.logDebug("Adding " + startInd + " to matched indices");
                    if (count < 2) {
                        rets[count] = obj;
                        count++;
                    }
                    else {
                        logger.logError("MORE THAN 2 MATCHES");
                    }

                }
                else {
                    logger.logDebug(obj.getName() + " could not be extracted due to potential verb conflict");
                }
            }
        }

        // No unique objects identified, but conflict found
        if (conflictFound && count == 0) {
            throw new ConflictException();
        }

        // Remove object adjectives and descriptors such as "the"
        ArrayList<Integer> removeStart = new ArrayList<>();
        ArrayList<Integer> removeEnd = new ArrayList<>();
        for (int i = 0; i < matchedObjects.size(); i++) {
            int idx = matchedIndxs.get(i);
            int end = idx + matchedObjects.get(i).length - 1;
            // Look at preceding words
            for (int j = idx-1; j>-1; j--) {
                if ((tokens.get(j).getPos().equals("DT") || tokens.get(j).getPos().equals("JJ") || tokens.get(j).getPos().equals("RB") || tokens.get(j).getPos().equals("JJR"))) {
                    if (!GameController.getVerbSynonyms().containsValue(tokens.get(j).getLemma())) {
                        idx = j;
                    }
                    if (tokens.get(j).getLemma().equals("the")) {
                        break;
                    }
                }
                else {
                    break;
                }
            }
            removeStart.add(idx);
            removeEnd.add(end);
        }

        // Build the processed input for returning
        logger.logDebug("removeStart: " + Arrays.toString(removeStart.toArray()));
        logger.logDebug("removeEnd: " + Arrays.toString(removeEnd.toArray()));
        StringBuilder processedInput = new StringBuilder();
        boolean inRemoveRegion = false;
        boolean nextIsItem1 = removeStart.size() != 2 || removeStart.get(0) < removeStart.get(1);
        for (int i = 0; i < lemmas.size(); i++) {
            if (removeStart.contains(i)) {
                inRemoveRegion = true;
                processedInput.append(" item").append((nextIsItem1 ? "1" : "2"));
                nextIsItem1 = !nextIsItem1;
            }
            if (!inRemoveRegion) {
                processedInput.append(" ").append(lemmas.get(i));
            }
            if (removeEnd.contains(i)) { inRemoveRegion = false; }
        }
        processedInput.delete(0, 1);
        logger.logDebug("Pre-processed: " + processedInput.toString());
        return processedInput.toString();
    }

    // Check for special cases (e.g. input = "north")
    private static boolean specialCase(List<String> lemmas) {
        if (lemmas.size() == 1) {
            String l = lemmas.get(0).toUpperCase();
            if (l.equals("QUIT") || l.equals("Q")) { Main.quitGame(); GameController.setPRSA("quit"); return true;}
            if (l.equals("NORTH") || l.equals("N")) { GameController.setPRSO(GameController.northObj()); GameController.setPRSA("move"); return true; }
            if (l.equals("SOUTH") || l.equals("S")) { GameController.setPRSO(GameController.southObj()); GameController.setPRSA("move"); return true; }
            if (l.equals("EAST") || l.equals("E")) { GameController.setPRSO(GameController.eastObj()); GameController.setPRSA("move"); return true; }
            if (l.equals("WEST") || l.equals("W")) { GameController.setPRSO(GameController.westObj()); GameController.setPRSA("move"); return true; }
            if (l.equals("UP") || l.equals("U")) { GameController.setPRSO(GameController.upObj()); GameController.setPRSA("move"); return true; }
            if (l.equals("DOWN") || l.equals("D")) { GameController.setPRSO(GameController.downObj()); GameController.setPRSA("move"); return true; }
            if (l.equals("INVENTORY")) { GameController.setPRSO(GameController.getPlayer()); GameController.setPRSA("look"); return true; }
            if (l.equals("LOOK")) { GameController.setPRSA("look around"); return true; }
        }
        return false;
    }

    // Get the mapping of synonyms to object names so that objects can be extracted from the user input
    private SynonymsAndConflicts getObjSynonyms(List<GameObject> allowedObjects) {
        SynonymsAndConflicts synsAndCons = new SynonymsAndConflicts();
        for (GameObject obj : allowedObjects) {
            synsAndCons.synonyms.put(obj.getName().toUpperCase(), obj.getName().toLowerCase());
            Set<String> objSynonyms = obj.getSynonyms();
            if (objSynonyms == null) { continue; }
            for (String synonym : objSynonyms) {
                String syn = synonym.toLowerCase();
                if (synsAndCons.synonyms.containsKey(syn)) {
                    // remove conflicting synonyms from table
                    logger.logDebug("Removing conflicting synonym: " + syn);
                    synsAndCons.synonyms.remove(syn);
                    synsAndCons.conflicts.add(syn);
                }
                if (!synsAndCons.conflicts.contains(syn)) {
                    synsAndCons.synonyms.put(syn, obj.getName().toLowerCase());
                }
            }
        }
        return synsAndCons;
    }
}

class SynonymsAndConflicts {
    HashMap<String, String> synonyms;
    HashSet<String> conflicts;

    public SynonymsAndConflicts() {
        synonyms = new HashMap<>();
        conflicts = new HashSet<>();
    }
}

class ConflictException extends Exception { }
