package AndetSemester;
//Når man bruger Threads skal man override run metoden, da start eksekveres
//af .start();

public class Thread_LambaExpres_8 {
    public static void main(String[] args) {
        Runnable obj1 = () -> {
            for (int i = 1; i <5 ; i++) {
                System.out.println("Hi");
                try {Thread.sleep(20);} catch (Exception e) {}
            }
        };

        Runnable obj2 = () -> {
            for (int i = 1; i < 5; i++) {
                System.out.println("Hello");
                try {Thread.sleep(20);} catch (Exception e) {}

            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        try {Thread.sleep(10); } catch (Exception e){}
        t2.start();


    }
}
