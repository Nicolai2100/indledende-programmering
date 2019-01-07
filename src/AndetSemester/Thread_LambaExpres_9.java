package AndetSemester;
//Når man bruger Threads skal man override run metoden, da start eksekveres
//af .start();

public class Thread_LambaExpres_9 {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            for (int i = 1; i <5 ; i++) {
                System.out.println("Hi " + Thread.currentThread().getPriority() );
                try {Thread.sleep(200);} catch (Exception e) {}
            }
            //Navn på thread som argument
        },"Hi Tread");
        Thread t2 = new Thread(() -> {
            for (int i = 1; i < 5; i++) {
                System.out.println("Hello " + Thread.currentThread().getPriority());
                try {Thread.sleep(200);} catch (Exception e) {}
            }
        });
        //Navngiv thread
        t2.setName("Hello Thread");
        System.out.println(t1.getName());
        System.out.println(t2.getName());

        //Min prioritet
        t1.setPriority(Thread.MIN_PRIORITY);
        //Max prioritet
        t2.setPriority(10);
        //Default prioritet er 5 - medium
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());



        t1.start();
        try {Thread.sleep(10); } catch (Exception e){}
        t2.start();
        t1.join();
        t2.join();

        System.out.println(t1.isAlive());

    }

}
