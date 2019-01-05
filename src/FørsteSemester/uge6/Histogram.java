package FørsteSemester.uge6;
import java.util.Arrays;
import java.util.Scanner;

public class Histogram {
    public static void printStar(int n){
        if(n > 0){
            System.out.print("*");
            printStar(n-1);
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Get string input
        String input = scan.nextLine();
        //String input = "11 22 1 2 3 4 30";
        //Save in a string array and divide when " "
        String [] integerStrings = input.split(" ");
        //Create integer array to store the String array values
        int[] integers = new int[integerStrings.length];

        //Parse all the values and add them to the int array
        for (int i = 0; i < integerStrings.length ; i++){
            integers[i] = Integer.parseInt(integerStrings[i]);
        }
        //Sort the array
        Arrays.sort(integers);

        //Create a new int array that holds a value of 1 for each
        //of the different 10's
        int [] numberOfTens = new int [10];
        int current;
/*
        // Count the number of each number occurrence
        for (int index = 0; index < integers.length; index++)
        {
            current = integers[index];
            if (current >= 1 + (index * 10) && current <= (10) + (index * 10))
                numberOfTens[current-(1+index*10)]++;
        }
*/
        // Count the number of each letter occurrence
        for (int index = 0; index < integers.length; index++) {
            current = integers[index];
            if (current >= 1 && current <= 10)
                numberOfTens[0]++;
            else if(current >= 11 && current <= 20)
                numberOfTens[1]++;
            else if(current >= 21 && current <= 30)
                numberOfTens[2]++;
            else if(current >= 31 && current <= 40)
                numberOfTens[3]++;
            else if(current >= 41 && current <= 50)
                numberOfTens[4]++;
            else if(current >= 51 && current <= 60)
                numberOfTens[5]++;
            else if(current >= 61 && current <= 70)
                numberOfTens[6]++;
            else if(current >= 71 && current <= 80)
                numberOfTens[7]++;
            else if(current >= 81 && current <= 90)
                numberOfTens[8]++;
            else if(current >= 91 && current <= 100)
                numberOfTens[9]++;
        }
        // Print the results
        for (int number =0; number < numberOfTens.length; number++)
        {
            System.out.print (1 + (number*10) + " - " + (10+(10*number)) + "  | ");
            printStar(numberOfTens[number]);

        }
    }
}

