package FørsteSemester.Uge3;

import java.util.Scanner;

public class Passwordchecker {

    public static void main(String[] args) {
/*
        Ændr programmet fra sidste uge, så programmet bliver ved med at indlæse et password
        fra konsollen, indtil brugeren har indtastet et korrekt et.
        Bemærk: der skal ikke udskrives noget til brugeren før passwordet indlæses.
*/
        Scanner scan = new Scanner(System.in);

        int passLength;

        boolean a = false;

        while (a == false) {

            String passwordInput = scan.nextLine();
            passLength = passwordInput.length();

            if (passLength > 4 && passLength < 9) {
                a = true;
                System.out.println("Password tilpas");
            }
            else if (passLength > 8) {
                System.out.println("Password for langt");
            }
            else {
                System.out.println("Password for kort");
            }
        }
    }

}







