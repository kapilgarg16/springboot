package Threads;

public class thread1 implements Runnable{
    @Override
    public void run() {

        for(int i = 0 ; i < 5 ; i++){
            System.out.println(i + "th number");
//            System.out.println("current thread __2 " + Thread.currentThread());

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
