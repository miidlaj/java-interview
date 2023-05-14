package udemy.recursion.questions;

/**
 * GCD is the largest positive integer that divides the numbers without a reminder
 * GDC of (8, 12) = 4 because 8 = 2 * 2 * 2 & 12 = 2 * 2 * 3
 *
 * In code, we can implement this using an algorithm called Euclidean algorithm
 * For example :- gcd(48,18)
 * Step 1: 48/18 = 2 remainder 12
 * Step 2: 18/12 = 1 remainder 6
 * Step 3: 12/6 = 2 remainder 0
 * So 6 is the GCD of 48 and 18
 */

public class GreatestCommonDivisorOfTwoNumbers {

    static int GCD(int a, int b) {
        /**
         * Unintentional case
         */
        if (a < 0 || b < 0)
            return -1;

        /**
         * Base case if the b become 0 we can return a because the last call will be like (a, 0);
         */
        if (b == 0)
            return a;

        /**
         * GCD(a, b) = gcd(b, a mode b)
         */
        return GCD(b, a % b);
    }


    public static void main(String[] args) {

        System.out.println(GCD(48, 18));
    }
}
