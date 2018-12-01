import uge12.ReadFile;
import uge9.*;

public class Main {
    public static void main(String[] args) {

        ReadFile read = new ReadFile();
        read.openFile(".\\src\\uge12\\data");
        int[]ints1 = read.readInts();
        int[]ints2 = read.readInts();

        for (int ints: ints1
             ) {
            System.out.print(ints + " ");
        }
        System.out.println();
        for (int ints: ints2
        ) {
            System.out.print(ints + " ");
        }

    }
}