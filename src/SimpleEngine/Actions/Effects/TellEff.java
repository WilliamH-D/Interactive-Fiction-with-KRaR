package SimpleEngine.Actions.Effects;

import SimpleEngine.Actions.Effect;

public class TellEff extends Effect {

    private String text;

    public TellEff(String text) {
        this.text = text.replaceAll("%n", "\n");
    }

    @Override
    public boolean performAction() {
        System.out.println(text);
        return true;
    }

    @Override
    protected boolean effectLegalUnderEnhancedConstraints() {
        return false;
    }
}
