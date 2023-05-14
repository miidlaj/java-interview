package udemy.recursion.questions;

public class PowerOfNumber {

    static int powerOfNumber(int base, int exp) {

        /**
         * number^1 = number
         * number^0 = 1
         * number^-ve = not possible
         */
        if (exp < 0)
            return -1;
        if (exp == 0)
            return 1;
        if (exp == 1)
            return base;

        /**
         * number^n = number * number^(n - 1)
         * a^b * a^c = a^(b + c)
         */
        return base * powerOfNumber(base, exp - 1);
    }

    public static void main(String[] args) {

        System.out.println(powerOfNumber(2, 0));
    }
}
