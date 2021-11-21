package SimpleEngine.Actions.Effects;

import SimpleEngine.Actions.Effect;

public class TellEff extends Effect {

    private String text;

    public TellEff(String text) {
        this.text = text;
    }

    @Override
    public boolean performAction() {
        System.out.println();
        System.out.println(text);
        return true;
    }
}
