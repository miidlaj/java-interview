package udemy.datastructures.array;

import java.util.Arrays;

public class TwoDimensionalArray {

    public static void main(String[] args) {

        /**
         * @Step 1: Declare
         */

        int[][] arr;

        /**
         * @Step 2: Instantiate
         */
        arr = new int[2][2];

        /**
         * @Step 3: Initialize
         *
         * This is going to take O(mn) time complexity
         * where m is the number of rows and m is the number of columns
         */
        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[1][0] = 3;
        arr[1][1] = 4;

        System.out.println(Arrays.deepToString(arr));

        /**
         * All together
         */

        String stringArray[][] = {{"a", "b"}, {"c", "d"}};
        System.out.println(Arrays.deepToString(stringArray));
    }

}
