package udemy.datastructures.bigO;

import java.util.Arrays;

public class reverseArray {

    static int[] reverseArray(int arr[]) {
        for (int i = 0; i < arr.length / 2; i++) {  /** O(n/2) */
            int other = arr.length - i - 1;         /** O(1) */
            int temp = arr[i];                      /** O(1) */
            arr[i] = arr[other];                    /** O(1) */
            arr[other] = temp;                      /** O(1) */
        }

        return arr;
    }

    /**
     * We can remove /2 from O(n/2) because it's a constant
     * So time complexity is O(n)
     *
     */

    public static void main(String[] args) {

        int[] array = {1, 6, 5, 9, 8, 7, 5 ,2 };
        System.out.println(Arrays.toString(reverseArray(array)));
    }
}
