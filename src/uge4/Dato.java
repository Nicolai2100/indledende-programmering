package uge4;

import java.text.NumberFormat;
import java.util.Locale;

public class Dato {

    //Felter
    int year;
    int month;
    int day;
    NumberFormat nf = NumberFormat.getNumberInstance();
    Locale locale = Locale.getDefault();

    //Constructor metode
    public Dato(int aYear, int aMonth, int aDay){

        year = aYear;
        month = aMonth;
        day = aDay;
    }
    //som returnerer datoen i det normale danske format (f.eks. 9/3 2000).
    public String danish(){

        String danishDato = day + "/"+month + "-" + year;

        return danishDato;
    }

//  String danishText()
//  datoen med måneden som navn i stedet for tal (f.eks. 9. marts 2000)

    public String danishText(){
        String monthString;
        switch (month){
        case 1:  monthString = "Januar";
        break;
        case 2:  monthString = "Februar";
        break;
        case 3:  monthString = "Marts";
        break;
        case 4:  monthString = "April";
        break;
        case 5:  monthString = "Maj";
        break;
        case 6:  monthString = "Juni";
        break;
        case 7:  monthString = "Juli";
        break;
        case 8:  monthString = "August";
        break;
        case 9:  monthString = "September";
        break;
        case 10: monthString = "Oktober";
        break;
        case 11: monthString = "November";
        break;
        case 12: monthString = "December";
        break;
        default: monthString = "Invalid month";
        break;
    }

        String dato2 = day+". " + monthString + " " + year ;

        return dato2;
    }

    public String iso(){
        nf.setMinimumIntegerDigits(2);

        //Viser datoen i ISO-format (f.eks. 2000–03–09).
        String isoDato = year + "-" + nf.format(month) + "-" + nf.format(day);

        return isoDato;
    }



/*
    5.4 Repræsentation af datoer
    https://dtu.codejudge.net/02312-02314-e18/exercise/7718/view
    Lav en klasse Dato til at repræsentere datoer. Klassen skal have en enkelt konstruktør:
    Dato(int year, int month, int day){//kode}
        således at
        Dato(2000,3,9)
        opretter et nyt Dato objekt med datoen 9. marts 2000.


  */

}