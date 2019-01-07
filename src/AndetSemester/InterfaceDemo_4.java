package AndetSemester;

interface Demo4 {
    //Variabler i interfacer bliver permanente/final
    int i = 8;

    void abc();
    static void show(){
        System.out.println("Hi");
    }
}

class DemoImplement4 implements Demo4 {

    @Override
    public void abc() {
        //i = 9;
    }
}

public class InterfaceDemo_4 {

    public static void main(String[] args) {
        Demo4.show();
    }
}
