package sync;

public class ConsumerTask implements Runnable{
    MonitorLock monitorLock;

    public ConsumerTask(MonitorLock monitorLock){
        this.monitorLock = monitorLock;
    }
    @Override
    public void run() {
        try {
            monitorLock.getItem();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
