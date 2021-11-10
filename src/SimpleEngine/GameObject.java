package SimpleEngine;

import java.util.*;

public class GameObject {
    private String id;
    private GameObject parent;
    private ArrayList<GameObject> children;
    private String desc;
    private String[] synonyms; // Generate automatically when parsing input rather than defining here (can be difference for enhanced engine)
    private ArrayList<ObjectFlag> flags;
    private Map<String, Integer> intVars;

    public GameObject(String n) {
        this.id = n.toUpperCase();
    }

    public String getId() { return this.id; }

    public GameObject getParent() { return this.parent; }

    public ArrayList<GameObject> getChildren() { return this.children; }

    public ArrayList<GameObject> hasDescendant(GameObject obj) {
        // Todo: Might be a better way than to match on IDs
        ArrayList<GameObject> path = new ArrayList<>();

        // Implement breadth first search to find descendant and path
        Queue<GameObject> queue = new ArrayDeque<>();
        queue.add(this);

        while (queue.size() > 0) {
            GameObject curr = queue.remove();
            if (curr.id.equals(obj.id)) {
                // We have found the object
                path.add(0, obj);
                while (!(curr.id.equals(this.id))) {
                    curr = curr.parent;
                    path.add(0, curr);
                }

                return path;
            }
            queue.addAll(curr.children);
        }
        return path;
    }

    public boolean setParent(GameObject parent) {
        if (this.parent != null) { this.parent.removeChild(this); }
        return parent.addChild(this);
    }

    public boolean addChild(GameObject child) {
        GameObject oldParent = child.parent;
        if (oldParent != null && !oldParent.removeChild(child)) { return false; }
        this.children.add(child);
        child.parent = this;
        return true;
    }

    private boolean removeChild(GameObject child) {
        if (this.children.contains(child)) {
            this.children.remove(child);
            return true;
        }
        return false;
    }

    public String getDesc() { return this.desc; }

    public boolean setFlag(ObjectFlag flag) {
        //Todo: Will need logic updating if flags have values
        if (this.flags.contains(flag)) { return false; }
        this.flags.add(flag);
        return true;
    }

    public boolean removeFlag(ObjectFlag flag) {
        //Todo: Will need logic updating if flags have values (want to remove by flag name)
        if (this.flags.contains(flag)) {
            this.flags.remove(flag);
            return true;
        }
        return false;
    }

    public boolean hasFlag(ObjectFlag flag) {
        //Todo: Will need logic updating if flags have values
        return this.flags.contains(flag);
    }

    public boolean updateFlag(ObjectFlag flag, int val) {
        //Todo: Implement once flags have been properly implemented
        return true;
    }

    public boolean action() {
        return false;
    }
}
