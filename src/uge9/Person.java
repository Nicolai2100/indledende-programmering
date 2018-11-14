package uge9;

public class Person {
    protected String navn;

    public Person(String navn){
        this.navn = navn;
    }

    public String toString(){
        return "Person\n\t[navn="+getNavn()+"]";

    //Hvor Tap skal erst
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }
}
