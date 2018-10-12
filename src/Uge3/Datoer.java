package Uge3;

import java.util.Scanner;

public class Datoer {
    public static void main(String[] args) {

        int daysInMonth = 0, dagInd, månedInd, årInd, dagUd, månedUd, årUd;
        String korrektUdregnet;

        Scanner scan = new Scanner(System.in);

        System.out.println("Indtast år: ");
        årInd = scan.nextInt();

        System.out.println("Indtast måned: ");
        månedInd = scan.nextInt();

        System.out.println("Indtast dag: ");
        dagInd = scan.nextInt();

        // for at beregne antal dage i måneden og gemmer resultatet i daysInMonth
        switch (månedInd) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                daysInMonth = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                daysInMonth = 30;
                break;

            case 2:
                if (årInd % 4 == 0 && årInd % 100 != 0 || årInd % 400 == 0) {
                    daysInMonth = 29;
                } else {
                    daysInMonth = 28;
                }
        }

        //Vurderer om inputtet er en korrekt dato
        if (dagInd < 1 || dagInd > 31 || månedInd < 1 || månedInd > 12 || årInd < 0 || dagInd > daysInMonth) {
            System.out.println("Ugyldig dato");
        }
        else { //Hvis ikke inputtet er forkert, går beregningen videre:

            // Beregner dagUd
            if (dagInd == daysInMonth && månedInd != 12) {
                dagUd = 1;
                månedUd = månedInd + 1;
                årUd = årInd;
                System.out.println("Dagen efter " + dagInd + "/" + månedInd + " " + årInd + " er " + dagUd + "/" + månedUd + " " + årUd);
            } else if (dagInd < daysInMonth) {
                dagUd = dagInd + 1;
                månedUd = månedInd;
                årUd = årInd;
                System.out.println("Dagen efter " + dagInd + "/" + månedInd + " " + årInd + " er " + dagUd + "/" + månedUd + " " + årUd);
            } else {
                dagUd = 1;
                månedUd = 1;
                årUd = årInd + 1;
                System.out.println("Dagen efter " + dagInd + "/" + månedInd + " " + årInd + " er " + dagUd + "/" + månedUd + " " + årUd);
            }
       }
    }
}
