import java.lang.reflect.Array;
import java.util.*;

public class Histrogram {
    Scanner scan = new Scanner(System.in);
    //Lav metode
    public void histogramMethod(){
        //Input variabel
        String input = "99 100 1 2 3 4 10";
        //= scan.nextLine();

        String [] integerStrings = input.split(" ");

        int[] integers = new int[integerStrings.length];

        for (int i = 0; i < integerStrings.length ; i++){

            integers[i] = Integer.parseInt(integerStrings[i]);
        }
        System.out.println(integers[0]);

        Arrays.sort(integers);
        System.out.println(integers[0]);
        int [] sorted = new int[10];

       /* for (int i = 1 ; i <= integers.length ; i++)
        {
            if (integers[i] <= i*10)
                sorted[i]= +1;
            System.out.println("*");
        }*/

        System.out.print(
        "1  - 10  |") ;
        for (int i = 0 ; i < integers[0] ; i++) {
            System.out.println(" *");
        }
        System.out.print(
                "11  - 20  |") ;
        for (int i = 1 ; i <= integers[1] ; i++) {
            System.out.println(" *");
        }
        System.out.print(
                "21  - 30  |") ;
        for (int i = 2 ; i <= integers[2] ; i++) {
            System.out.println(" *");
        }
        System.out.print(
                "31  - 40  |") ;
        for (int i = 3 ; i <= integers[3] ; i++) {
            System.out.println(" *");
        }
        System.out.print(
                "41  - 50  |") ;
        for (int i = 4 ; i <= integers[4] ; i++) {
            System.out.println(" *");
        }
        System.out.print(
                "51  - 60  |") ;
        for (int i = 5 ; i <= integers[5] ; i++) {
            System.out.println(" *");
        }
        System.out.print(
                "61  - 70  |") ;
        for (int i = 6 ; i <= integers[6] ; i++) {
            System.out.println(" *");
        }


    /* + "\n"+
        "11 - 20  |"     + "\n"+
        "21 - 30  |"    + "\n"+
        "31 - 40  |"    + "\n"+
        "41 - 50  |"    + "\n"+
        "51 - 60  |"    + "\n"+
        "61 - 70  |"    + "\n"+
        "71 - 80  |"    + "\n"+
        "81 - 90  |"    + "\n"+
        "91 - 100 |"    + "\n"   );
*/











    }
    public static void main(String[] args) {
        Histrogram histogram = new Histrogram();
        histogram.histogramMethod();

        /*Design and implement an application that creates a histogram that allows you to
        visually inspect the frequency distribution of a set of values. The program should read in
        an arbitrary number of integers (on one line) that are in the range 1 to 100 inclusive;
        then produce a chart similar to the one below that indicates how many input values fell in the range 1 to 10
        , 11 to 20, and so on. Print one asterisk for each value entered.

1  - 10  | *****
11 - 20  | **
21 - 30  | *******************
31 - 40  |
41 - 50  | ***
51 - 60  | ********
61 - 70  | **
71 - 80  | *****
81 - 90  | *******
91 - 100 | **********/

    }
}
