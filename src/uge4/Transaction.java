package uge4;

public class Transaction {

    //-----------------------------------------------------------------
    // Creates some bank accounts and requests various services.
    //-----------------------------------------------------------------
    public static void main (String[] args)
    {
        Address address1 = new Address("Høgevej 3", "Rønnede", "Danmark", 4683);
        Account acct1 = new Account ("Ted Murphy", 72354);
        acct1.setBalance(102.56);
        acct1.setAddress(address1);

        Address address2 = new Address("Bøgevej 2", "Bøgedal", "Danmark", 3622);
        Account acct2 = new Account ("Jane Smith", 69713);
        acct2.setBalance(40.00);
        acct2.setAddress(address2);

        Address address3 = new Address("Kløvervej 3", "Kvøledal", "Danmark", 9922);
        Account acct3 = new Account ("Edward Demsey", 93757);
        acct3.setBalance(759.32);
        acct3.setAddress(address3);

        acct1.deposit (25.85);
        double smithBalance = acct2.deposit (500.00);
        System.out.println ("Smith balance after deposit: " +
                smithBalance);
        System.out.println ("Smith balance after withdrawal: " +
                acct2.withdraw (430.75, 1.50));
        acct1.addInterest();
        acct2.addInterest();
        acct3.addInterest();
        System.out.println ();
        System.out.println (acct1);
        System.out.println (acct2);
        System.out.println (acct3);

        acct1.transfer(5,acct3);
    }
}
