package Uge3;

public class SammenlignDoubles {
    public static void main(String[] args) {

        /*4.8 Sammenlign to doubles.
                Lav et program:
        Start med at definere to doubles d1 og d2;
        Lav et stykke kode som udskriver true hvis de 2 double er ens og false hvis de 2 double er forskellige.
                Sørg for at der udskrives true hvis de 2 double er næsten ens.
        Det vil sige at tæt ved hinanden i talsystemet som gemmer double.
                Find passende testdata. Vi skal have meget store tal, meget små tal,
        samt nogen som ligge tæt på hinanden og som skal udskrive true.
                Hint:	Du kan eventuelt anvende metoden:
        Double.doubleToLongBits(double)
        Som retunerer en long.
*/

        double d1, d2;
        d1 = 5.1;
        d2 = 5.1000000000001;
        double a = Double.doubleToLongBits(d1);
        double b = Double.doubleToLongBits(d2);
        if (a == b)
            System.out.println("true");

        else
            System.out.println("false");


    }
}
