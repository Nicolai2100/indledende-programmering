package Uge3;

public class ØveLoop {
    public static void main(String[] args) {

        int input = 3;
        int i, j , k;
        //Beregner og udskriver antallet af pyramider
        for (int pyramid = 0 ; pyramid < input ; pyramid++) {
            System.out.println("Pyramide " + (pyramid+1));

            //Beregner antallet af rækker
            for (int rækker = 0 ; rækker >= pyramid ; rækker++) {

/*
                //Beregner for hver pyramide hvad der skal ske
                for (i = 0; i < pyramid; i++) {
*/
/*
                    //Beregner og udskriver antallet af mellemrum
                    for (j = 0; j < input - i; j++) {
                        System.out.print(" ");
*/
                    //Beregner og udskriver antallet af stjerner
                    for (k = 1; k <  rækker ; k++) {
                        System.out.print("*");
                    }
                    System.out.println();
//                }
            }}
//        }

    }
}
