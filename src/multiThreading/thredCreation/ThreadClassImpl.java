package multiThreading.thredCreation;

/**
 * Creation of thread using Thread Class
 * @Step 1: extends the Thread class
 * @Step 2: override the run method inside the thread class.
 * @Step 3: Create the object of child class
 * @Step 4: call the start() using thread object.
 */
public class ThreadClassImpl extends Thread{

    @Override
    public void run() {

        System.out.println("Hello World");
    }

    public static void main(String[] args) {

        ThreadClassImpl threadClassImpl = new ThreadClassImpl();
        threadClassImpl.start();
    }
}
