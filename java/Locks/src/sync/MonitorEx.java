package sync;

import javax.annotation.processing.SupportedSourceVersion;

public class MonitorEx {
    public synchronized void task1(){ //monitoring lock on thread1 ::
        System.out.println(Thread.currentThread().getName());
        try{
//            System.out.println("inside the task1");
            Thread.sleep(10000); //thread will release lock after 10000ml
            System.out.println("inside the sync task11");

        }
        catch (Exception e){
            //handle the exception
        }
    }

    public void task2(){
//        System.out.println(Thread.currentThread().getName());
        System.out.println("inside the task2");
        synchronized(this){   //will lock the
            System.out.println("inside the sync task2");
        }
    }
    public void task3(){
//        System.out.println(Thread.currentThread().getName());
        System.out.println("inside the task3");
    }
}
