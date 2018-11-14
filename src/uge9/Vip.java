package uge9;

public class Vip extends Ansat {
    private String [] kurser = new String[4];
    public Vip(String navn, String institutnavn, String kursus1, String kursus2, String kursus3, String kursus4)
    {
        super(navn, institutnavn);
        kurser[0]=kursus1;
        kurser[1]=kursus2;
        kurser[2]=kursus3;
        kurser[3]=kursus4;

    }

    /*public String printKurser(){
        String returnString;
        for (int i = 0; i < kurser.length; i++) {
            returnString =+ (kurser[i].to"]");
        }
        return
    }
    */
    @Override
    public String toString() {
        //For alle kurser!
        return super.toString() + "\n\t[kursus="+kurser[0]+"]"+ "\n\t[kursus="+kurser[1]+"]"
                + "\n\t[kursus="+kurser[2]+"]" + "\n\t[kursus="+kurser[3]+"]";


    }
}
