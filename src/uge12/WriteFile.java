package uge12;

import java.io.*;

public class WriteFile {
    static FileWriter fw;
    static BufferedWriter bw;
    static PrintWriter outFile;

    public void openFile(String file) throws IOException {
        fw = new FileWriter(file);
        //".src\\uge12\\ "
        bw = new BufferedWriter(fw);
        outFile = new PrintWriter(bw);
    }
    public void closeFile(){
        outFile.close();
    }
    public void writeInts(int [] ints) {

        for (int intet : ints) {
            outFile.print(intet + " ");
        }
        outFile.println();

    }

    public static void main(String[] args) throws IOException {
        WriteFile wf = new WriteFile();
        wf.openFile("test.txt");
        wf.writeInts(new int[]{1,2,3,4,5});
        wf.writeInts(new int[]{5,4,3,2,1});
        wf.closeFile();
        BufferedReader bf = new BufferedReader(new FileReader("test.txt"));
        System.out.println(bf.readLine());
        System.out.println(bf.readLine());
    }


}
