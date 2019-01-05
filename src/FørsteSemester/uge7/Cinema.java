package FørsteSemester.uge7;

public class Cinema {

    public static void main(String[] args) {
        Cinema c = new Cinema(new int[]{6,5,4,3,3,7,10});
        c.booking(1, 2);
        c.booking(3, 4);
        c.release(3, 4);
        System.out.println("Rows: " +c.rows());
        System.out.println("Seats on row 5: " +c.seatsOnRow(5));
        System.out.println("Total number of seats: " + c.seats());
        System.out.println("Total number of available seats: " +c.vacancies());
        System.out.println("Avalable seats on row 1: " + c.rowVacancies(1));
        System.out.println(c);

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
        if (row <0 || row >= cinema2D.length) return 0;
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
        if (row>= cinema2D.length ||row <0) return 0;
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
            count += rowVacancies(i);
        }
        return count;
    }
    //booker sæde seat på række row.
    public void booking(int row, int seat){
        if (checkSeat(row, seat)) return;
        cinema2D[row][seat] = false;
    }

    private boolean checkSeat(int row, int seat) {
        if (row >= cinema2D.length || row <0 ||seat >= cinema2D[row].length || seat < 0) return true;
        return false;
    }

    //ophæver bookingen af sæde seat på række row.
    public void release(int row, int seat) {
        if (checkSeat(row,seat)) return;
        cinema2D[row][seat] = true;
    }
    //giver en streng som viser hvilke sæder der optaget (#) og hvilke der er
    //    ledige (O).
    public String toString() {
        String række = "";
        for (int curRow = 0; curRow < cinema2D.length; curRow++) {

            for (int curSeat = 0; curSeat < cinema2D[curRow].length; curSeat++){
                if (cinema2D[curRow][curSeat]){
                    række += "0";
                }
                else række += "#";
            }
            række+= "\r\n";
        }
        return række;
    }
}
/*
Som laver et nyt biograf objekt. Antallet af rækker er lig antallet af
 elementer i seatsOnRow og antal sæder på hver række er givet ved
  tallene i arrayet seatsOnRow. Eksempel: Cinema(new int []{6,5,4,3,3});
  opretter et Cinema objekt med 6 pladser på række 0, 5 på række 1, fire på
  række 2 og tre på række 3 og 4. Klassen skal have følgende metoder:

*/