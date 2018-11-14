package uge9;

public class Ansat extends Person{
    protected String institutnavn;

    public Ansat(String navn, String institutnavn) {
        super(navn);
        this.institutnavn = institutnavn;
    }

    public void setInstitutnavn(String institutnavn) {
        this.institutnavn = institutnavn;
    }

    public String getInstitutnavn() {
        return institutnavn;
    }

    @Override
    public String toString() {
        return super.toString()+ "";
    }
}
