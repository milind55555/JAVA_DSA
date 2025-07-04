package JAVA_DSA.MultiThreading;




public class CreateThread_Example1 {
    public static Object sharedobject=new Object();
    public static void main(String[] args) {
        


        
            System.out.println("Main Thread Started");

       


        Runnable objRunnable1 =() ->{
           
                System.out.println("Thread 1 is running !!!");
                System.out.println(Thread.currentThread().getName());
                System.out.println(Thread.currentThread().getState());
                System.out.println(sharedobject.hashCode());
                try {
                    Thread.sleep(3000);
                    
                } catch (InterruptedException e) {
                    // TODO: handle exception
                    throw new RuntimeException(e);
                }
                System.out.println("Thread 1 completed");
            
        };

        Runnable objRunnable2 =() ->{
           
                System.out.println("Thread 2 is running !!!");
                System.out.println(Thread.currentThread().getName());
                System.out.println(Thread.currentThread().getState());
                                System.out.println(sharedobject.hashCode());

                try {
                    Thread.sleep(3000);
                    
                } catch (InterruptedException e) {
                    // TODO: handle exception
                    throw new RuntimeException(e);
                }
                System.out.println("Thread 2 completed");
            
        };

        Thread objThread1=new Thread(objRunnable1,"Runnable Thread");
        objThread1.setDaemon(false);
        objThread1.start();


        Thread objThread2=new Thread(objRunnable2,"Runnable Thread");
        objThread2.setDaemon(false);
        objThread2.start();


        System.out.println("Main thread ended");
    }
}
