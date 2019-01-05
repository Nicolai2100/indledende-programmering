package FørsteSemester.uge2;

import java.util.Scanner;

public class KonverteringAfTid {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

/*
        Lav et program, der (1) læser et antal sekunder ind og (2) skriver hvor mange dage,
        timer, minutter og sekunder det angivne antal sekunder svarer til, for eksempel:

        238577 seconds equals 2 days, 18 hours, 16 minutes and 17 seconds.

                Indlæs antal sekunder med Scanner og output resultatet formateret som ovenfor
*/

        int sekunderInd = scan.nextInt();

        int dage, timer, minutter, sekunder;
        int sekunderPåDag = 86400;
        int sekunderPåTime = 3600;
        int sekunderPåMinut = 60;

        dage = sekunderInd/sekunderPåDag;
        int leftOvers = sekunderInd%sekunderPåDag;

        timer = leftOvers/sekunderPåTime;
        int leftOver2 = leftOvers%sekunderPåTime;

        minutter = leftOver2/sekunderPåMinut;

        sekunder = leftOver2%sekunderPåMinut;

        System.out.println(sekunderInd +" seconds equals "+ dage + " days, " + timer + " hours, "+ minutter + " minutes and " + sekunder + " seconds." );
       }

}
