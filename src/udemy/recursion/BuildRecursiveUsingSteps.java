package udemy.recursion;

/**
 *
 * @Introduction :
 * First we need to find the recursive flow
 * For example the factorial finding problem
 *
 * notes:
 * 0! = 1
 * 10! = 10 * 9 * 8 * 7 * 6 * 5 * 4 * 3 * 2 * 1
 * 10! = 10 * 9!
 * n! = n * (n - 1)!
 *
 * our flow is n * (n -1)
 *
 * Second we need a base condition where we stop this recursive call
 *
 */
public class BuildRecursiveUsingSteps {

    public static int factorial(int n) {

        /**
         * @Step 3: Unintentional case - the constraint
         * Used to prevent bugs like negative value does not have factorial
         */
        if (n < 1)
            return -1;

        /**
         * @Step 2: Base case - the stopping criterion
         * It's condition used to exit the recursive program without forming infinite loop
         * Here, 0! = 1 and 1! = 1
         * So if the condition met we will return 1.
         */
        if (n == 0 || n == 1)
            return 1;

        /**
         *
         * @Step 1: Recursive case - the flow
         * With that flow we found n * (n -1)
         * we can write the code as n * factorial (n - 1)
         * because factorial of (n - 1) = (n -1) * (n - 1 - 1)
         *
         */
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {

        System.out.println(factorial(10));
    }
}
