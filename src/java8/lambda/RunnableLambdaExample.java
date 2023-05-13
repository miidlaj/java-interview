package java8.lambda;

class ThreadDemo implements Runnable {

    @Override
    public void run() {
        System.out.println("run method called using ThreadDemo class");
    }
}

public class RunnableLambdaExample {

    public static void main(String[] args) {

        /**
         * Traditional way of implementing multithreading
         */
        Thread thread = new Thread(new ThreadDemo());
        thread.start();

        /**
         * Runnable is a functional interface. So we can use lambda to implement it.
         */
        Runnable runnable = () -> System.out.println("run method is called using lambda");
        Thread thread1 = new Thread(runnable);
        thread1.start();

        /**
         * Or we can directly pass to the Thread class
         */
        Thread thread2 = new Thread(() -> System.out.println("run method is called using lambda as parameter"));
        thread2.start();
    }
}
