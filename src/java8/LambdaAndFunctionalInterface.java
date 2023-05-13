package java8;

public class LambdaAndFunctionalInterface {

    public static void main(String[] args) {

        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("Runnable");
            }
        };

        Runnable r1 = () -> System.out.println("My Runnable");

    };
}
