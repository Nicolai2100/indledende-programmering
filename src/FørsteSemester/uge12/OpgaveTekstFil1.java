package FørsteSemester.uge12;

import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class OpgaveTekstFil1 {
    public int [] ints1;
    public int [] ints2 = new int[10];
    //File dataFil = new File(".\\src\\data");

    public int [] ints(){
        ints1 = new int[10];
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            int randomInt = 1+rand.nextInt(10);

            while(ints1[i] == randomInt) {
                randomInt = rand.nextInt(10);
            }
                    ints1[i] = randomInt;
        }
        return ints1;
    }

    public static void main(String[] args) throws IOException {

        FileWriter fw = new FileWriter(".\\src\\FørsteSemester.uge12\\data");
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter outFile = new PrintWriter(bw);

        OpgaveTekstFil1 opgaveTekstFil1 = new OpgaveTekstFil1();
        Scanner scan = new Scanner(System.in);
        int [] printFil1 = opgaveTekstFil1.ints();
        int [] printFil2 = opgaveTekstFil1.ints();

        for (int ints : printFil1) {
            outFile.print(ints + " ");
        }
        outFile.println();
        for (int ints : printFil2) {
            outFile.print(ints + " ");
        }

        outFile.flush();
        outFile.close();

    }
}
