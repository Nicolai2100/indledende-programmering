package AndetSemester;
//Når man bruger Threads skal man override run metoden, da start eksekveres
//af .start();
class Hi extends Thread{

    public void run(){
        for(int i = 1; i <= 5; i++){
            System.out.println("Hi");
            try {Thread.sleep(500); } catch (Exception e){}
        }
    }
}
class Hello extends Thread{

    public void run(){
        for(int i = 1; i <= 5; i++){
            System.out.println("Hello");
            try {Thread.sleep(500); } catch (Exception e){}
        }
    }
}
 class ThreadDemoX {
    public static void main(String[] args) {
        Hi obj1 = new Hi();
        Hello obj2 = new Hello();

        obj1.start();
        try {Thread.sleep(10); } catch (Exception e){}
        obj2.start();


    }
}
