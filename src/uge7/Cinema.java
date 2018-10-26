package uge7;

public class Cinema {
    //seatsOnRow;
    public static void main(String[] args) {
        int [] array = {6, 5, 4, 3, 3};
        Cinema cinema = new Cinema(array);
        System.out.println(cinema.cinema2D[0][0]);
    }
    private int rowsInt;
    private int seatsOnRowInt;
    private int seatsInt;
    private int [] cinema;
    private boolean [][] cinema2D;

    public Cinema(int[] seatsOnRow){
        this.cinema = seatsOnRow;
        this.cinema2D = new boolean[seatsOnRow.length][];

        for (int index = 0; index < seatsOnRow.length; index++){
            cinema2D[index]= new boolean[seatsOnRow[index]];

            for (int index2 = 0; index2 < seatsOnRow[index]; index2++){
                cinema2D[index][index2] = true;
            }
        }
    }
    //giver antal rækker i biografen.
    public int rows()
    {   rowsInt = cinema.length;
        return rowsInt;
    }
    //giver antal sæder  på række row.
    public int seatsOnRow(int row){
        seatsOnRowInt = cinema[row];
        return seatsOnRowInt;
    }
    //totalt giver antal sæder i biografen.
    public int seats(){
        for (int seat : cinema){
            seatsInt += seat;
        }
        return seatsInt;
    }

    //giver antal ledige pladser på række row.
    public int rowVacancies(int row){
        int count = 0;
        for (int i = 0; i < cinema2D[row].length ; i++) {
            if (cinema2D[row][i]){
                count++;
            }
        }
        return count;
    }

    //giver det samlede antal ledige pladser i biografen.
    public int vacancies() {
        int count = 0;
        for (int i = 0; i < cinema2D.length; i++) {
            rowVacancies(i);
        }
        return count;
    }
    //booker sæde seat på række row.
    public void booking(int row, int seat){


    }
    //ophæver bookingen af sæde seat på række row.
    public void release(int row, int seat) {

    }
    //giver en streng som viser hvilke sæder der optaget (#) og hvilke der er
    //    ledige (O).
    public String toString() {

        return ;
    }

}
/*
Som laver et nyt biograf objekt. Antallet af rækker er lig antallet af
 elementer i seatsOnRow og antal sæder på hver række er givet ved
  tallene i arrayet seatsOnRow. Eksempel: Cinema(new int []{6,5,4,3,3});
  opretter et Cinema objekt med 6 pladser på række 0, 5 på række 1, fire på
  række 2 og tre på række 3 og 4. Klassen skal have følgende metoder:

*/