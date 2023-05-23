package multiThreading.thredCreation;

/**
 * Creation of thread using Thread Class and Runnable interface
 * @Step 1: implement the Runnable Interface.
 * @Step 2: Implement the run method.
 * @Step 3: Create the object of Thread class and pass the Runnable impl class to Thread class constructor.
 * @Step 4: call the start() using thread object.
 */
public class RunnableImpl implements Runnable{

    @Override
    public void run() {

        for (int i = 0; i < 5; i++) {
            System.out.println("index " + i + " by the thread " + Thread.currentThread().getName());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println("Thread completed the run");
    }

    public static void main(String[] args) {

        Thread thread1 = new Thread(new RunnableImpl());
        thread1.start();
        Thread thread2 = new Thread(new RunnableImpl());
        thread2.start();


        /**
         *
         * When the run(); is directly called it will work as a normal object.
         * And it will be executed by main thread.
         * So it will not create new stack or will not act as a thread.
         */
        Thread thread3 = new Thread(new RunnableImpl());
        thread3.run();

    }
}
