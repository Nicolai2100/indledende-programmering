package FørsteSemester.Bonus;

public class Calculator {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.factorial(5));
    }

    public Calculator(){
    }

    public int sum(int int1, int int2){
        int sum = int1 + int2;
        return sum;
    }
    public int factorial(int n){
        int i, fact = 1;

        for (i = 1; i <= n; i++) {
            fact = fact*i;
        }
        return fact;
    }

    /*Velkommen til DTU. Hvis du har lyst til at eksperimentere lidt med
     CodeJudge og allerede har programmeringserfaring, kan du prøve denne opgave.
     Skriv en Calculator klasse, der kan udføre metoden sum(int,int),
    der lægger to tal sammen og metoden factorial(int) , der beregner n! (n fakultet).*/
}
