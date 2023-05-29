package recursion;

public class Fibonacci {

    public static void main(String[] args) {

        int n = 10;
        System.out.println(fibonacci(n));
    }
    private static int fibonacci(int n) {

        for (int i = 0; i < 10; i++) {
            for (int j = i+1; j < 10; j++) {

            }
        }
        if (n <= 1) {
            return n;
        }
        return fibonacci(n-1) + fibonacci(n - 2);
    }
}
