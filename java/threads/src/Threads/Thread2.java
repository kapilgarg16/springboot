package Threads;

public class Thread2 extends Thread{
    @Override
    public void run() {
//        System.out.println("current thread __1 " + Thread.currentThread());

        for (int i = 0; i < 5; i++) {
            System.out.println("Thread2 " + i);
//            System.out.println("kapi" + Thread.class.getName());
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
