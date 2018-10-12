import java.util.Scanner;

public class Trekanter {

    /*
    5.2 Trekanter
    https://dtu.codejudge.net/02312-02314-e18/exercise/7719/view
    Udvikl et program, der indlæser længden af siderne i en trekant
    og udskriver, hvilken slags trekant, det er.
    Bestående af faserne analyse, design, implementering og test.
    Sørg for at komme gennem alle faserne og diskuter dem eventuelt med øvelsesvejlederne.

*/
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean a = true;
        double A, B, C;

        System.out.println("Indtast sidelængden a: ");
        A = scan.nextDouble();
        System.out.println("Indtast sidelængden b: ");
        B = scan.nextDouble();
        System.out.println("Indtast sidelængden c: ");
        C = scan.nextDouble();

        if (A >= B + C || B >= A + C || C >= A + B)
        System.out.println("Noget er galt!");
        else if (A == B && A == C)
        System.out.println("Trekanten er ligesidet");
        else if (A == B || A == C || B == C)
        System.out.println("Trekanten er ligebenet");
        else if (Math.pow(A,2) + Math.pow(B,2) == Math.pow(C,2)  ||
                Math.pow(B,2) + Math.pow(C,2) == Math.pow(A,2)  ||
                Math.pow(C,2) + Math.pow(A,2) == Math.pow(B,2))
        System.out.println("Trekanten er retvinklet");
        else if (Math.acos( (A*A + B*B - C*C) / (2*A*B)) * 180/Math.PI < 90 )
            System.out.println("Trekanten er spids");
        else if (Math.acos( (A*A + B*B - C*C) / (2*A*B)) * 180/Math.PI > 90)
        System.out.println("Trekanten er stump");

    }
}
