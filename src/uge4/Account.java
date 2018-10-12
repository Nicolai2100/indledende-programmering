package uge4;

import java.net.InetAddress;
import java.text.NumberFormat;

/*  Skriv Account klassen om, så den giver muligheden for at overføre fra en konto (Account) til en anden.
    Bemærk, at overførslen kan beskrives som udtræk fra en konto og indsættelse i en anden.
*/
public class Account {

    private final double RATE = 0.035; // interest rate of 3.5%
    private long acctNumber;
    private double balance;
    private String name;
    private String streetAddress;
    private String city;
    private String state;
    private String zipCode;
    private Address address;

    //-----------------------------------------------------------------
    // Sets up the account by defining its owner, account number,
    // and initial balance.
    //-----------------------------------------------------------------
    public Account (String owner, long account, double initial, Address address)
    {
        name = owner;
        acctNumber = account;
        balance = initial;
        this.address = address;

    }

    public void transfer (double amount, Account acctNumber)
    {
        double overført = amount;
        balance = balance - amount;
        System.out.println(name +" har overført "+ amount + " kroner til " + acctNumber.name +". Nuværende balance: "+ balance);
        acctNumber.balance = acctNumber.balance + amount;
        System.out.println(acctNumber.name + "'s balance er nu " + acctNumber.balance + "kr.");
    }

    //-----------------------------------------------------------------
    // Deposits the specified amount into the account. Returns the
    // new balance.
    //-----------------------------------------------------------------
    public double deposit (double amount)
    {
        balance = balance + amount;
        return balance;
    }
    //-----------------------------------------------------------------
    // Withdraws the specified amount from the account and applies
    // the fee. Returns the new balance.
    //-----------------------------------------------------------------
    public double withdraw (double amount, double fee)
    {
        balance = balance - amount - fee;
        return balance;
    }


    //-----------------------------------------------------------------
    // Adds interest to the account and returns the new balance.
    //-----------------------------------------------------------------
    public double addInterest ()
    {
        balance += (balance * RATE);
        return balance;
    }
    //-----------------------------------------------------------------
    // Returns the current balance of the account.
    //-----------------------------------------------------------------
    public double getBalance ()
    {
        return balance;
    }
    //-----------------------------------------------------------------
    // Returns a one-line description of the account as a string.
    //-----------------------------------------------------------------
    public String toString ()
    {
        NumberFormat fmt = NumberFormat.getCurrencyInstance();
        return acctNumber + "\t" + name + "\t" + fmt.format(balance);
    }

}
