package multiThreading.thredCreation;

public class LambdaExpression {


    public static void main(String[] args) {

        /**
         * Using anonymous class
         */
        Runnable runnable = new Runnable() {

            @Override
            public void run() {
                System.out.println("Using Anonymous class");
            }
        };

        new Thread(runnable).start();

        /**
         * Using Lambda expression
         */

        Runnable runnable1 = () -> System.out.println("Using lambda Expression");
        new Thread(runnable1).start();
    }
}
