package FørsteSemester.Uge3;

import java.util.Scanner;


public class ASCHIItabel {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        /*Skriv et program som indlæser et tegn fra konsollen.
                Programmet skal herefter udskrive:
        "Tegnet er et stort bogstav"	for A-Z
        "Tegnet er et lille bogstav"	for a-z
        "Tegnet er et tal"	for 0-9
        "Tegnet er et af de 4 specialtegn"	(#, !, +, \)
        Hvis tegnet ikke er indenfor de 4 ovennævnte grupper skrives
        "Tegnet er ikke kendt af dette program"

        Hint: Brug deklarationen char A = 'A', yderligere findes unicode tegntabel i lærebogens appendiks C.

        Skriv programmet således at det ikke afslutter, men bliver ved med at
        indlæse et nyt tegn. Programmet skal afslutte hvis strengen "exit" indtastes.
*/

        String input1 = scan.nextLine();


        while (!input1.equals("exit") )
        {
            char input2 = input1.charAt(0);
            int c = (int)input2;

            if (48 <= c && c <= 57 ){
                System.out.println("Tegnet er et tal");
            }
            else if (65 <= c && c <= 90 ){
                System.out.println("Tegnet er et stort bogstav");
            }
            else if (97 <= c && c <= 122 ){
                System.out.println("Tegnet er et lille bogstav");
            }
            else if (c == 33 || c == 35 || c == 43 || c == 92){
                System.out.println("Tegnet er et af de 4 specialtegn");
            }
            else
                System.out.println("Tegnet er ikke kendt af dette program");

            input1 = scan.nextLine();


        }
    }
}
