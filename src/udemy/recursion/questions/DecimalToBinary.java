package udemy.recursion.questions;

/**
 *
 * Convert a decimal to Binary
 *
 * @Step 1: Divide the number by 2
 * @Step 2: Get the integer quotient for the next iteration
 * @Step 3: Get the reminder for the binary digit
 * @Step 4: Repeat the steps until the quotient is equal to 0
 *
 * Example:-
 * Division by 2 - Quotient - Reminder
 * 13/2          - 6        - 1
 * 6/2           - 3        - 0
 * 3/2           - 1        - 0
 * 1/2           - 0        - 1
 *
 * The Binary of decimal 13 is 10001
 */
public class DecimalToBinary {

    static int convertToBinary(int decimal) {

        /**
         * Base condition for avoiding infinite loop
         *
         */
        if (decimal == 0)
            return 0;

        /**
         * But here we need to return the binary digits
         * So with the example,
         * Division by 2 - Quotient - Reminder  => multiply the last reminder with 10 and add the reminder above. Again multiply the answer with 10 and add reminder above, so if we do until the first reminder we will get the decimal
         *  * 13/2          - 6        - 1      => Finally the result is
         *  * 6/2           - 3        - 0      => 100 * 10 + 1 = 1001 [ 100 is the answer we got below and 1 is reminder above ]
         *  * 3/2           - 1        - 0      => 10 * 10 + 0 = 100 [ 10 is the answer we got below and 0 is reminder above ]
         *  * 1/2           - 0        - 1      => 1 * 10 + 0 = 10  [ 1 is the last reminder and 0 is reminder above]
         *
         *  So we can derive an equation with that,
         *  f(n) = n mod 2 + 10 * f(n/2)
         *
         */
        return decimal % 2 + 10 * convertToBinary(decimal / 2);
    }

    public static void main(String[] args) {

        System.out.println(convertToBinary(13));
    }
}
