package sorting;

import java.util.Arrays;

/**
 * Time complexity will be O(n) in best case and O(n^2) in worst case
 */
public class InsertionSort {

    public static int[] insertionSort(int arr[]) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int current = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > current) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = current;
        }
        return arr;
    }

    public static int[] testInsertionSort(int arr[]) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int current = arr[i];
            int j = i -1;
            while (j >= 0 && arr[j] > current) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = current;
        }

        return arr;
    }

    public static void main(String[] args) {
        int arr[] ={3,60,35,2,45,320,5};
        System.out.println(Arrays.toString(testInsertionSort(arr)));
    }
}
