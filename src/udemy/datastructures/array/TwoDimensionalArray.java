package udemy.datastructures.array;

import java.util.Arrays;

public class TwoDimensionalArray {

    int[][] arr;

    /**
     * Initializing the array using setting min integer value for every index
     * We use contractor for this
     * @param numberOfRows
     * @param numberOfColumns
     */

    public TwoDimensionalArray(int numberOfRows, int numberOfColumns) {
        this.arr = new int[numberOfRows][numberOfColumns];

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr.length; col++) {
                arr[row][col] = Integer.MIN_VALUE;
            }
        }
    }

    /**
     * Inserting value in the array
     */

    public void insertValueToTheArray(int row, int col, int value) {

        try {
            if (arr[row][col] == Integer.MIN_VALUE)
                arr[row][col] = value;
            else
                System.out.println("Already inserted!");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid Index!");
        }
    }

    public static void main(String[] args) {

        TwoDimensionalArray array = new TwoDimensionalArray(2,2);
        array.insertValueToTheArray(0,0, 10);
        array.insertValueToTheArray(1, 0, 20);

        /**
         * Using Arrays library we can print both 1D and 2D arrays
         * We can use deepToString() method for printing multidimensional arrays
         */
        System.out.println(Arrays.deepToString(array.arr));
    }
}
