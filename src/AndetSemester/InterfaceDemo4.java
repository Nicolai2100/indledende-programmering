package AndetSemester;

interface Demo4 {
    //Variabler i interfacer bliver permanente/final
    int i = 8;

    void abc();
    static void show(){
        System.out.println("Hi");
    }
}

class DemoImplement3 implements Demo3 {

    @Override
    public void abc() {
        //i = 9;
    }
}

public class InterfaceDemo4 {

    public static void main(String[] args) {
        Demo4.show();
    }
}
