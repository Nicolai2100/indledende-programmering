package uge12;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
 
public class ReadFile {
    BufferedReader in;

    public void openFile(String file){
        try {
            in = new BufferedReader(new FileReader(file));
        } catch (IOException e) {
            System.out.println("Filen kan ikke åbnes");
        }
    }
    public int[] readInts(){
            int[] ints = null;
        try {
            String[] inStrings;
            inStrings = in.readLine().split(" ");
            ints = new int[inStrings.length];
            for (int j = 0; j < inStrings.length; j++) {
                ints[j] = Integer.parseInt(inStrings[j]);
            }
        }catch (IOException e) {
            System.out.println("Filen kan ikke åbnes");
        }
        return ints;
        }

    public void closeFile(){
            try {
        in.close();
            }catch (IOException e) {
                System.out.println("Filen kan ikke åbnes");
            }
    }
/*
    public static void main(String[] args)  {

        ReadFile reader = new ReadFile();
        reader.openFile("data");
        int[] ints1 = reader.readInts();
        int[] ints2 = reader.readInts();
        if (ints1!=null)
            for (int i : ints1) {
                System.out.print(i + " ");
            }

        System.out.println("");

        if (ints2!=null)
            for (int i : ints2) {
                System.out.print(i + " ");
            }


    }*/
}
