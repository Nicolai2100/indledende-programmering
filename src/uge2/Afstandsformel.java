package uge2;

import java.util.*;

import static java.lang.Math.sqrt;

public class Afstandsformel {
    public static void main(String[] args) {
// 03.1 Afstand fra linje til punkt


//        For at CodeJudge kan forstå inputtet skal det formatteres som 4 doubles adskilt af mellemrum:
  //      a b x0 y0


        Scanner scan = new Scanner(System.in);

        double a, b, x0, y0, d;

        a = scan.nextDouble();
        b = scan.nextDouble();
        x0 = scan.nextDouble();
        y0 = scan.nextDouble();

        d = Math.abs(((a*x0)+(b-y0)))/Math.sqrt(a*a+1);

        System.out.println(d);
    }
}
