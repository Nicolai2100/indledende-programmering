package Uge3;

import java.util.Scanner;

public class Pyramide {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        int pyramid, rækker, hash, dot1, dot2;
        String sDot1 = ".";
        String sHash = "#";
        for (pyramid = 1 ; pyramid <= input ; pyramid++)
        {   System.out.println("Pyramid " + pyramid);

            for (rækker = 1 ; rækker <= pyramid ; rækker++)
            {
                for (dot1 = 1 ; dot1 > rækker - pyramid+1; dot1--)//Det skal give det tal, man per række ønsker udskrevet
                {
                    System.out.print(sDot1);
                }
                for (hash = 1 ; hash <= 2*rækker-1; hash++) //Det skal give det tal, man per række ønsker udskrevet
                {
                    System.out.print(sHash);
                }
                for (dot1 = 1 ; dot1 > rækker - pyramid+1; dot1--)//Det skal give det tal, man per række ønsker udskrevet
                {
                    System.out.print(sDot1);
                }
                System.out.println();
            }
        }
    }
}
