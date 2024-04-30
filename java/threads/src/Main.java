import Threads.*;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static java.util.concurrent.Executors.newFixedThreadPool;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InterruptedException {
//         thread1 t = new thread1();
//         Thread t1 = new Thread(t);

//         Thread2 t2 = new Thread2();
//         t1.start();
//
//
//         System.out.println("join start");
////        t2.start();
//        t2.join();
//        System.out.println("join ebds");
//


//         t1.setPriority(10);
//         t2.setPriority(7);

//        System.out.println("kapil" + t1.getName());

//        System.out.println("current thread " + Thread.currentThread());
//         Thread.sleep(10000);
//         t1.setName("kapil");
//         System.out.println("priority" + t1.getPriority());
//        System.out.println("priority" + t2.getPriority());
//        System.out.println("Thread name" + t1.getName());

//        Thread thread1 = new Thread(new PriorityThread(), "Thread 1");
//        Thread thread2 = new Thread(new PriorityThread(), "Thread 2");

        // Setting priorities
//        thread2.setPriority(Thread.MAX_PRIORITY); // Highest priority
//        thread1.setPriority(Thread.MIN_PRIORITY); // Lowest priority
//
//        // Start threads
//        thread1.start();
//        thread2.start();


        // Start the server
//        startServer();
//
//        // Start a daemon thread for monitoring and logging
//        Thread monitorThread = new Thread(new MonitorTask());
//        monitorThread.setDaemon(true); // Set as daemon thread
//        monitorThread.start();
//
//       //  Keep the main thread alive (just for demonstration)
//        try {
//            Thread.sleep(20000); // Sleep for 10 seconds
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        ExecutorService executor = Executors.newFixedThreadPool(5);
        for(int i = 1 ; i <= 10 ; i++){
            Runnable task = new ThreadPool("thread"  + i);
            executor.execute(task);
            //System.out.println("Back to the main thread");
        }
        executor.shutdown();
        System.out.println("finally finished");
    }
//    static void startServer() {
//        // Simulate starting the server
//        System.out.println("Server started.");
//    }
}
