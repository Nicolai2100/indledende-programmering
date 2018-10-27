package uge4;

import java.util.Scanner;

public class Gætnavn2 {
    public static void main(String[] args) {

        //Get name method

        //Initialize whether the lexicographically checker = 0
        boolean nameFound = false;

        //Get Name for be guessed
        Scanner scan = new Scanner(System.in);

        String navn = scan.next();

        do {
            //Get candidate name
            String guess = scan.next();
/*

            // Compare length -3
            // 1. Too short
            if (guess.length() < navn.length()) {
                System.out.println("For kort");
            }
            // 2. Too long name
            else if (guess.length() > navn.length()) {
                System.out.println("For langt");
            }
            // 3. else compare lexigraphically
            else {
*/

                int guessOffset = guess.compareToIgnoreCase(navn);

                // 3.1 Overshot
                if (guessOffset > 0) {
                    System.out.println("Mit navn er før i alfabetet.");
                }

                // 3.2 Undershot
                else if (guessOffset < 0) {
                    System.out.println("Mit navn er efter i alfabetet.");
                }

                // 3.3 Match found
                else {
                    System.out.println("Du gættede rigtigt.");
                    nameFound = true;
                }
           // }
        }
        while(!nameFound);
    }
}
