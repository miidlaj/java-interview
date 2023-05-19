package udemy.datastructures.bigO;

public class fibonacci {

    static int fib(int n) {

        if (n <= 0)
            return 0;
        else if (n == 1)
            return 1;
        else
        /**
         * At each step we are calling this method twice
         * So the function call is multiplying with 2 every time
         * It's like it will multiply n times
         * So we can write the complexity will be like O(2^n)
         */
            return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        System.out.println(fib(10));

    }

}
