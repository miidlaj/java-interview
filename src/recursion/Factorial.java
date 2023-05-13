package recursion;

public class Factorial {

    public static void main(String[] args) {

        int n = 10;
        if (n < 0) {
            System.out.println("Error");
        } else {
            System.out.println(fact(n));
        }
    }

    private static int fact(int n) {

        if (n == 1)
            return 1;
        else {
            return n*(fact(n-1));
        }
    }
}
