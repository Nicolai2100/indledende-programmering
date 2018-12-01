/*
package uge12;

import java.io.*;

public class ReadFile {
    static FileReader fr;
    static BufferedReader br;
    static BufferedWriter out;

	public void openFile(String file) throws IOException {
		//".src\\uge12\\ "
        try {
        out = new BufferedWriter(new FileWriter(file));

        } catch (IOException e) {
            System.out.println("Filen kan ikke åbnes");
        }
    }

    public int [] readInts(){
	    out.
    }


    public static void main(String[] args) throws IOException {

    ReadFile reader = new ReadFile();
    reader.openFile("data.txt");

    int[] ints1 = reader.readInts();
    int[] ints2 = reader.readInts();
    if (ints1!=null)
    for (int i : ints1) {
        System.out.print(i + " ");
    }
    System.out.println();
    if (ints1!=null)
    for (int i : ints2) {
        System.out.print(i + " ");
    }
    System.out.println();


	}
}*/
