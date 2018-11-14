package uge9;

public class Studerende extends Person {
    private String studienummer;

    public Studerende(String navn) {
        super(navn);
    }

    public String getStudienummer() {
        return studienummer;
    }

    public void setStudienummer(String studienummer) {
        this.studienummer = studienummer;
    }
}
