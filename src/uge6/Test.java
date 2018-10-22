package uge6;

public class Test{

    public static void main(String[] args) {
//Hej fra master
        Car2 car1 = new Car2("Toyota", "AB 223", "Rød");
        System.out.println(car1.getRegno());
        System.out.println(car1.getNextRegno());

        Car2 car2 = new Car2("Toyota", "AB 223", "Rød");
        System.out.println(car2.getRegno());
        System.out.println(car2.getNextRegno());

        Car2 car3 = new Car2("Toyota", "AB 223", "Rød");
        System.out.println(car3.getRegno());
        System.out.println(car3.getNextRegno());

        Car2 car4 = new Car2("Toyota", "AB 223", "Rød");
        System.out.println(car4.getRegno());
        System.out.println(car4.getNextRegno());


    }
}