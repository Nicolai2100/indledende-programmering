package AndetSemester;

//Abstract class -> define and implement
//Interface -> declare
// 1.8 can define methods in interfaces
@FunctionalInterface
interface Demo3
{
    //Max én abstract metode i funktionel interface.
    void abc();
    default void show()
    {
        System.out.println("in Demo3-show");
    }
}
interface MyDemo {
    default void show()
    {
        System.out.println("in MyDemo-show");
    }

   public class DemoImplent implements Demo3, MyDemo{
        public void abc(){
            System.out.println("in abc");
        }
       @Override
       public void show() {
//overrider de nedarvede metoder, for at undgå ambivalens.
           Demo3.super.show();
           }

        //En anden måde at gøre det på!
        //@Override
        //public void show() {
//overrider de nedarvede metoder, for at undgå ambivalens.
        //    System.out.println("In DemoImplement3 Show");
        //}
    }
}
public class InterfaceDemo3 {
    public static void main(String[] args) {
        Demo3 obj = new MyDemo.DemoImplent();
        obj.show();
        obj.abc();
    }
}
