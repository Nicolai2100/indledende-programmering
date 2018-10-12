package uge2;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class CheckAfKode {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

     /*   Lav et program der:

                Checker, at længden af passwordet er større end 4 og mindre end 9.
        Udskriver "Password for kort" hvis under 5, "Password for langt" hvis over 8 eller "Password tilpas".
                Hint:	Brug en betinget sætning (se kapitel 5.1- 5.4) og konstanter.*/

        String passwordInput = scan.nextLine();

        int passLength = 0;

        passLength = passwordInput.length();
        //int a =0;


            if (passLength > 4 && passLength < 9) {
            System.out.println("Password tilpas");
            }

            else if (passLength > 8) {
            System.out.println("Password for langt");
            }

            else {
            System.out.println("Password for kort");
            }
       }

    }

/*
        while (passLength < 5)
    {
        System.out.println("Password for kort");
        passLength = scan.next().length();
*/



