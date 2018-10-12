/*
import java.util.ArrayList;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {

        String input = "100 99 20 1 2";
        String [] integerStrings = input.split(" ");

        int[] integers = new int[integerStrings.length];
        Arrays.sort(integers);

        for (int i = 0; i < integerStrings.length ; i++){

            integers[i] = Integer.parseInt(integerStrings[i]);
        }

        System.out.println(integers[0]);
        int nummer;
        int current;
        int [] talFordeling = new int [10];

        // Count the number of each letter occurrence
        for (int tal = 0; tal < integers.length; tal++)
        {
            current = integers[tal];
            if (current >= 1 + (tal * 10) && current <= (10) + (tal * 10))
                talFordeling[current-(1+tal*10)]++;
        }
        System.out.println(talFordeling[0]);
        System.out.println(talFordeling[1]);
        System.out.println(talFordeling[2]);
        System.out.println(integers[0]);

    }
}
*/
