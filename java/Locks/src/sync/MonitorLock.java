package sync;

public class MonitorLock {
    Boolean isItemThere = false;
    public synchronized void addItem(){  //monitor lock is there, only 1 thread will go inside the particular section of code.
        isItemThere = true;
        System.out.println("inside put Item");
        notifyAll();  //will come-out from the wait for the same object,
        // it will go again to Runnable state
    }

    public synchronized void getItem() throws InterruptedException {   //monitor lock is there
        System.out.println("inside ge get Item");
        while(!isItemThere){
            wait();    //will release all the locks , will go to waiting state
            System.out.println("inside the get while Item");
        }
        isItemThere = false;
    }
}
