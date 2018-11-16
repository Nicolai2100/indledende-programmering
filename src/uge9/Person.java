package uge9;

class Person {
    protected String navn;

    public Person(String navn){
        this.navn = navn;
    }

    public String toString(){
        return "class "+ getClass().getName() +"\n\t[navn="+getNavn()+"]";

    //Hvor Tap skal erst
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }
}

class Ansat extends Person{
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
        return super.toString()+ "\n\t[institutnavn="+getInstitutnavn()+"]";
    }
}

 class Studerende extends Person {
    private String studienummer;

    public Studerende(String navn, String studienummer) {
        super(navn);
        this.studienummer = studienummer;
    }

    public String getStudienummer() {
        return studienummer;
    }

    public void setStudienummer(String studienummer) {
        this.studienummer = studienummer;
    }

    @Override
    public String toString(){
        return super.toString()+ "\n\t[studienummer="+studienummer+"]";
    }
}

class Tap extends Ansat {

    private int arbejdstid;

    public Tap(String navn, String institutnavn, int arbejdstid) {
        super(navn, institutnavn);
        this.arbejdstid = arbejdstid;
    }

    @Override
    public String toString() {
        return super.toString() + "\n\t[arbejdstid="+arbejdstid+"]";
    }
}

 class Vip extends Ansat {
    private String [] kurser;
    public Vip(String navn, String institutnavn, String [] kursus)
    {
        super(navn, institutnavn);
        kurser = kursus;
    }
    @Override
    public String toString() {
        //For alle kurser!
        String returnS = super.toString() + "\n\t";
        for (String kurser:kurser) {
            returnS += "[kursus="+kurser+"]"+ "\n\t";
        }
        return returnS;
    }
}
