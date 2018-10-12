package uge2;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        // Opgave 3.4

//        System.out.println("Hej bruger. Indtast A, B og C");

        Scanner scan = new Scanner(System.in).useLocale(Locale.ENGLISH);

        // Deklær variabler
        double A,B,C,D, x1, x2, x3;

        // Tilføj værdier

          A = scan.nextDouble(); B = scan.nextDouble(); C = scan.nextDouble();

        // D = B^2-4*A*C
        D = B*B-4*A*C;


        if (A == 0){
            //Kør videre med if som bester for B og C

            if (B == 0){

                //Hvis B og C er = 0 Er der ingen ligning.
                if (C == 0){
                    System.out.println("Ingen rødder");
                }
                else{
                    System.out.println("Ingen rødder");
                }

            }
            else{

                // A == 0 men B er ikke!
                x3 = -C/B;

                System.out.println( x3);
                }

        }

        //Hvis A ikke er 0 er der tre muligheder
        else{
                // To rødder
                if (D > 0 ) {

                    // x= -b+/- squeared d / 2*A
                    x1 = (-1*B + Math.sqrt(D))/(2*A);

                    x2 = (-1*B - Math.sqrt(D))/(2*A);

                    System.out.println(x1);
                    System.out.println(x2);

                }
                // Ingen rødder
                else if (D <0 ){
                    System.out.println("Ingen rødder");
                }
                //En rod
                else{
                    x3= -1*B/2*A;
                    System.out.println(x3);
                }
        }

// når a er nul og b ikke er nul =        x3 = -B/2*A;
       // x= -b+/- squeared d / 2*A
       //x1= (-1*B+ Math.sqrt(D))/(2*A);
        //x2= -B- Math.sqrt(D)/2*A;

       //System.out.println(D);
       // System.out.println("X1 = " + x1 + " X2 = " + x2 );
    }
}
