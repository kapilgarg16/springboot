import sync.*;

public class Main {
    public static void main(String[] args) {
//        MonitorEx monitorEx  = new MonitorEx();
//        FuncIntf funcIntf = new FuncIntf(monitorEx);
//        Thread thread1 = new Thread(funcIntf);
//        Thread thread2 = new Thread(() -> {monitorEx.task2();});
//        Thread thread3 = new Thread(() -> {monitorEx.task3();});
//
//        thread1.start();
//        thread2.start();
//        thread3.start();


        MonitorLock monitorLock = new MonitorLock();
        ConsumerTask consumerTask = new ConsumerTask(monitorLock);
        ProducerTask producerTask = new ProducerTask(monitorLock);

        Thread thread1 = new Thread(producerTask);
        Thread thread2 = new Thread(consumerTask);

        thread1.start();
        thread2.start();
    }
}