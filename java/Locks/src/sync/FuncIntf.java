package sync;

public class FuncIntf implements Runnable{

    MonitorEx monitorEx;

    public FuncIntf(MonitorEx monitorEx){
        this.monitorEx = monitorEx;
    }
    @Override
    public void run() {
        monitorEx.task1();
    }
}
