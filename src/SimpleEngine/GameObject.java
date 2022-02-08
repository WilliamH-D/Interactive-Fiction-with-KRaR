package SimpleEngine;

import EnhancedEngine.KnowledgeBase;
import Game.GameController;
import Game.Main;

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
    private List<String> altDescs;
    private List<Set<String>> altDescConds;
    private Set<String> synonyms; // Generate automatically when parsing input rather than defining here (can be difference for enhanced engine)
    private Set<String> properties; // Static flags for this object
    private HashMap<String, String> variables;
    private String det;

    public GameObject(String n) {
        this.id = n.toUpperCase();
        this.name = n.toLowerCase();
        this.inside = new HashSet<>();
        this.onSurface = new HashSet<>();
        this.below = new HashSet<>();
        this.properties = new HashSet<>();
        this.variables = new HashMap<>();
        this.altDescs = new ArrayList<>();
        this.altDescConds = new ArrayList<>();
    }

    public String getId() { return this.id; }

    public void setParent(String parent, int newParentType) {
        // If this object already has a parent set, remove object as child of old parent
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
        this.setParentType(newParentType);
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

    public Set<String> getInside() {
        return inside;
    }

    public Set<String> getOnSurface() {
        return onSurface;
    }

    public Set<String> getBelow() {
        return below;
    }

    public ArrayList<String> hasDescendant(String objID) {
        ArrayList<String> path = new ArrayList<>();

        // Implement breadth first search to find descendant and path
        Queue<String> queue = new ArrayDeque<>();
        queue.add(this.id);

        while (queue.size() > 0) {
            GameObject curr = GameState.getGameObject(queue.remove());
            //System.out.println("Curr: " + curr.getId() + ", Children: " + Arrays.toString(curr.getChildren().toArray()));
            if (curr.id.equals(objID)) {
                // We have found the object
                path.add(0, objID);
                while (!(curr.id.equals(this.id))) {
                    curr = GameState.getGameObject(curr.parent);
                    path.add(0, curr.id);
                }

                return path;
            }
            queue.addAll(curr.getChildren());
        }
        return path;
    }

    public void setName(String name) { this.name = name; }

    public String getName() { return this.name; }

    public void setDet(String det) { this.det = det; }

    public String getDet() { return this.det; }

    public void setDesc(String desc) { this.desc = desc.replaceAll("%n", "\n"); }

    public void addAltDesc(String altDesc, Set<String> conds) {
        this.altDescs.add(altDesc.replaceAll("%n", "\n"));
        this.altDescConds.add(conds);
    }

    public String getDesc() {
        //Try all conditional alt descs first, then resort to default desc
        for (int i = this.altDescs.size() - 1; i >= 0; i--) {
            boolean flagsSatisfied = true;
            Set<String> iConds = this.altDescConds.get(i);
            for (String cond : iConds) {
                String[] flagParts = cond.split("=");
                GameFlag flag = GameState.getFlag(flagParts[0]);
                int checkVal = Integer.parseInt(flagParts[1]);
                if (flag.getValue() != checkVal) {
                    flagsSatisfied = false;
                    break;
                }
            }

            if (flagsSatisfied) {
                return this.altDescs.get(i);
            }
        }
        return this.desc;
    }

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

    public void setProperty(String property) {
        this.properties.add(property);
        KnowledgeBase.getInstance().addClause("hasProperty(" + id.toLowerCase() + "," + property.substring(1).toLowerCase() + ")");
    }

    public void removeProperty(String property) {
        this.properties.remove(property);
        KnowledgeBase.getInstance().removeClause("hasProperty(" + id.toLowerCase() + "," + property.substring(1).toLowerCase() + ")");
    }

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
        // Show basic object description
        System.out.println(getDesc());

        if (GameController.usingEnhancedEngine()) {
            for (Map.Entry<String, String> entry : variables.entrySet()) {
                if (!entry.getKey().equals("isClosed") && !entry.getKey().equals("capacityUsed") && !entry.getKey().equals("surfaceUsed") && !entry.getKey().equals("belowUsed")) {
                    System.out.println(" - " + entry.getKey() + " : " + entry.getValue());
                }
            }
        }

        // State if anything is in/on/under the item
        if (getChildren().size() == 0) {
            return;
        }

        if (inside.size() > 0) {
            if (!hasProperty("_CLOSABLECONTAINER") || (hasProperty("_CLOSABLECONTAINER") && !Boolean.parseBoolean(getVariable("isClosed")))) {
                System.out.println();
                System.out.println("The " + getName() + " contains:");
                for (String childID : inside) {
                    GameObject child = GameState.getGameObject(childID);
                    System.out.println(" -" + child.getName());
                }
            }
        }
        if (onSurface.size() > 0) {
            System.out.println();
            System.out.println("On top of the " + getName() + ", you can see:");
            for (String childID : onSurface) {
                GameObject child = GameState.getGameObject(childID);
                System.out.println(" - " + child.getName());
            }
        }
        if (below.size() > 0) {
            System.out.println();
            System.out.println("Below the " + getName() + ", you can see:");
            for (String childID : below) {
                GameObject child = GameState.getGameObject(childID);
                System.out.println(" - " + child.getName());
            }
        }
    }

    public void takeItem() {
        // Can't take item if there's stuff on top of it
        if (onSurface.size() > 0) {
            System.out.println("The " + getName() + " has stuff on top of it, you're unable to take it without removing them first!");
            return;
        }
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
        // Expose all items below it
        if (below.size() > 0) {
            Set<String> copy = new HashSet<>(below);
            for (String obj : copy) {
                GameState.getGameObject(obj).placeItem(true);
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
        String newParentID = parent.getId().toLowerCase();
        String oldParentID = getParent().toLowerCase();
        KnowledgeBase kb = KnowledgeBase.getInstance();

        // Remove volume from current parent
        if (hasVariable("volume") && kb.query("isObject(" + oldParentID + ")").size() > 0) {
            switch (getParentType()) {
                case 0:
                    int volume = Integer.parseInt(getVariable("volume"));
                    int capacityUsed = Integer.parseInt(kb.query("capacityUsed(" + oldParentID + ",X)").get(0).get(0).getTerm().toString());
                    kb.removeClause("capacityUsed(" + oldParentID + ",X)", true);
                    kb.addClause("capacityUsed(" + oldParentID + "," + (capacityUsed - volume) + ")");
                    parent.setVariable("capacityUsed", String.valueOf(capacityUsed-volume));
                    break;
                case 1:
                    volume = Integer.parseInt(getVariable("volume"));
                    int surfaceUsed = Integer.parseInt(kb.query("surfaceUsed(" + oldParentID + ",X)").get(0).get(0).getTerm().toString());
                    kb.removeClause("surfaceUsed(" + oldParentID + ",X)", true);
                    kb.addClause("surfaceUsed(" + oldParentID + "," + (surfaceUsed - volume) + ")");
                    parent.setVariable("surfaceUsed", String.valueOf(surfaceUsed-volume));
                    break;
                case 2:
                    volume = Integer.parseInt(getVariable("volume"));
                    int belowUsed = Integer.parseInt(kb.query("belowUsed(" + oldParentID + ",X)").get(0).get(0).getTerm().toString());
                    kb.removeClause("belowUsed(" + oldParentID + ",X)", true);
                    kb.addClause("belowUsed(" + oldParentID + "," + (belowUsed - volume) + ")");
                    parent.setVariable("belowUsed", String.valueOf(belowUsed-volume));
                    break;
            }
        }

        // Add the volume to in/on/below
        if (hasVariable("volume") && kb.query("isObject(" + newParentID + ")").size() > 0) {
            switch (parentType) {
                case 0:
                    int volume = Integer.parseInt(getVariable("volume"));
                    int capacityUsed = Integer.parseInt(kb.query("capacityUsed(" + newParentID + ",X)").get(0).get(0).getTerm().toString());
                    kb.removeClause("capacityUsed(" + newParentID + ",X)", true);
                    kb.addClause("capacityUsed(" + newParentID + "," + (capacityUsed + volume) + ")");
                    parent.setVariable("capacityUsed", String.valueOf(capacityUsed+volume));
                    if (!ignoreText) {
                        System.out.println("You placed down the " + getName() + " inside of the " + parent.getName() + ".");
                    }
                    break;
                case 1:
                    volume = Integer.parseInt(getVariable("volume"));
                    int surfaceUsed = Integer.parseInt(kb.query("surfaceUsed(" + newParentID + ",X)").get(0).get(0).getTerm().toString());
                    kb.removeClause("surfaceUsed(" + newParentID + ",X)", true);
                    kb.addClause("surfaceUsed(" + newParentID + "," + (surfaceUsed + volume) + ")");
                    parent.setVariable("surfaceUsed", String.valueOf(surfaceUsed+volume));
                    if (!ignoreText) {
                        System.out.println("You placed down the " + getName() + " on top of the " + parent.getName() + ".");
                    }
                    break;
                case 2:
                    volume = Integer.parseInt(getVariable("volume"));
                    int belowUsed = Integer.parseInt(kb.query("belowUsed(" + newParentID + ",X)").get(0).get(0).getTerm().toString());
                    kb.removeClause("belowUsed(" + newParentID + ",X)", true);
                    kb.addClause("belowUsed(" + newParentID + "," + (belowUsed + volume) + ")");
                    parent.setVariable("belowUsed", String.valueOf(belowUsed+volume));
                    if (!ignoreText) {
                        System.out.println("You placed down the " + getName() + " underneath of the " + parent.getName() + ".");
                    }
                    break;
            }
        }
        setParent(parent.getId(), parentType);
        kb.removeClause("isLocated(" + getId().toLowerCase() + ",X,Y)", true);
        kb.addClause("isLocated(" + getId().toLowerCase() + "," + newParentID + "," + parentType + ")");
    }
}
