package multiThreading.join;

public class JoinExample implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " Started");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(Thread.currentThread().getName() + " Finished");
    }

    public static void main(String[] args) {

        Thread t1 = new Thread(new JoinExample(), "Thread 1");
        Thread t2 = new Thread(new JoinExample(), "Thread 2");
        Thread t3 = new Thread(new JoinExample(), "Thread 3");

        t1.start();

        /**
         * The t1.join() will make wait until the t1 finishes
         */
        try {
            t1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        t2.start();
        t3.start();

    }}
