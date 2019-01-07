package AndetSemester;
//Når man bruger Threads skal man override run metoden, da start eksekveres
//af .start();
class Hi2 implements Runnable{
    public void run(){
        for(int i = 1; i <= 5; i++){
            System.out.println("Hi");
            try {Thread.sleep(500); } catch (Exception e){}
        }
    }
}
class Hello2 implements Runnable{
    public void run(){
        for(int i = 1; i <= 5; i++){
            System.out.println("Hello");
            try {Thread.sleep(500); } catch (Exception e){}
        }
    }
}
 class ThreadDemo2 {
    public static void main(String[] args) {
        Runnable obj1 = new Hi();
        Runnable obj2 = new Hello();

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        try {Thread.sleep(10); } catch (Exception e){}
        t2.start();


    }
}
