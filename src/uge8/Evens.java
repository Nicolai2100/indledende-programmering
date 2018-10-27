package uge8;

import java.util.Scanner;

public class Evens {

	public static void main(String[] args) {
		int[] ints = parseInput();

		System.out.println(metoden(ints));
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
	private static int metoden(int [] ints ){
		int numberOfEvens = 0;

		for (int intsI: ints)
			{
				if (intsI % 2 == 0)
					numberOfEvens++;
			}

		return numberOfEvens;
	}
	public String toString(){

		String printString = "";
		return printString;
	}

}
