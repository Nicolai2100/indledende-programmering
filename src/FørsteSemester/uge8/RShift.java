package FørsteSemester.uge8;

import java.util.Scanner;

public class RShift {

	public static void main(String[] args) {
		int[] ints = parseInput();
		int[] newInts = new int[ints.length-1];

		System.out.println(toString(metodenShift(ints)));
	}

	private static int[] parseInput() {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		//String input = "1 1 1 2 3 1 4 5 6 7 8 9 4 5 1 2 22 44 55 66 88 99 55 11 22 1";
		String[] strings = input.split(" ");
		int[] ints = new int[strings.length]; 
		for (int i = 0;i<ints.length;i++) {
			ints[i] = Integer.parseInt(strings[i]);
		}
		scan.close();
		return ints;
	}

	public static int [] metodenShift(int [] ints){

		int [] shift = new int [ints.length-1];
		int n = ints[ints.length-1];

		if (n > 0 && n < 9){
		do {
			int count = 1;

			for (int j = 0; j < shift.length-1; j++) {
				shift[count] = ints[j];
				count++;
			}

			shift[0] = ints[ints.length-2];
			n--;
		}while(n!=0);

		}

		else if(n<0){
			do {
				int count = 1;

				for (int j = 0; j < shift.length-1; j++) {
					shift[j] = ints[count];
					count++;
				}

				shift[ints.length-2] = ints[0];
				n++;
			}while(n!=0);

		}
		else //(n == 0)
		{
			for (int i = 0; i < shift.length; i++) {
				shift[i]=ints[i];
			}
		}
		return shift;

	}
	public static String toString(int [] shift){
		String printString = "";
		for (int i = 0; i < shift.length; i++) {
			printString += shift[i] + " ";

		}
		return printString;
	}

}
/*Write a program that outputs an array that is "right shifted"
by n compared to the input array - the last integer tells how many
places the numbers should be shifted (note that the number of output
numbers is one shorter!)-- so {6, 2, 5, 2} returns {2, 5, 6}.

6 2 5 0 → 6 2 5
1 2 1→ 2 1
1 2 3 -1 → 2 3 1*/