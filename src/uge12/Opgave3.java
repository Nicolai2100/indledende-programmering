package uge12;

import java.io.*;

public class Opgave3 {
    static BufferedReader in;

    public void openAndRead(String file) throws IOException {
        Exception exception = new IOException("Hov");
        try {
            in = new BufferedReader(new FileReader(file));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println(exception);
        }
        finally {
            String line;
            while ((line = in.readLine()) != null) {
                System.out.println(line);
            }
        }
        }
        public static void main(String[] args) throws IOException {
        Opgave3 opg = new Opgave3();
        opg.openAndRead(".\\src\\uge12\\data");

    }
}

/*11.3 Læsning af fil
Lav et nyt program, som kan læse de to arrays fra data.txt ind i to arrays med længde 10.
Programmet skal indeholde ”exception” handling.
Afprøv at de implementerede ”exceptions” virker.
Hint: Brug Scanner og se filen reading.java
*/
