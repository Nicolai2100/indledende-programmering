package uge7;

public class Matrix{
    static String printMatrixLine1String = "";
    static String printMatrixLine2String = "";

    public static void printmatrix(int [][] a) {
        {
            // Loop through all rows
            for (int i = 0; i < a.length; i++)

                // Loop through all elements of current row
                for (int j = 0; j < a[i].length; j++)
                    System.out.print(a[i][j] + " ");
            System.out.println();
        }
    }
    public static int[][] multi(int a[][], int b[][]){
        int c[][] = {{0,0,0},{0,0,0}};
        //x [rows] [colums]
        c[0][0] = (a[0][0] * b[0][0]) + (a[0][1] * b[1][0]);
        c[0][1] = (a[0][0] * b[0][1]) + (a[0][1] * b[1][1]);
        c[0][2] = (a[0][0] * b[0][2]) + (a[0][1] * b[1][2]);

        c[1][0] = (a[1][0] * b[0][0]) + (a[1][1] * b[1][0]);
        c[1][1] = (a[1][0] * b[0][1]) + (a[1][1] * b[1][1]);
        c[1][2] = (a[1][0] * b[0][2]) + (a[1][1] * b[1][2]);

        return c;
    }

    public static void main(String[] args){
        int [][] a = {{1,2}, // 0. row
                     {3,1}}; // 1. row

        int [][] b = {{1,1,1}, // 0. row
                {1,1,1}}; // 1. row

        int[][] c;

        printmatrix(a);
        printmatrix(b);

        if (a[0].length == b.length){
            // column length in "a" is same as
            // row length in "b"
            c = multi(a,b);
            printmatrix(c);
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
