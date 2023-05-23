package multiThreading.stopThread;

/**
 * The interrupt() method of thread class is used to interrupt the thread.
 * If any thread is in sleeping or waiting state (i.e. sleep() or wait() is invoked)
 * then using the interrupt() method,
 * we can interrupt the thread execution by throwing InterruptedException.
 */
public class StopThreadExample1 implements Runnable{

    @Override
    public void run() {

        /**
         * While thread is not interrupted the thread will run infinitely
         * Once the thread is interrupted it will stop the execution
         */
        while (!Thread.interrupted()) {
            System.out.println("Thread " + Thread.currentThread().getName() + " is not interrupted");
        }
        System.out.println("Thread " + Thread.currentThread().getName() + " has stopped");
    }

    public static void main(String[] args) {

        Thread t1 = new Thread(new StopThreadExample1());
        t1.start();

        // Do some operations, then stop t1
        try {
            Thread.sleep(400);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        // Interrupt t1
        t1.interrupt();

        try {
            Thread.sleep(400);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Exiting main...");
    }
}
