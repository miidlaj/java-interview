package multiThreading.semaphore;

import java.util.concurrent.Semaphore;

class Task implements Runnable {

    Semaphore semaphore = new Semaphore(1);

    @Override
    public void run() {
        try {
            semaphore.acquire();
            System.out.println("Being run by " + Thread.currentThread().getName());

            for (int i = 0; i < 5; i++) {
                System.out.println("Running thread " + Thread.currentThread().getName());

                Thread.sleep(2000);
            }
            semaphore.release();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
public class Sample {

    public static void main(String[] args) {

        Task task = new Task();
        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);
        t1.setName("Thread 1");
        t2.setName("Thread 2");
        t1.start();
        t2.start();
    }
}
