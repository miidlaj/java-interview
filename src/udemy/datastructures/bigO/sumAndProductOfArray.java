package udemy.datastructures.bigO;

public class sumAndProductOfArray {


    static void sumAndProductOfArray(int arr[]) {
        int sum = 0;                            /** O(1) */
        int product = 1;                        /** O(1) */

        for (int i = 0; i < arr.length; i++) {  /** O(n) */
            sum += arr[i];                      /** O(1) */
        }

        for (int i = 0; i < arr.length; i++) {  /** O(n) */
            product *= arr[i];                  /** O(1) */
        }

        System.out.println("Sum: " + sum + " Product: " + product); /** O(1) */
    }

    /**
     * According to Drop constants and non-determinant terms
     * We can avoid the constants O(1) and 2 in O(2n) [ O(n) + O(n) = O(2n) ]
     * So the time complexity is O(n)
     *
     */

    public static void main(String[] args) {

        int[] array = {1, 6, 5, 9, 8, 7, 5 ,2 };
        sumAndProductOfArray(array);
    }
}
