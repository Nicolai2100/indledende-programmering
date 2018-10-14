package uge5;

public final class Singleton{

    private String single;

    private Singleton()
    {

    }

    public Singleton getInstance(){

        return Singleton.this;
    }


    public String getString()
    {
        return single;
    }
    public void setString(String string)
    {
        single = string;
    }
    /*Skriv en Singleton klasse. En singleton klasse garanterer at der aldrig er
    mere end ét instans af klassen. Dette opnås ved at konstruktøren gøres
    utilgængelig fra andre klasser og at der i stedet skrives en
    getInstance()
    metode, der returnerer det unikke instance.
    Denne singleton skal hedde Singleton og have en getString() og en setString() metode.
    Er Singleton klassen skrevet rigtigt, vil getString() returnere den samme string,
    selv om man har to referencer der er hentet med getInstance()
    metoden og man har modificeret den ene med setString().*/


}