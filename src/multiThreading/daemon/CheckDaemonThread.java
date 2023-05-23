package multiThreading.daemon;

/**
 * Check a thread is daemon or not
 */
public class CheckDaemonThread extends Thread {

    @Override
    public void run() {
        System.out.println("User thread or Daemon thread");
    }

    public static void main(String[] args) {

        CheckDaemonThread t = new CheckDaemonThread();
        System.out.println("Main Thread");

        /**
         * We can check whether a thread is daemon or user thread using isDaemon() method
         */

        System.out.println("Is " + t.getName() + " a Daemon Thread: " + t.isDaemon());

        System.out.println("Is " + Thread.currentThread().getName() + " a Daemon Thread: " + Thread.currentThread().isDaemon());

        /**
         * It will make a thread Daemon thread
         */
        t.setDaemon(true);
        t.start();

        System.out.println("Is " + t.getName() + " a Daemon Thread: " + t.isDaemon());

    }
}
