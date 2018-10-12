package uge1;

import java.util.Scanner;
import java.io.*;
import java.util.Arrays;

public class MindsteTal {
    public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);
        double tal1 = scan.nextDouble();
        double tal2 = scan.nextDouble();
        double tal3 = scan.nextDouble();

        double [] a = new double[3];
        a[0] = tal1;
        a[1] = tal2;
        a[2] = tal3;


        Arrays.sort(a);

        System.out.println(a[0]);
}
}