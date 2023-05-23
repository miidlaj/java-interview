package multiThreading.daemon;

public class CheckDaemonThread extends Thread {

    @Override
    public void run() {
        System.out.println("User thread or Daemon thread");
    }

    public static void main(String[] args) {

        CheckDaemonThread t = new CheckDaemonThread();
        System.out.println("Main Thread");

        System.out.println("Is " + t.getName() + " a Daemon Thread: " + t.isDaemon());

        System.out.println("Is " + Thread.currentThread().getName() + " a Daemon Thread: " + Thread.currentThread().isDaemon());

    }
}
