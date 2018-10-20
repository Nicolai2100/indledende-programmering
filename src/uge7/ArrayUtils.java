package uge7;

public class ArrayUtils {

    static int sumOfArray = 0;
    static int occurenceResult = 0;
    static String arrayString = "";

    //returner en tegnstreng bestående af alle elementerne i tabellen a
    //adskilt af et mellemrum (space) mellem hvert tal.
    public static String arrayToString(int [] a){

        for (int index = 0; index < a.length; index++){
            arrayString += a[index] + " " ;
        }
        String arrayStringUd = arrayString.substring(0,(arrayString.length()-1));
        return "{" + arrayStringUd + "}";
    }

    //returner antallet af elementer i tabellen a, som er lig med n.
    //Eksempel: occurences(new int [] {1,3,3,2,1},3) giver 2.
    public static int occurences(int [] a, int n){

        for (int index = 0; index < a.length; index++){
            if (n == a[index])
            occurenceResult ++;
        }
        return occurenceResult;
    }
    //beregner summen af alle elementerne i tabellen a.
    public static int sum(int [] a){

        for (int index = 0; index < a.length; index++){
            sumOfArray += a[index];
        }
        return sumOfArray;
    }
    /*Denne opgave går ud på at lave nogle simple operationer på
     integer-tabeller i form af en klasse ArrayUtils. Alle metoderne
      i klassen skal erklæres public og static.
*/
}
