package uge7;

public class Matrix{

    public static void main(String[] args){
        int [][] a={{1,2}, // 0. row
                {3,1}}; // 1. row
        int [][] b={{1,1,1}, // 0. row
                {1,1,1}}; // 1. row
        int[][] c;
        //printmatrix(a);
        //printmatrix(b);
        if (a[0].length==b.length){
            // column length in "a" is same as
            // row length in "b"
            //c= multi(a,b);
            //printmatrix(c);
        } else{
            System.out.print("matrixmultiplikation kan ikke udføres");
        }
    }
}


/*Klassen Matrix multiplicerer 2 matricer og udskriver resultatet.
 Skriv de statiske metoder printMatrix(…) og multiplication(…).
  Vedlagt er starten på Matrix klassen Hint: Rækkeantal for matricen a er
  givet ved a.length og søjleantal er givet ved a[0].length. I hver at de to
   metoder kan der indgå en dobbelt for-sætning der bruges til at gennemløbe matricen.
Til de der ikke kan huske hvordan man ganger to matricer sammen:*/
