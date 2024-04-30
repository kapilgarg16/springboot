package Threads;

public class ThreadPool implements Runnable{
    public String msg;
    public ThreadPool(String msg){
        this.msg = msg;
    }
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() +
                "start "+ msg);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Thread.currentThread().getName() +
                "finish "+ msg);

    }
}
