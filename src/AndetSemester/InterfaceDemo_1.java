package AndetSemester;

interface ABC{

    void show();
}
public class InterfaceDemo_1 {
    //outer class
    int a = 5;

    void show() {
        System.out.println(a);
    }
}
    class InnerClass extends InterfaceDemo_1 {

        void show(){
            System.out.println("Sniksnak");
        }

    public static void main(String[] args) {
        //Outer class
        InterfaceDemo_1 A = new InterfaceDemo_1();
        A.show();

        //Inner class
        InterfaceDemo_1 B = new InnerClass();
        B.show();

        //Inner anonymous class
        InterfaceDemo_1 A2 = new InterfaceDemo_1(){
            void show(){
                System.out.println("I am the best!");
            }
        };
        A2.show();

        //Objekt af interface implementeret som anonym klasse!
        //Koden kan ikke genbruges
        ABC obj = new ABC(){
            @Override
            public void show() {
                System.out.println("For vildt!");
            }
        };
        obj.show();
    }
}
