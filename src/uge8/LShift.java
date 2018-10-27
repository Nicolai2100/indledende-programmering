package uge8;

import java.util.Scanner;

public class LShift {

	public static void main(String[] args) {
		int[] ints = parseInput();

        System.out.println(toString(metodenShift(ints)));
	}

	private static int[] parseInput() {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		String[] strings = input.split(" ");
		int[] ints = new int[strings.length]; 
		for (int i = 0;i<ints.length;i++) {
			ints[i] = Integer.parseInt(strings[i]);
		}
		scan.close();
		return ints;
	}
	public static int [] metodenShift(int [] ints){

		int [] shift = new int [ints.length];

		for (int i = 0; i < ints.length-1; i++) {
			shift[i] = ints[i+1];
		}
        shift[shift.length-1] = ints[0];

		return shift;
	}
	public static String toString(int [] shift){
		String printString = "";
		for (int i = 0; i < shift.length; i++) {
			printString += shift[i];
			for (int j = 0; j < shift.length - 1; j++) {
			printString += " ";
			}
		}
		return printString;
	}

}
/*Write a program that returns an array that is "left shifted"
 by one compared to the input array -- so {6, 2, 5, 3} returns {2, 5, 3, 6}.
 You may modify and return the given array, or return a new array.

6 2 5 3→ 2 5 3 6
1 2 → 2 1
1 → 1*/

