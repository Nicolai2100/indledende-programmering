package AndetSemester;

//Abstract class -> define and implement
//Interface -> declare
// 1.8 can define methods in interfaces
@FunctionalInterface
interface Demo
{
    //Max én abstract metode i funktionel interface.
    void abc();
    default void show()
    {
        System.out.println("in show");
    }
}

class DemoImplent implements Demo{
    public void abc(){
        System.out.println("in abc");
    }

}
public class InterfaceDemo3 {
    public static void main(String[] args) {
        Demo obj = new DemoImplent();
        obj.show();
        obj.abc();
    }
}
