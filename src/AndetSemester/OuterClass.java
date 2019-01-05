package AndetSemester;

interface ABC{

    void show();
}
public class OuterClass {
    int a = 5;

    void show() {
        System.out.println(a);
    }
}
    class InnerClass extends OuterClass{

        void show(){
            System.out.println("Sniksnak");
        }

    public static void main(String[] args) {
        //Outer class
        OuterClass A = new OuterClass();
        A.show();

        //Inner class
        OuterClass B = new InnerClass();
        B.show();

        //Inner anonymous class
        OuterClass A2 = new OuterClass(){
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
