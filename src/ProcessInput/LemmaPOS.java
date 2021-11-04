package ProcessInput;

public class LemmaPOS {
    private String lemma;
    private String pos;

    public LemmaPOS(String lemma, String pos) {
        this.lemma = lemma;
        this.pos = pos;
    }

    public String getLemma() { return this.lemma; }
    public String getPos() { return this.pos; }
}
