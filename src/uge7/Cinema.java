package uge7;

public class Cinema {
    //seatsOnRow;
    public Cinema(int[] seatsOnRow){
    }
}
/*Som laver et nyt biograf objekt. Antallet af rækker er lig antallet af
 elementer i seatsOnRow og antal sæder på hver række er givet ved
  tallene i arrayet seatsOnRow. Eksempel: Cinema(new int []{6,5,4,3,3});
  opretter et Cinema objekt med 6 pladser på række 0, 5 på række 1, fire på
  række 2 og tre på række 3 og 4. Klassen skal have følgende metoder:

· int rows()  -giver antal rækker i biografen.
· int seatsOnRow(int row) - giver antal sæder  på række row.
· int seats() totalt giver antal sæder i biografen.
· int rowVacancies(int row) giver antal ledige pladser på række row.
· int vacancies() giver det samlede antal ledige pladser i biografen.
· void booking(int row, int seat) booker sæde seat på række row.
· void release(int row, int seat) ophæver bookingen af sæde seat på række row.
· String toString() giver en streng som viser hvilke sæder der optaget (#) og hvilke der er
ledige (O).
*/
