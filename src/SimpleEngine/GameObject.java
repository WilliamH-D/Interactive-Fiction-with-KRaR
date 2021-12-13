package SimpleEngine;

import java.util.*;

public class GameObject {
    private String id;
    private String parent;
    private Set<String> children;
    private String name;
    private String desc;
    private Set<String> synonyms; // Generate automatically when parsing input rather than defining here (can be difference for enhanced engine)
    private Set<String> flags; // Static flags for this object
    private HashMap<String, String> variables;

    public GameObject(String n) {
        this.id = n.toUpperCase();
        this.name = n.toLowerCase();
        this.children = new HashSet<>();
        this.flags = new HashSet<>();
        this.variables = new HashMap<>();
    }

    public String getId() { return this.id; }

    public void setParent(String parent) {
        if (this.parent != null) {
            GameObject oldParent = GameState.getGameObject(this.parent);
            if (oldParent != null) {
                oldParent.removeChild(this.id);
            }
        }
        GameObject newParent = GameState.getGameObject(parent);
        if (newParent != null) {
            newParent.addChild(this.id);
        }
        this.parent = parent;
    }

    public String getParent() { return this.parent; }

    public void addChild(String child) { this.children.add(child); }

    public void removeChild(String child) { this.children.remove(child); }

    public Set<String> getChildren() { return this.children; }

    public ArrayList<String> hasDescendant(String objID) {
        ArrayList<String> path = new ArrayList<>();

        // Implement breadth first search to find descendant and path
        Queue<String> queue = new ArrayDeque<>();
        queue.add(this.id);

        while (queue.size() > 0) {
            GameObject curr = GameState.getGameObject(queue.remove());
            if (curr.id.equals(objID)) {
                // We have found the object
                path.add(0, objID);
                while (!(curr.id.equals(this.id))) {
                    curr = GameState.getGameObject(curr.parent);
                    path.add(0, curr.id);
                }

                return path;
            }
            queue.addAll(curr.children);
        }
        return path;
    }

    public void setName(String name) { this.name = name; }

    public String getName() { return this.name; }

    public void setDesc(String desc) { this.desc = desc; }

    public String getDesc() { return this.desc; }

    public void setSynonyms(Set<String> synonyms) {
        if (synonyms != null) {
            this.synonyms = new HashSet<>(synonyms);
        }
    }

    public Set<String> getSynonyms() { return this.synonyms; }

    public void setFlag(String flag) { this.flags.add(flag); }

    public void removeFlag(String flag) { this.flags.remove(flag); }

    public boolean hasFlag(String flag) { return this.flags.contains(flag); }

    public void addVariable(String varName, String varValue) { this.variables.put(varName, varValue); }

    public String getVariable(String varName) { return this.variables.get(varName); }

    public boolean hasVariable(String varName) { return this.variables.containsKey(varName); }

    public void setVariable(String varName, String value) { addVariable(varName, value); }

    public boolean action() {
        if (GameState.existsAction(this.id)) {
            return GameState.getAction(this.id).executeAction();
        }
        return false;
    }
}
