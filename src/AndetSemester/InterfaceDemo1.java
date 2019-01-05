package AndetSemester;

interface ABC{

    void show();
}
public class InterfaceDemo1 {
    //outer class
    int a = 5;

    void show() {
        System.out.println(a);
    }
}
    class InnerClass extends InterfaceDemo1 {

        void show(){
            System.out.println("Sniksnak");
        }

    public static void main(String[] args) {
        //Outer class
        InterfaceDemo1 A = new InterfaceDemo1();
        A.show();

        //Inner class
        InterfaceDemo1 B = new InnerClass();
        B.show();

        //Inner anonymous class
        InterfaceDemo1 A2 = new InterfaceDemo1(){
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
