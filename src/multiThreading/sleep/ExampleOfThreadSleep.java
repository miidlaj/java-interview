package multiThreading.sleep;

public class ExampleOfThreadSleep extends Thread{

    public ExampleOfThreadSleep(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(currentThread().getName() + " started");
        try {
            System.out.println(currentThread().getName() + " sleeping...");
            /**
             * Used for make a thread sleep
             */
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(currentThread().getName() + " Finished");
    }

    public static void main(String[] args) {

        ExampleOfThreadSleep t1 = new ExampleOfThreadSleep("First Thread");
        ExampleOfThreadSleep t2 = new ExampleOfThreadSleep("Second Thread");

        /**
         * getState() returns the current state of the thread
         */
        System.out.println(t1.getName() + " state = " + t1.getState());
        t1.start();
        System.out.println(t1.getName() + " state = " + t1.getState());

        System.out.println(t2.getName() + " state = " + t2.getState());
        t2.start();
        System.out.println(t2.getName() + " state = " + t2.getState());

    }
}
