package recursion;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class SumOfDigits {

    public static void main(String[] args) {
        System.out.println(1+2+3+5+"java"+5+6);

        Runnable r = () -> {
            System.out.println("Hello, world!");
        };

        System.out.println();



        List<String> strings = Arrays.asList("apple", "banana", "orange");

// Using lambda expression
        strings.forEach((str) -> System.out.println(str.toUpperCase()));

// Using method reference
        strings.stream().map(String::toCharArray).forEach(System.out::println);

        int num = 12345;
        System.out.println("Sum of digits of " + num + " is: " + sumOfDigits(num));
    }

    private static int sumOfDigits(int num) {

        if (num == 0)
            return 0;

        return (num % 10) + sumOfDigits(num / 10);
    }
}
