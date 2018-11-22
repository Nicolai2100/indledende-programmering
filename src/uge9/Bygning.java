package uge9;

public class Bygning {
    private int areal;
    private int kvadratmeterpris;

    public Bygning(int areal, int kvadratmeterpris){
        this.areal = areal;
        this.kvadratmeterpris = kvadratmeterpris;
    }

    public int vurdering(){
        int vurdering = areal * kvadratmeterpris;
        return vurdering;
    }

   /* Spm. 1. Skriv klassen Bygning. En Bygning er kendetegnet ved sit areal
            (f.eks. 200 kvadratmeter) og en kvadratmeterpris (f.eks. 8000 kroner pr.
    kvadratmeter); begge er heltal. Klassen Bygning skal have en konstruktør der kan kaldes
    som vist i metoden main ovenfor. Desuden skal klassen have en metode int vurdering()
    der beregner og returnerer bygningens vurdering (ved at gange arealet med kvadratmeterprisen).*/
}
