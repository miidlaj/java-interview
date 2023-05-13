package sorting;

import java.util.Arrays;

/**
 *
 */
public class SelectionSort {

    public static int[] selectionSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int minIdx = i;
            for (int j = (i + 1); j < n; j++) {
                if (arr[j] < arr[minIdx])
                    minIdx = j;
            }
            int temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;
        }

        return arr;
    }

    public static int[] testSelectionSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++){
            int minIdx = i;
            for (int j = (i + 1); j < n; j++) {
                if (arr[j] < arr[minIdx])
                    minIdx = j;
            }
            int temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;
        }

        return arr;
    }

    public static void main(String[] args) {
        int arr[] ={3,60,35,2,45,320,5};
        System.out.println(Arrays.toString(testSelectionSort(arr)));
    }
}
