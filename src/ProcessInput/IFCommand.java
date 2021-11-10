package ProcessInput;

import SimpleEngine.GameObject;

public class IFCommand {

    private String functor;
    private GameObject arg1;
    private GameObject arg2;

    public IFCommand() {}

    public IFCommand(String f) { this(f, null); }

    public IFCommand(String f, GameObject arg) { this(f, arg, null); }

    public IFCommand(String f, GameObject arg1, GameObject arg2) {
        this.functor = f;
        this.arg1 = arg1;
        this.arg2 = arg2;
    }

    public void setFunctor(String f) { this.functor = f; }

    public String getFunctor() { return this.functor; }

    public void setFirstArg(GameObject arg) { this.arg1 = arg; }

    public GameObject getFirstArg() { return this.arg1; }

    public void setSecondArg(GameObject arg) { this.arg2 = arg; }

    public GameObject getSecondArg() { return this.arg2; }

    public void printCommand() {
        if (arg2 != null && arg1 != null) {
            System.out.println(functor + "([" + arg1.getId() + "],[" + arg2.getId() + "])");
        }
        else {
            if (arg1 != null) {
                System.out.println(functor + "([" + arg1.getId() + "])");
            }
            else {
                System.out.println(functor + "()");
            }
        }
    }
}
