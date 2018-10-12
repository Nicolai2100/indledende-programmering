package uge1;

import java.util.Scanner;

public class Skat {

    public static void main(String [] args){

    int indkomst = 120000;
    int personfradrag = 33400;

    double ambi, pension, bundskat;

    ambi = indkomst * 8.0 / 100.0;
    pension = indkomst * 1.0 / 100.0;
        System.out.print("Arbejdsmarkedsbidrag: ");
        System.out.println(ambi);
        System.out.print("Særlig pensionsopsparing: ");
        System.out.println(pension);
        bundskat = (indkomst - ambi - pension - personfradrag) * 7.0 /100;

        System.out.println("Bundskat: " + bundskat);



}
}
