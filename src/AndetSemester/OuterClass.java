package AndetSemester;

public class OuterClass {
    int a = 5;

    void showA() {
        System.out.println(a);
    }
}
    class InnerClass extends OuterClass{

        void showA(){
            System.out.println("Sniksnak");
        }

    public static void main(String[] args) {
        //Outer class
        OuterClass A = new OuterClass();
        A.showA();

        //Inner class
        OuterClass B = new InnerClass();
        B.showA();

        //Inner anonymous class
        OuterClass A2 = new OuterClass(){
            void showA(){
                System.out.println("I am the best!");
            }
        };
        A2.showA();
    }
}
