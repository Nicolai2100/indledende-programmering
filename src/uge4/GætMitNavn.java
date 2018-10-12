/*
import java.util.Scanner;

public class GætMitNavn {
    public static void main(String[] args) {
    */
/*
    5.3 Gæt mit navn (do while)
    https://dtu.codejudge.net/02312-02314-e18/exercise/7720/view
    Ekstra opgave.
    Lav et program, hvor brugeren skal gætte dit navn:
    Programmet skal blive ved med at bede om et navn, indtil dit navn er gættet.
    Når der gættes forkert, skal programmet hjælpe ved at fortælle,
    om dit navn kommer alfabetisk før eller efter det forkerte navn.
*//*

    */
/*Scanner scan = new Scanner(System.in);
    String input = "nicolaa";
    String navn = "nicolai";
    *//*
*/
/*String placering = "";
    int inputLength;
    int søger = 0;
    char inputChar = '0';
    char navnChar = '0';
    String udsendt = "Fejl";
    *//*

    int compare = input.compareToIgnoreCase(navn);
    System.out.println(compare);

    do {
    */
/*    System.out.println("Gæt mit navn!");
        //input = scan.next();
        navn = navn.toLowerCase();
        input = input.toLowerCase();
        inputLength = input.length();

        if (input.charAt(0) == navn.charAt(0))

            for (int i = 0; i < navn.length() ; i++)
            {
                inputChar = input.charAt(i);
                navnChar = navn.charAt(i);

                if (inputChar > navnChar)
                    udsendt = "Mit navn ligger før i alfabetet";

                else if (inputChar < navnChar)
                    udsendt = "Mit navn ligger før i alfabetet";

            }

        else if (input.charAt(0) > navn.charAt(søger)){
            udsendt = "Mit navn ligger før i alfabetet";
        }
        else if (input.charAt(0) < navn.charAt(søger)) {
            udsendt = "Mit navn ligger efter i alfabetet";
        }
*//*

        //søger++;
        System.out.println(udsendt);
        input = scan.next();
        }
        while(!input.equalsIgnoreCase(navn));

        System.out.println("Du har gættet rigtigt! 2");
    }
}
*/
