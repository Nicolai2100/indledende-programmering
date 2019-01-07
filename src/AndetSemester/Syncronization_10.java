package AndetSemester;

class Counter{
    int count;
    // Metoden/ klassen ikke er synchronized er den ikke "thread safe"
    // fare for at to threads tilgår metoden på samme tid!
    public synchronized void increment(){
        count++;
    }
}
public class Syncronization_10 {

    public static void main(String[] args) throws InterruptedException {
        Counter c = new Counter();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <1000 ; i++) {
                    c.increment();
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <1000 ; i++) {
                    c.increment();
                }
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("count " + c.count);

    }
}
