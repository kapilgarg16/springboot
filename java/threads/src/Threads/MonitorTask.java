package Threads;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class MonitorTask implements Runnable {
    @Override
    public void run() {
        try {
            // Redirect output to a log file
            FileOutputStream fos = new FileOutputStream("monitor.log");
            PrintStream ps = new PrintStream(fos);
            System.setOut(ps);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        while (true) {
            // Perform monitoring and logging tasks
            System.out.println("Monitoring server status...");
            // Simulate monitoring tasks
            try {
                Thread.sleep(2000); // Sleep for 2 seconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}