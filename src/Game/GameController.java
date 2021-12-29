package Game;

import SimpleEngine.GameObject;
import SimpleEngine.GameRoom;
import SimpleEngine.GameState;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class GameController {
    private static GameController GC;

    private Player player;
    private GameObject map;

    private GameObject PRSO;
    private GameObject PRSI;
    private String PRSA;
    private List<String> lemmas;

    private GameObject north;
    private GameObject south;
    private GameObject east;
    private GameObject west;
    private GameObject up;
    private GameObject down;

    private Map<String, String> verbSynonyms;

    private boolean usingEnhanced;

    private GameController() {
        this.player = new Player();
        GameState.addGameObject(this.player);
        this.north = new GameObject("NORTH");
        this.south = new GameObject("SOUTH");
        this.east = new GameObject("EAST");
        this.west = new GameObject("WEST");
        this.up = new GameObject("UP");
        this.down = new GameObject("DOWN");
        this.verbSynonyms = constructSynonyms();
    }

    public static GameController instantiateGameController() {
        if (GC == null) { GC = new GameController(); }
        return GC;
    }

    public static GameObject getPRSO() { return GC.PRSO; }
    public static GameObject getPRSI() { return GC.PRSI; }
    public static String getPRSA() { return GC.PRSA; }
    public static List<String> getLemmas() { return GC.lemmas; }

    public static void setPRSO(GameObject o) { GC.PRSO = o; }
    public static void setPRSI(GameObject o) { GC.PRSI = o; }
    public static void setPRSA(String s) {
        if (s == null) { GC.PRSA = null; }
        else { GC.PRSA = s.toUpperCase(); }
    }

    public static void useEnhancedEngine() { GC.usingEnhanced = true; }
    public static void useTraditionalEngine() { GC.usingEnhanced = false; }

    public static void setLemmas(List<String> lemmas) { GC.lemmas = lemmas; }

    public static GameObject getMap() { return GC.map; }
    public static void setMap(GameObject map) { GC.map = map; }
    public static Player getPlayer() { return GC.player; }

    public static GameObject northObj() { return GC.north; }
    public static GameObject southObj() { return GC.south; }
    public static GameObject eastObj() { return GC.east; }
    public static GameObject westObj() { return GC.west; }
    public static GameObject upObj() { return GC.up; }
    public static GameObject downObj() { return GC.down; }

    public static void describeNorth() {
        GameRoom location = GameController.getPlayer().getLocation();
        if (location.getNorth() != null) {
            System.out.println("To the north is a " + GameState.getGameObject(location.getNorth()).getName() + ".");
        }
        else {
            System.out.println("There is nothing to the north.");
        }
    }

    public static void describeSouth() {
        GameRoom location = GameController.getPlayer().getLocation();
        if (location.getSouth() != null) {
            System.out.println("To the south is a " + GameState.getGameObject(location.getSouth()).getName() + ".");
        }
        else {
            System.out.println("There is nothing to the south.");
        }
    }

    public static void describeEast() {
        GameRoom location = GameController.getPlayer().getLocation();
        if (location.getEast() != null) {
            System.out.println("To the east is a " + GameState.getGameObject(location.getEast()).getName() + ".");
        }
        else {
            System.out.println("There is nothing to the east.");
        }
    }

    public static void describeWest() {
        GameRoom location = GameController.getPlayer().getLocation();
        if (location.getWest() != null) {
            System.out.println("To the west is a " + GameState.getGameObject(location.getWest()).getName() + ".");
        }
        else {
            System.out.println("There is nothing to the west.");
        }
    }

    public static void describeUp() {
        GameRoom location = GameController.getPlayer().getLocation();
        if (location.getUp() != null) {
            System.out.println("Above you is a " + GameState.getGameObject(location.getUp()).getName() + ".");
        }
        else {
            System.out.println("There is nothing above you.");
        }
    }

    public static void describeDown() {
        GameRoom location = GameController.getPlayer().getLocation();
        if (location.getDown() != null) {
            System.out.println("Below you is a " + GameState.getGameObject(location.getDown()).getName() + ".");
        }
        else {
            System.out.println("There is nothing below you.");
        }
    }

    public static void describeLocation() {
        GameRoom location = GameController.getPlayer().getLocation();
        System.out.println("You find yourself in the " + location.getName() + ".");
        System.out.println(GameController.getPlayer().getLocation().getDesc());

        System.out.println();

        if (location.getNorth() != null) {
            describeNorth();
        }
        if (location.getEast() != null) {
            describeEast();
        }
        if (location.getSouth() != null) {
            describeSouth();
        }
        if (location.getWest() != null) {
            describeWest();
        }
        if (location.getUp() != null) {
            describeUp();
        }
        if (location.getDown() != null) {
            describeDown();
        }


        // Class for pairing up parents and children in the search stack
        class ParentChildPair {
            private GameObject parent;
            private GameObject child;

            public ParentChildPair(GameObject parent, GameObject child) {
                this.parent = parent;
                this.child = child;
            }
        }

        // Depth first search on objects in the scene
        Stack<ParentChildPair> stack = new Stack<>();
        stack.push(new ParentChildPair(null, location));

        boolean printedGap = false;

        while (!stack.empty()) {
            ParentChildPair pair = stack.pop();
            if (!pair.child.equals(location) && !pair.child.equals(GameController.getPlayer())) {
                if (!pair.child.hasProperty("_HIDE")) {
                    if (pair.child.hasProperty("_SURFACE")) {
                        if (!printedGap) {
                            System.out.println();
                            printedGap = true;
                        }
                        System.out.println("A " + pair.child.getName() + " is on the " + pair.parent.getName() + ".");
                    }
                    else {
                        if (!printedGap) {
                            System.out.println();
                            printedGap = true;
                        }
                        System.out.println("A " + pair.child.getName() + " is in the " + pair.parent.getName() + ".");
                    }
                }
            }
            if (!pair.child.equals(GameController.getPlayer())) {
                for (String childID : pair.child.getChildren()) {
                    GameObject child = GameState.getGameObject(childID);
                    stack.push(new ParentChildPair(pair.child, child));
                }
            }
        }
    }

    // Create a map of verb synonyms using the patterns defined in verbSynonymsImproved.txt
    private Map<String, String> constructSynonyms() {
        // Sorted map based on how many words are in the verb
        Map<String, String> synonyms = new TreeMap<>(
            (s1, s2) -> {
                int words1 = s1.split(" ").length;
                int words2 = s2.split(" ").length;
                if (words1 > words2) {
                    return -1;
                } else if (words1 < words2) {
                    return 1;
                } else {
                    return s1.compareTo(s2);
                }
            }
        );
        try {
            File myObj = new File("D:\\Documents\\University\\Part II Project\\Interactive Fiction with KRaR\\src\\ProcessInput\\verbSynonymsImproved.txt");
            Scanner myReader = new Scanner(myObj);

            String verb = "";
            String[] pattern = new String[0];
            List<List<String>> patternParts = new ArrayList<>();
            while (myReader.hasNextLine()) {
                String line = myReader.nextLine();
                if (line.length() == 0) {
                    addSynonymsToMap(synonyms, verb, pattern, patternParts);
                    verb = null;
                    patternParts = null;
                }
                // Match new verb
                else if (line.length() > 6 && line.substring(0,6).equals("verb: ")) {
                    verb = line.substring(6);

                }
                // Match new pattern
                else if (!line.contains("=")) {
                    addSynonymsToMap(synonyms, verb, pattern, patternParts);
                    pattern = line.split(" ");
                    patternParts = new ArrayList<>();
                    for (String part : pattern) {
                        if (!part.equals("ITEM")) {
                            patternParts.add(new ArrayList<>());
                        }
                    }
                }
                // Fill in parts
                else {
                    String[] patternFill = line.split("=");
                    int ind = Integer.parseInt(patternFill[0]);
                    String[] choices = patternFill[1].split(",");
                    for (String choice : choices) {
                        assert patternParts != null;
                        patternParts.get(ind).add(choice);
                    }
                }

            }
            addSynonymsToMap(synonyms, verb, pattern, patternParts);
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return synonyms;
    }

    // Given a pattern and a list of choices for that pattern, add all permutations as a synonym for the given verb to the map
    private void addSynonymsToMap(Map<String, String> synonyms, String verb, String[] pattern, List<List<String>> patternParts) {
        if (patternParts != null && patternParts.size() > 0) {
            StringBuilder key;
            List<String> permutations = new ArrayList<>();
            generatePermutations(patternParts, permutations, 0, "");
            for (String perm : permutations) {
                String[] parts = perm.split(" ");
                key = new StringBuilder();
                for (String p : pattern) {
                    if(p.equals("ITEM")) {
                        key.append(" ITEM");
                    }
                    else {
                        int i = Integer.parseInt(p);
                        key.append(" ").append(parts[i]);
                    }
                }
                synonyms.put(key.toString().substring(1).toUpperCase(), verb);
            }
        }
    }

    // Auxiliary function for generating permutations
    private void generatePermutations(List<List<String>> lists, List<String> result, int depth, String current) {
        if (depth == lists.size()) {
            result.add(current.substring(1));
            return;
        }

        for (int i = 0; i < lists.get(depth).size(); i++) {
            generatePermutations(lists, result, depth + 1, current + " " + lists.get(depth).get(i));
        }
    }

    // Return a list of all Game Objects that can be referenced by the player in their current location
    public static List<GameObject> getAllowedObjects() {
        ArrayList<GameObject> objects = new ArrayList<>();
        objects.add(GameController.northObj());
        objects.add(GameController.southObj());
        objects.add(GameController.eastObj());
        objects.add(GameController.westObj());
        objects.add(GameController.upObj());
        objects.add(GameController.downObj());

        GameRoom currLocation = GameController.getPlayer().getLocation();

        // Perform a depth first search on the game tree using the current location as the root
        Stack<GameObject> stack = new Stack<>();
        stack.push(currLocation);
        while (!stack.empty()) {
            GameObject obj = stack.pop();
            if (/*!obj.equals(GameController.getPlayer()) && */!obj.equals(currLocation)) {
                objects.add(obj);
            }
            for (String child : obj.getChildren()) {
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

        return objects;
    }

    public static Map<String, String> getVerbSynonyms() { return GC.verbSynonyms; }
}
