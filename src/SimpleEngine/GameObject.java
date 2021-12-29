package SimpleEngine;

import EnhancedEngine.KnowledgeBase;
import Game.GameController;

import java.util.*;

public class GameObject {
    private String id;
    private String parent;
    private Set<String> inside;
    private Set<String> onSurface;
    private Set<String> below;
    private int parentType; // 0 = inside parent, 1 = on top of parent, 2 = below parent
    private String name;
    private String desc;
    private Set<String> synonyms; // Generate automatically when parsing input rather than defining here (can be difference for enhanced engine)
    private Set<String> properties; // Static flags for this object
    private HashMap<String, String> variables;

    public GameObject(String n) {
        this.id = n.toUpperCase();
        this.name = n.toLowerCase();
        this.inside = new HashSet<>();
        this.onSurface = new HashSet<>();
        this.below = new HashSet<>();
        this.properties = new HashSet<>();
        this.variables = new HashMap<>();
    }

    public String getId() { return this.id; }

    public void setParent(String parent, int newParentType) {
        if (this.parent != null) {
            GameObject oldParent = GameState.getGameObject(this.parent);
            if (oldParent != null) {
                oldParent.removeChild(this.id, this.parentType);
            }
        }
        GameObject newParent = GameState.getGameObject(parent);
        if (newParent != null) {
            newParent.addChild(this.id, newParentType);
        }
        this.parent = parent;
    }

    public String getParent() { return this.parent; }

    public void addChild(String child, int parentType) {
        switch (parentType) {
            case 0: this.inside.add(child); break;
            case 1: this.onSurface.add(child); break;
            case 2: this.below.add(child); break;
        }
    }

    public void removeChild(String child, int parentType) {
        switch (parentType) {
            case 0: this.inside.remove(child); break;
            case 1: this.onSurface.remove(child); break;
            case 2: this.below.remove(child); break;
        }
    }

