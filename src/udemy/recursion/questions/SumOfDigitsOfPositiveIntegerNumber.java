package udemy.recursion.questions;

public class SumOfDigitsOfPositiveIntegerNumber {

    static int sumOfDigits(int num) {
        /**
         * @Step 3: Unintentional case
         * we should check the value given is +ve number or not
         *
         * @Step 2: stopping criterion
         * We can stop recursive call when the n become 0
         */
        if (num == 0 || num < 0)
            return 0;

        /**
         *
         * @Step 1: Recursive case
         * Any number divided by 10 gives the reminder which is same as the last digit of that number
         * Example: 10/10 gives reminder 0
         * 23/10 gives reminder 3 and quotient 2
         * 112/10 gives 11 and 2; we should divide this 11 using 10, and it will give 1 and 1;
         */
        return num % 10 + sumOfDigits(num / 10);
    }
    public static void main(String[] args) {

        System.out.println(sumOfDigits(23));
    }
}
