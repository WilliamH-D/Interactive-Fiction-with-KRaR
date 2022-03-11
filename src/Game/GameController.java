package Game;

import SimpleEngine.Actions.ConditionTest;
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

    public static final String redText = "\u001B[31m";
    public static final String resetText = "\u001B[0m";

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
    public static boolean usingEnhancedEngine() { return GC.usingEnhanced; }

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

    private static String getDeterminate(GameObject obj) {
        return getDeterminate(obj, false);
    }

    private static String getDeterminate(GameObject obj, boolean capitalise) {
        String toRet;
        String det = obj.getDet();
        if (det != null) {
            toRet = det.equals("") ? det : det + " ";
        }
        else {
            toRet = ("AEIOUaeiou".indexOf(obj.getName().charAt(0)) != -1) ? "an " : "a ";
        }
        if (capitalise) {
            return toRet.substring(0, 1).toUpperCase() + toRet.substring(1);
        }
        return toRet;
    }

    private static String isOrAre(GameObject obj) {
        return obj.getUseAre() ? " are" : " is";
    }

    public static boolean roomConditionsMet(Set<String> conditions, ConditionTest query) {
        if (query != null) {
            return query.satisfied();
        }
        if (conditions != null && conditions.size() > 0) {
            for (String cond : conditions) {
                String[] flagValuePair = cond.split("=");
                if (GameState.getFlag(flagValuePair[0]).getValue() != Integer.parseInt(flagValuePair[1])) {
                    return false;
                }
            }
        }
        return true;
    }

    private static void describeNorth(GameRoom location) {
        describeNorth(location, false);
    }

    public static void describeNorth(GameRoom location, boolean looking) {
        if (location.isNhidden() && !roomConditionsMet(location.getNConds(), location.getNQuery())) {
            if (looking) {
                System.out.println("You can't see anything to the west.");
            }
            return;
        }
        GameRoom northLocation = (GameRoom)GameState.getGameObject(GameController.getPlayer().getLocation().getNorth());
        if (northLocation != null) {
            System.out.println("To the north is " + getDeterminate(northLocation) + northLocation.getName() + ".");
        }
        else {
            System.out.println("There is nothing to the north.");
        }
    }

    private static void describeSouth(GameRoom location) {
        describeSouth(location, false);
    }

    public static void describeSouth(GameRoom location, boolean looking) {
        if (location.isShidden() && !roomConditionsMet(location.getSConds(), location.getSQuery())) {
            if (looking) {
                System.out.println("You can't see anything to the south.");
            }
            return;
        }
        GameRoom southLocation = (GameRoom)GameState.getGameObject(GameController.getPlayer().getLocation().getSouth());
        if (southLocation != null) {
            System.out.println("To the south is " + getDeterminate(southLocation) + southLocation.getName() + ".");
        }
        else {
            System.out.println("There is nothing to the south.");
        }
    }

    private static void describeEast(GameRoom location) {
        describeEast(location, false);
    }

    public static void describeEast(GameRoom location, boolean looking) {
        if (location.isEhidden() && !roomConditionsMet(location.getEConds(), location.getEQuery())) {
            if (looking) {
                System.out.println("You can't see anything to the east.");
            }
            return;
        }
        GameRoom eastLocation = (GameRoom)GameState.getGameObject(GameController.getPlayer().getLocation().getEast());
        if (eastLocation != null) {
            System.out.println("To the east is " + getDeterminate(eastLocation) + eastLocation.getName() + ".");
        }
        else {
            System.out.println("There is nothing to the east.");
        }
    }

    private static void describeWest(GameRoom location) {
        describeWest(location, false);
    }

    public static void describeWest(GameRoom location, boolean looking) {
        if (location.isWhidden() && !roomConditionsMet(location.getWConds(), location.getWQuery())) {
            if (looking) {
                System.out.println("You can't see anything to the west.");
            }
            return;
        }
        GameRoom westLocation = (GameRoom)GameState.getGameObject(GameController.getPlayer().getLocation().getWest());
        if (westLocation != null) {
            System.out.println("To the west is " + getDeterminate(westLocation) + westLocation.getName() + ".");
        }
        else {
            System.out.println("There is nothing to the west.");
        }
    }

    private static void describeUp(GameRoom location) {
        describeUp(location, false);
    }

    public static void describeUp(GameRoom location, boolean looking) {
        if (location.isUhidden() && !roomConditionsMet(location.getUConds(), location.getUQuery())) {
            if (looking) {
                System.out.println("You can't see anything above you.");
            }
            return;
        }
        GameRoom upLocation = (GameRoom)GameState.getGameObject(GameController.getPlayer().getLocation().getUp());
        if (upLocation != null) {
            System.out.println("Above you is " + getDeterminate(upLocation) + upLocation.getName() + ".");
        }
        else {
            System.out.println("There is nothing above you.");
        }
    }

    private static void describeDown(GameRoom location) {
        describeDown(location, false);
    }

    public static void describeDown(GameRoom location, boolean looking) {
        if (location.isDhidden() && !roomConditionsMet(location.getDConds(), location.getDQuery())) {
            if (looking) {
                System.out.println("You can't see anything below you.");
            }
            return;
        }
        GameRoom downLocation = (GameRoom)GameState.getGameObject(GameController.getPlayer().getLocation().getDown());
        if (downLocation != null) {
            System.out.println("Below you is " + getDeterminate(downLocation) + downLocation.getName() + ".");
        }
        else {
            System.out.println("There is nothing below you.");
        }
    }

    public static void printRepeat(int length, String repeat) {
        for (int i = 0; i < length; i++) {
            System.out.print(repeat);
        }
    }

    public static void showCompass(GameRoom location) {
        GameRoom n = (GameRoom)GameState.getGameObject(location.getNorth());
        GameRoom s = (GameRoom)GameState.getGameObject(location.getSouth());
        GameRoom e = (GameRoom)GameState.getGameObject(location.getEast());
        GameRoom w = (GameRoom)GameState.getGameObject(location.getWest());
        GameRoom u = (GameRoom)GameState.getGameObject(location.getUp());
        GameRoom d = (GameRoom)GameState.getGameObject(location.getDown());

        if (location.isNhidden() && !roomConditionsMet(location.getNConds(), location.getNQuery())) { n = null; }
        if (location.isShidden() && !roomConditionsMet(location.getSConds(), location.getSQuery())) { s = null; }
        if (location.isEhidden() && !roomConditionsMet(location.getEConds(), location.getEQuery())) { e = null; }
        if (location.isWhidden() && !roomConditionsMet(location.getWConds(), location.getWQuery())) { w = null; }
        if (location.isUhidden() && !roomConditionsMet(location.getUConds(), location.getUQuery())) { u = null; }
        if (location.isDhidden() && !roomConditionsMet(location.getDConds(), location.getDQuery())) { d = null; }

        int westLength = w == null ? 0 : w.getName().length();
        int northLength = n == null ? 0 : n.getName().length();
        int southLength = s == null ? 0 : s.getName().length();
        int upLength = u == null ? 0 : u.getName().length();
        int downLength = d == null ? 0 : d.getName().length();

        int compassCentre = Math.max(10, Math.max(westLength+4, Math.max(northLength/2, Math.max(southLength/2, Math.max((upLength+3)/2, (downLength+3)/2)))));

        String up = u == null ? "" : u.getName();
        String north = n == null ? "" : n.getName();
        String west = w == null ? "" : w.getName();
        String east = e == null ? "" : e.getName();
        String south = s == null ? "" : s.getName();
        String down = d == null ? "" : d.getName();

        if (u != null) {
            printRepeat(compassCentre - (upLength+3) / 2, " ");
            System.out.print("U: ");
            System.out.println(up);

            printRepeat(compassCentre, " ");
            System.out.println("\u2191");
        }

        if (n != null) {
            printRepeat(compassCentre - northLength / 2, " ");
            System.out.println(north);
        }

        printRepeat(compassCentre - 3, " ");
        System.out.println("   _   ");
        printRepeat(compassCentre - 3, " ");
        System.out.println(" _|N|_ ");
        printRepeat(compassCentre - 4 - westLength, " ");
        System.out.println(west + " |W   E| " + east);
        printRepeat(compassCentre - 3, " ");
        System.out.println(" \u203E|S|\u203E ");
        printRepeat(compassCentre - 3, " ");
        System.out.println("   \u203E   ");

        if (s != null) {
            printRepeat(compassCentre - southLength / 2, " ");
            System.out.println(south);
        }

        if (d != null) {
            printRepeat(compassCentre, " ");
            System.out.println("\u2193");

            printRepeat(compassCentre - (downLength+3) / 2, " ");
            System.out.print("D: ");
            System.out.println(down);
        }
    }

    public static void describeLocation() {
        GameRoom location = GameController.getPlayer().getLocation();
        System.out.print("------------------");
        printRepeat(location.getName().length(), "-");
        System.out.println();
        System.out.println("Current location: " + location.getName());
        System.out.print("------------------");
        printRepeat(location.getName().length(), "-");
        System.out.println();
        System.out.println();
        System.out.println(GameController.getPlayer().getLocation().getDesc());

        System.out.println();

        /*if (location.getNorth() != null) {
            describeNorth(location);
        }
        if (location.getEast() != null) {
            describeEast(location);
        }
        if (location.getSouth() != null) {
            describeSouth(location);
        }
        if (location.getWest() != null) {
            describeWest(location);
        }
        if (location.getUp() != null) {
            describeUp(location);
        }
        if (location.getDown() != null) {
            describeDown(location);
        }*/

        showCompass(location);

        // Class for pairing up parents and children in the search stack
        class ParentChildPair {
            private GameObject parent;
            private GameObject child;
            private int indent; // 0 = inside, 1 = on surface, 2 = below

            public ParentChildPair(GameObject parent, GameObject child, int indent) {
                this.parent = parent;
                this.child = child;
                this.indent = indent;
            }
        }

        // Depth first search on objects in the scene
        Stack<ParentChildPair> stack = new Stack<>();
        stack.push(new ParentChildPair(null, location, -1));

        boolean printedGap = false;

        while (!stack.empty()) {
            ParentChildPair pair = stack.pop();

            // Make sure child isn't a location or the player
            if (!pair.child.equals(location) && !pair.child.equals(GameController.getPlayer())) {
                // Make sure child is meant to be visible to the player
                if (!pair.child.hasProperty("_HIDE")) {
                    // Child is inside of its parent
                    if (pair.child.getParentType() == 0) {
                        if (!printedGap) {
                            System.out.println();
                            System.out.println("Objects around you:");
                            System.out.println();
                            printedGap = true;
                        }
                        for (int i = 0; i < 2*pair.indent; i++) { System.out.print(" "); }
                        System.out.println(" - " + getDeterminate(pair.child, true) + pair.child.getName() + isOrAre(pair.child) + " in the " + pair.parent.getName() + ".");
                    }
                    // Child is on top of its parent
                    else if (pair.child.getParentType() == 1) {
                        if (!printedGap) {
                            System.out.println();
                            printedGap = true;
                        }
                        for (int i = 0; i < 2*pair.indent; i++) { System.out.print(" "); }
                        System.out.println(" - " + getDeterminate(pair.child, true) + pair.child.getName() + isOrAre(pair.child) + " on the " + pair.parent.getName() + ".");
                    }
                    // Child is underneath of its parent
                    else if (pair.child.getParentType() == 2) {
                        if (!printedGap) {
                            System.out.println();
                            printedGap = true;
                        }
                        for (int i = 0; i < 2*pair.indent; i++) { System.out.print(" "); }
                        System.out.println(" - " + getDeterminate(pair.child, true) + pair.child.getName() + isOrAre(pair.child) + " under the " + pair.parent.getName() + ".");
                    }
                    if (pair.child.hasProperty("_CLOSABLECONTAINER")) {
                        if (Boolean.parseBoolean(pair.child.getVariable("isClosed"))) {
                            for (int i = 0; i < 2*pair.indent; i++) { System.out.print(" "); }
                            System.out.println("   The " + pair.child.getName() + " is currently closed.");
                        }
                        else {
                            for (int i = 0; i < 2*pair.indent; i++) { System.out.print(" "); }
                            System.out.println("   The " + pair.child.getName() + " is currently open.");
                        }
                    }
                }
            }
            if (!pair.child.equals(GameController.getPlayer())) {
                for (String childID : pair.child.getChildren()) {
                    GameObject child = GameState.getGameObject(childID);
                    if (child.getParentType() == 0 && pair.child.hasProperty("_CLOSABLECONTAINER") && Boolean.parseBoolean(pair.child.getVariable("isClosed"))) { continue; }
                    stack.push(new ParentChildPair(pair.child, child, pair.indent+1));
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
            File myObj = new File("src\\ProcessInput\\verbSynonymsImproved.txt");
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
                GameObject c = GameState.getGameObject(child);
                if (c.getParentType() == 0 && obj.hasVariable("isClosed") && Boolean.parseBoolean(obj.getVariable("isClosed"))) {
                    continue;
                }
                stack.push(c);
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