    public Set<String> getChildren() {
        Set<String> children = new HashSet<>();
        children.addAll(inside);
        children.addAll(onSurface);
        children.addAll(below);
        return children;
    }

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
            queue.addAll(getChildren());
        }
        return path;
    }

    public void setName(String name) { this.name = name; }

    public String getName() { return this.name; }

    public void setDesc(String desc) { this.desc = desc; }

    public String getDesc() { return this.desc; }

    public int getParentType() { return this.parentType; }

    public void setParentType(int parentType) { this.parentType = parentType; }

    public void setSynonyms(Set<String> synonyms) {
        if (synonyms != null) {
            this.synonyms = new HashSet<>();
            for (String syn : synonyms) {
                this.synonyms.add(syn.substring(1, syn.length()-1));
            }
        }
    }

    public Set<String> getSynonyms() { return this.synonyms; }

    public void setProperty(String property) { this.properties.add(property); }

    public void removeProperty(String property) { this.properties.remove(property); }

    public boolean hasProperty(String property) { return this.properties.contains(property); }

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

    public void inspectObject() {
        System.out.println(getDesc());
    }

    public void takeItem() {
        KnowledgeBase kb = KnowledgeBase.getInstance();
        if (hasVariable("volume") && kb.query("isObject(" + getParent().toLowerCase() + ")").size() > 0) {
            // remove the volume from in/on/below
            GameObject parent = GameState.getGameObject(getParent());
            String parentID = parent.getId().toLowerCase();
            switch (parentType) {
                case 0:
                    int volume = Integer.parseInt(getVariable("volume"));
                    int capacityUsed = Integer.parseInt(kb.query("capacityUsed(" + parentID + ",X)").get(0).get(0).getTerm().toString());
                    kb.removeClause("capacityUsed(" + parentID + ",X)", true);
                    kb.addClause("capacityUsed(" + parentID + "," + (capacityUsed - volume) + ")");
                    parent.setVariable("capacityUsed", String.valueOf(capacityUsed-volume));
                    break;
                case 1:
                    volume = Integer.parseInt(getVariable("volume"));
                    int surfaceUsed = Integer.parseInt(kb.query("surfaceUsed(" + parentID + ",X)").get(0).get(0).getTerm().toString());
                    kb.removeClause("surfaceUsed(" + parentID + ",X)", true);
                    kb.addClause("surfaceUsed(" + parentID + "," + (surfaceUsed - volume) + ")");
                    parent.setVariable("surfaceUsed", String.valueOf(surfaceUsed-volume));
                    break;
                case 2:
                    volume = Integer.parseInt(getVariable("volume"));
                    int belowUsed = Integer.parseInt(kb.query("belowUsed(" + parentID + ",X)").get(0).get(0).getTerm().toString());
                    kb.removeClause("belowUsed(" + parentID + ",X)", true);
                    kb.addClause("belowUsed(" + parentID + "," + (belowUsed - volume) + ")");
                    parent.setVariable("belowUsed", String.valueOf(belowUsed-volume));
                    break;
            }
        }
        setParent(GameController.getPlayer().getId(), 0);
        kb.removeClause("isLocated(" + this.getId().toLowerCase() + ",X,Y)", true);
        kb.addClause("isLocated(" + this.getId().toLowerCase() + "," + GameController.getPlayer().getId().toLowerCase() + ",0)");
        System.out.println("You took the " + getName() + ".");
    }

    public void placeItem() {
        placeItem(false);
    }

    public void placeItem(boolean ignoreText) {
        KnowledgeBase kb = KnowledgeBase.getInstance();
        setParent(GameController.getPlayer().getLocation().getId(), 0);
        kb.removeClause("isLocated(" + getId().toLowerCase() + ",X,Y)", true);
        kb.addClause("isLocated(" + getId().toLowerCase() + "," + getParent().toLowerCase() + ",0)");
        if (!ignoreText) {
            System.out.println("You placed down the " + getName() + ".");
        }
    }

    public void placeItem(GameObject parent, int parentType) {
        placeItem(parent, parentType, false);
    }

    public void placeItem(GameObject parent, int parentType, boolean ignoreText) {
        setParent(parent.getId(), parentType);
        KnowledgeBase kb = KnowledgeBase.getInstance();
        if (hasVariable("volume") && kb.query("isObject(" + getParent().toLowerCase() + ")").size() > 0) {
            // add the volume to in/on/below
            switch (parentType) {
                case 0:
                    int volume = Integer.parseInt(getVariable("volume"));
                    int capacityUsed = Integer.parseInt(kb.query("capacityUsed(" + getParent().toLowerCase() + ",X)").get(0).get(0).getTerm().toString());
                    kb.removeClause("capacityUsed(" + getParent().toLowerCase() + ",X)", true);
                    kb.addClause("capacityUsed(" + getParent().toLowerCase() + "," + (capacityUsed + volume) + ")");
                    parent.setVariable("capacityUsed", String.valueOf(capacityUsed+volume));
                    break;
                case 1:
                    volume = Integer.parseInt(getVariable("volume"));
                    int surfaceUsed = Integer.parseInt(kb.query("surfaceUsed(" + getParent().toLowerCase() + ",X)").get(0).get(0).getTerm().toString());
                    kb.removeClause("surfaceUsed(" + getParent().toLowerCase() + ",X)", true);
                    kb.addClause("surfaceUsed(" + getParent().toLowerCase() + "," + (surfaceUsed + volume) + ")");
                    parent.setVariable("surfaceUsed", String.valueOf(surfaceUsed+volume));
                    break;
                case 2:
                    volume = Integer.parseInt(getVariable("volume"));
                    int belowUsed = Integer.parseInt(kb.query("belowUsed(" + getParent().toLowerCase() + ",X)").get(0).get(0).getTerm().toString());
                    kb.removeClause("belowUsed(" + getParent().toLowerCase() + ",X)", true);
                    kb.addClause("belowUsed(" + getParent().toLowerCase() + "," + (belowUsed + volume) + ")");
                    parent.setVariable("belowUsed", String.valueOf(belowUsed+volume));
                    break;
            }
        }
        kb.removeClause("isLocated(" + getId().toLowerCase() + ",X,Y)", true);
        kb.addClause("isLocated(" + getId().toLowerCase() + "," + getParent().toLowerCase() + "," + parentType + ")");
        if (!ignoreText) {
            System.out.println("You placed down the " + getName() + ".");
        }
    }
}
