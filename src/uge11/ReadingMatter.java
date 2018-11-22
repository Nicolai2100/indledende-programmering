package uge11;

public class ReadingMatter {
    protected String title;
    protected long isbn;

    public ReadingMatter(String title, long isbn){
        this.title = title;
        this.isbn = isbn;
    }
    public String toString(){
        String returnString = title + "\t" +  isbn;
        return returnString;
    }

    public static void main(String[] args) {
        ReadingMatter[] materials = new ReadingMatter[3];
        materials[0] = new ReadingMatter("Winnie-the-Pooh",140361219L);
        materials[1] = new Book1("The House at Pooh Corner", 9780140361223L, "A. A. Milne");
        materials[2] = new Magazine1("Walt Disney Treasury", 1608866564L, 1);
        for (ReadingMatter readingMatter : materials) {
            System.out.println(readingMatter);
        }

    }
}

class Book1 extends ReadingMatter {
    private String author;

    public Book1 (String thisTitle, long isbnNum, String auth)
    {
        super(thisTitle, isbnNum);
        author = auth;
    }
    public String toString()
    {   String returnString = super.toString();
        returnString += "\t" + author;
        return returnString;
    }

    public void content()
    {
        System.out.println ("Title: " + title);
        System.out.println ("ISBN: " + isbn);
        System.out.println ("Author: " + author);
    }

}
class Magazine1 extends ReadingMatter {
    private int weeknumber;

    public Magazine1 (String thisTitle, long isbnNum, int weeknumber1)
    {
        super(thisTitle, isbnNum);
        weeknumber = weeknumber1;
    }

    public String toString()
    {
        String result = super.toString();
        result += "\t" +  weeknumber;
        return result;
    }

    public void content()
    {
        System.out.println ("Title: " + title);
        System.out.println ("ISBN: " + isbn);
        System.out.println ("Weeknumber: " + weeknumber);
    }


}

/*Programmet BookClub opretter en bog og et blad hvorefter
disse udskriver fra hver sin linie i programmet.

Modificer klasserne Book1 og Magazine1 ved at lade dem arve fra en
 fælles klasse ReadingMatter således at de har mindst mulig kopieret indhold i ReadingMatter og Magazine1.

Hvor meget var det nødvendigt at ændre på klasserne for at implementere dette.

Modificer programmet således at udskrivning kan foretages i en løkke.

public class BookClub{
   public static void main (String[] args){
	   ReadingMatter ref0 = new ReadingMatter("Great Eskimo Vocabulary Hoax", 812345678,"Pullum, Geoffrey");
	   Magazine1 ref1 = new Magazine1 ("ACM Crossroads",678078979,23);
	   ref0.content();
	   System.out.println();
	   ref1.content();
	   System.out.println();

   	}
}
Filerne ReadingMatter.java og Magazine1.java er vedlagt.
Både ReadingMatter, Magazine1 og ReadingMatter skal uploades til CodeJudge.*/