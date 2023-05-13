package sorting;

import java.util.Arrays;

/**
 * Time complexity will be O(n) in best case and O(n^2) in worst case
 */
public class BubbleSort {

    public static int[] bubbleSort(int arr[]) {
        int n = arr.length;
        boolean isSorted;
        for (int i = 0; i < n; i++){
            isSorted = true;
            for (int j = 1; j < (n- i); j++){
                if (arr[j-1] > arr[j]) {
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                    isSorted = false;
                }
                if (isSorted)
                    return arr;
            }
        }
        return arr;
    }

    public static int[] testBubbleSort(int arr[]) {
        int n = arr.length;
        boolean isSorted;

        for (int i = 0; i < n; i++) {
            isSorted = true;
            for (int j = 1; j < (n-i); j++) {
                if (arr[j-1] > arr[j]) {
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                    isSorted = false;
                }
            }
            if (isSorted)
                return arr;
        }

        return arr;
    }
    public static void main(String[] args) {
        int arr[] ={3,60,35,2,45,320,5};
        System.out.println(Arrays.toString(testBubbleSort(arr)));
    }
}
