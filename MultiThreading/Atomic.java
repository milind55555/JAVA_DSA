package JAVA_DSA.MultiThreading;

import java.util.concurrent.atomic.AtomicInteger;

class sharedCounter {

    private AtomicInteger count=new AtomicInteger(0);

    public void increment(){count.getAndIncrement();}

    public int getCount(){return count.get();}
}
public class Atomic {
    public static void main(String[] args) {
        sharedCounter ShareCounter=new sharedCounter();

        //Thread 1
        new Thread(()->{
            System.out.println("Thread 1 started");
            for(int i=0;i < 50000;i++){
                ShareCounter.increment();
            }
            System.out.println("Thread 1 is completed");
        }).start();


        //Thread 2
        new Thread(()->{
            System.out.println("Thread 2 started");
            for(int i=0;i < 50000;i++){
                ShareCounter.increment();
            }
            System.out.println("Thread 2 is completed");
            

        }).start();
        
        
    }
}
