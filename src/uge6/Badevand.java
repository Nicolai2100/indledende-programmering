package uge6;

public class Badevand {
    static int max;
    static int antalFald;

    public static void main(String[] args){

        int[] badetemp = new int[args.length];

        for (int index = 0; index < args.length; index++){
            badetemp[index] = Integer.parseInt(args[index]);
        }

        System.out.println("Maksimum: " + maks(badetemp));
        System.out.println("Antal fald: " + antalfald(badetemp));
    }
    public static int maks(int[] badetemp){

        //Arrays.sort(badetemp);
        if (badetemp.length != 0){
            max = badetemp[0];
            for(int i = 0; i < badetemp.length; i++)
            {
                if(max < badetemp[i])
                {
                    max = badetemp[i];
                }
            }
            return max;
        }
        else
            return 0;
    }
    public static int antalfald(int[] badetemp)
    {
        antalFald = 0;
        int previous = badetemp[0];
        for(int i = 0; i < badetemp.length; i++)
        {
            if(previous > badetemp[i])
            {
                antalFald++;
            }
            previous = badetemp[i];
        }
        return antalFald;
    }

/*Spm. 1: Færdiggør metoden maks sådan at maks(badetemp) returnerer den
 største værdi i tabellen badetemp. Du kan gå ud fra, at alle tal i temp er
  større end eller lig med nul. Hvis tabellen badetemp er tom, så skal metoden returnere 0.
Spm. 2: Færdiggør metoden antalfald sådan, at antalfald(badetemp) returnerer
antallet af fald i tabellen temp. Dvs. antallet af gange hvor et mindre tal
følger lige efter et større tal i temp. (Det er antallet af gange hvor
badevandstemperaturen er faldet fra en uge til den næste).
Spm. 3: Vis, at når du udfører programmet, får du følgende udskrift: Maksimum: 18 Antal fald: 2
Spm. 4: Nu skal du ændre metoden main i programmet Badevand, sådan at indholdet
af tabellen badetemp tages fra kommandolinien. Eksempel: Hvis man kører det
 ændrede program med parametrene {"10", "12", "8", "11"}, så skal det give
  denne udskrift: Maksimum: 12 Antal fald: 1 Vis, hvordan den ændrede metode
   main skal se ud. Hint: Integer.parseInt("10") giver heltallet 10. (Afsnit 3.8)

NB Bemærk!: Inputtet skal indlæses som argumenter til main-metoden - ikke med en scanner!*/

}
