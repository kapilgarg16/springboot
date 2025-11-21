package sync;

public class ProducerTask implements Runnable{
    MonitorLock monitorLock;

    public ProducerTask(MonitorLock monitorLock){
        this.monitorLock = monitorLock;
    }
    @Override
    public void run() {
        try{
            Thread.sleep(5000);
            monitorLock.addItem();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
