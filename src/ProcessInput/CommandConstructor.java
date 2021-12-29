package ProcessInput;

import Game.GameController;
import Game.Main;
import Logging.DebugLogger;
import SimpleEngine.GameObject;
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
        logger.logLine();
        logger.logDebug("Processing user input: " + userIn);

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
        List<String> lemmas = getTokens(userIn);

        // Check to see if the input matches a special instruction
        if (specialCase(lemmas)) { return; }

        // Extract the verb from the input
        String newInput = extractVerb(lemmas);

        // Create a new annotated pipeline for the simplified verb input
        CoreDocument preprocessedDocument = new CoreDocument(newInput);
        NLPPipeline.getPipeline().annotate(preprocessedDocument);
        sentence = preprocessedDocument.sentences().get(0);
        lemmas = getTokens(newInput);
        List<String> posTags = sentence.posTags();

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
        preprocessedDocument = new CoreDocument(preprocessed);
        NLPPipeline.getPipeline().annotate(preprocessedDocument);
        sentence = preprocessedDocument.sentences().get(0);
        lemmas = getTokens(preprocessed);

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

        extractComplexVerb(lemmas);

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

    private String extractVerb(List<String> lemmas) {
        int startInd = -1;
        int endInd = -1;
        boolean found = false;

        // Find the main verb of the input
        for (String verb : verbSynonyms.keySet()) {
            String[] parts = verb.toLowerCase().split(" ");
            if (parts.length == 1 && lemmas.contains(verb.toLowerCase())) {
                GameController.setPRSA(verb.toLowerCase());
                logger.logDebug("Matched verb: " + verb.toLowerCase());
                startInd = lemmas.indexOf(verb.toLowerCase());
                endInd = startInd;
                found = true;
                break;
            }
            else {
                // Verb has multiple parts
                boolean breakLoop = false;
                for (int i = 0; i < lemmas.size() - parts.length + 1; i++) {
                    if (lemmas.get(i).equals(parts[0].toLowerCase())) {
                        boolean match = true;
                        startInd = i;
                        for (int j = 1; j < parts.length; j++) {
                            endInd = j;
                            if (!lemmas.get(i+j).equals(parts[j].toLowerCase())) {
                                match = false;
                            }
                        }
                        if (match) {
                            // Verb found
                            GameController.setPRSA(verb);
                            logger.logDebug("Matched verb: " + verb);
                            breakLoop = true;
                            found = true;
                        }
                    }
                }
                if (breakLoop) {
                    break;
                }
            }
        }

        StringBuilder simplifiedVerb = new StringBuilder();
        boolean inRemoveRegion = false;

        if (!found) {
            //logger.logDebug("Verb not found");
            for (String lemma : lemmas) {
                simplifiedVerb.append(" ").append(lemma);
            }
            simplifiedVerb.delete(0, 1);
            return simplifiedVerb.toString();
        }
        for (int i = 0; i < lemmas.size(); i++) {
            if (i == startInd) {
                inRemoveRegion = true;
                simplifiedVerb.append(" do");
            }
            if (!inRemoveRegion) {
                simplifiedVerb.append(" ").append(lemmas.get(i));
            }
            if (i == endInd) {
                inRemoveRegion = false;
            }
        }
        simplifiedVerb.delete(0, 1);
        logger.logDebug("Simplified verb: " + simplifiedVerb.toString());
        return simplifiedVerb.toString();
    }

    // Allow for complex commands such as "put item1 in item2"
    private void extractComplexVerb(List<String> lemmas) {
        /*logger.logDebug("Synonyms:");
        for (String syn : verbSynonyms.keySet()) {
            logger.logDebug(syn);
        }
        logger.logLine();

        logger.logDebug("Unsimplified: " + lemmas);*/

        if (lemmas.contains("item1")) {
            lemmas.set(lemmas.indexOf("item1"),"item");
        }
        if (lemmas.contains("item2")) {
            lemmas.set(lemmas.indexOf("item2"),"item");
        }
        logger.logDebug("Lemmas: " + lemmas);

        for (String verb : verbSynonyms.keySet()) {
            String[] parts = verb.toLowerCase().split(" ");
            if (parts.length == 1 && lemmas.contains(verb.toLowerCase())) {
                GameController.setPRSA(verb.toLowerCase());
                break;
            }
            else {
                // Verb has multiple parts
                boolean breakLoop = false;
                for (int i = 0; i < lemmas.size() - parts.length + 1; i++) {
                    if (lemmas.get(i).equals(parts[0].toLowerCase())) {
                        boolean match = true;
                        for (int j = 1; j < parts.length; j++) {
                            if (!lemmas.get(i+j).equals(parts[j].toLowerCase())) {
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

    private String extractObjects(List<String> lemmas, List<String> posTags, GameObject[] rets) throws ConflictException {
        // Pre-process the users input and replace direct/indirect object with item1/item2

        //logger.logDebug("Pre-process input lemmas: " + lemmas);
        ArrayList<LemmaPOS> tokens = new ArrayList<>();
        for (int i = 0; i < lemmas.size(); i++) {
            tokens.add(new LemmaPOS(lemmas.get(i), posTags.get(i)));
        }

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

            // try match on name
            List<String> nameLemmas = getTokens(obj.getName());
            makeLemmasLowerCase(nameLemmas);
            String[] parts = nameLemmas.toArray(new String[0]);

            for (int i = 0; i < tokens.size(); i++) {
                if (i + parts.length <= tokens.size()) {
                    for (int j = 0; j < parts.length; j++) {
                        match = tokens.get(i + j).getLemma().equals(parts[j].toLowerCase());
                        if (!match) { break; }
                    }
                }
                // If we found a match, then break out of the loop
                if (match) {
                    startInd = i;
                    break;
                }
            }

            // try match on synonym
            if (!match) {
                // Find only the synonyms for this object from the synonyms map
                Map<String, String> synonyms = objSynonyms.entrySet()
                        .stream()
                        .filter(entry -> entry.getValue().equals(obj.getName().toLowerCase()))
                        .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

                for (String syn : synonyms.keySet()) {
                    List<String> synLemmas = getTokens(syn);
                    makeLemmasLowerCase(synLemmas);
                    String[] synParts = synLemmas.toArray(new String[0]);

                    for (int i = 0; i < tokens.size(); i++) {
                        if (i + synParts.length <= tokens.size()) {
                            for (int j = 0; j < synParts.length; j++) {
                                match = tokens.get(i + j).getLemma().equals(synParts[j].toLowerCase());
                                if (!match) { break; }
                            }
                        }
                        // Stop reading rest of input if match found for this synonym
                        if (match) {
                            startInd = i;
                            break;
                        }
                    }
                    // If we find a matching synonym for this object, ignore all other synonyms
                    if (match) { break; }
                }
            }

            // try match on conflicts
            if (!match && !conflictFound) {
                for (String conflict : conflicts) {
                    List<String> conLemmas = getTokens(conflict);
                    makeLemmasLowerCase(conLemmas);
                    String[] conParts = conLemmas.toArray(new String[0]);

                    for (int i = 0; i < tokens.size(); i++) {
                        if (i + conParts.length <= tokens.size()) {
                            for (int j = 0; j < conParts.length; j++) {
                                conflictFound = tokens.get(i + j).getLemma().equals(conParts[j].toLowerCase());
                                if (!conflictFound) { break; }
                            }
                        }
                        // Stop reading rest of input if match found for this synonym
                        if (conflictFound) {
                            break;
                        }
                    }
                    // If we find a matching synonym for this object, ignore all other synonyms
                    if (conflictFound) { break; }
                }
            }

            // A match has been found
            if (match) {
                rets[count] = obj;
                count++;
                matchedObjects.add(parts);
                matchedIndxs.add(startInd);
            }
        }

        // No unique objects identified, but conflict found
        if (conflictFound && count == 0) {
            throw new ConflictException();
        }

        ArrayList<Integer> removeStart = new ArrayList<>();
        ArrayList<Integer> removeEnd = new ArrayList<>();
        for (int i = 0; i < matchedObjects.size(); i++) {
            int idx = matchedIndxs.get(i);
            if (idx > 0 && (tokens.get(idx-1).getPos().equals("DT") || tokens.get(idx-1).getPos().equals("JJ") || tokens.get(idx-1).getPos().equals("JJR"))) { removeStart.add(idx-1); }
            else { removeStart.add(idx); }
            removeEnd.add(idx + matchedObjects.get(i).length - 1);
        }

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
        }
        return false;
    }

    private static SynonymsAndConflicts getObjSynonyms(List<GameObject> allowedObjects) {
        SynonymsAndConflicts synsAndCons = new SynonymsAndConflicts();
        for (GameObject obj : allowedObjects) {
            Set<String> objSynonyms = obj.getSynonyms();
            if (objSynonyms == null) { continue; }
            for (String synonym : objSynonyms) {
                String syn = synonym.toLowerCase();
                if (synsAndCons.synonyms.containsKey(syn)) {
                    // remove conflicting synonyms from table
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
