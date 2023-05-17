package udemy.datastructures.bigO;

public class factorial {

    static int factorial(int n) {   /** Assume the complexity as M(n) */
        if (n < 0)                  /** O(1) */
            return -1;
        else if (n == 0)
            return 1;
        else
            return n * factorial(n - 1); /** M(n-1) */
    }

    /**
     *
     * M(n) = O(1) + M(n-1)
     * So we can write the complexity as O(n)
     *
     */

    public static void main(String[] args) {

        System.out.println(factorial(10));
    }
}
