package FørsteSemester.uge6;

import java.util.Scanner;
import java.util.Arrays;

import static java.lang.StrictMath.round;

public class Middelværdi {

    public static void main(String[] args) {
        //Get input
        Scanner scan = new Scanner(System.in);
        //Get string input
        String input = scan.nextLine();
        //Save in a string array and divide when " "
        String [] integerStrings = input.split(" ");

        //Create integer array to store the String array values
        int[] integers = new int[integerStrings.length];

        //Parse all the values and add them to the int array
        for (int i = 0; i < integerStrings.length ; i++){
            integers[i] = Integer.parseInt(integerStrings[i]);
        }
        Arrays.sort(integers);
        //Calculate the mean
        double mean = 0;
        for (int index = 0; index < integers.length; index++)
        {
            mean += integers[index];
        }
        mean = (mean/integers.length);
        //Calculate the standard deviation
        double standardDeviation = 0;
        for (int index = 0; index < integers.length; index++)
        {
            standardDeviation += Math.pow((integers[index]-mean), 2);
        }
        double newSD = Math.sqrt((standardDeviation/(integers.length)));

        System.out.println("Mean: " + mean);
        System.out.print("Standard deviation: " +String.format("%.14f", newSD));

    }
}
/*Opgave
Design and implement an application that computes and prints the
mean and standard deviation of a list of integers x1 through xn.
Assume that there will be no more than 50 input values.
Compute both the mean and standard deviation as floating point values.
Tallene skal indlæses fra konsollen og er adskilt af mellem rum: eks:
"1 2 3 4"
Outputtet skal formatteres som følger:
"Mean: 2.5"
"Standard deviation: 1.2909"
Spredningen (standard deviation) kan beregnes via følgende formel:

hvor N er antallet af observationer, xi er den aktuelle måling og  er gennemsnittet.*/