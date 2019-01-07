package AndetSemester;
//Når man bruger Threads skal man override run metoden, da start eksekveres
//af .start();

public class ThreadDemo_7 {
    public static void main(String[] args) {
        Runnable obj1 = new Runnable() {
            //Anonymous class 1
            public void run() {
                System.out.println("Hi");
            }
        };
        Runnable obj2 = new Runnable() {
            //Anonymous class 2
            public void run() {
                System.out.println("Hello");
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        try {Thread.sleep(10); } catch (Exception e){}
        t2.start();


    }
}
