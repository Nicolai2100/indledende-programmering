package Uge3;

import java.util.Scanner;

public class SinusFunktion {
    public static void main(String[] args) {

        /*Skriv et program der kan plotte n sinus-perioder med 16 "samples" i konsollen.
        Amplituden skal svare til 20 tegn. Programmet skal indlæse et tal fra konsollen:


                    *
                    |      *
                    |             *
                    |                 *
                    |                   *
                    |                 *
                    |             *
                    |      *
                    *
             *      |
      *             |
  *                 |
*                   |
  *                 |
      *             |
             *      |
*/
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int i = 1 ; i <= n; i++ ){

            System.out.println("                   *");
            System.out.println("                   |      *");
            System.out.println("                   |             *");
            System.out.println("                   |                 *");
            System.out.println("                   |                   *");
            System.out.println("                   |                 *");
            System.out.println("                   |             *");
            System.out.println("                   |      *");
            System.out.println("                   *");
            System.out.println("            *      |");
            System.out.println("     *             |");
            System.out.println("  *                |");
            System.out.println("*                  |");
            System.out.println("  *                |");
            System.out.println("     *             |");
            System.out.println("            *      |");



        }

    }
}
