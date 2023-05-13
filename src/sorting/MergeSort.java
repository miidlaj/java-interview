package sorting;

import java.util.Arrays;

public class MergeSort {

    public static void mergeSort(int arr[]) {
        int n = arr.length;

        if (n < 2)
            return;

        int midIdx = n/2;
        int[] leftHalf = new int[midIdx];
        int[] rightHalf = new int[n - midIdx];

        for (int i = 0; i < midIdx; i++) {
            leftHalf[i] = arr[i];
        }
        for (int i = midIdx; i < n; i++) {
            rightHalf[i - midIdx] = arr[i];
        }

        mergeSort(leftHalf);
        mergeSort(rightHalf);

        //Merge
        merge(arr, leftHalf, rightHalf);

    }

    private static void merge(int[] inputArray, int[] leftHalf, int[] rightHalf) {
        int leftSize = leftHalf.length;
        int rightSize = rightHalf.length;

        int i = 0, j = 0, k = 0;

        while (i < leftSize && j < rightSize) {
            if (leftHalf[i] <= rightHalf[j]) {
                inputArray[k] = leftHalf[i];
                i++;
            } else {
                inputArray[k] = rightHalf[j];
                j++;
            }
            k++;
        }

        while (i < leftSize) {
            inputArray[k] = leftHalf[i];
            i++;
            k++;
        }
        while (j < rightSize) {
            inputArray[k] = rightHalf[j];
            j++;
            k++;
        }
    }

    public static void testMergeSort(int arr[]) {
        int n = arr.length;

        if (n <= 1)
            return;

        int midIdx = n/2;

        int[] leftHalf = Arrays.copyOfRange(arr, 0, midIdx);
        int[] rightHalf = Arrays.copyOfRange(arr, midIdx, n);

        mergeSort(rightHalf);

        testMerge(arr, leftHalf, rightHalf);
    }

    private static void testMerge(int[] inputArray, int[] leftHalf, int[] rightHalf) {
        int i = 0, j = 0, k = 0;
        int leftSize = leftHalf.length;
        int rightSize = rightHalf.length;
        while (i < leftSize && j < rightSize) {
            if (leftHalf[i] < rightHalf[j]){
                inputArray[k] = leftHalf[i];
                k++;
                i++;
            } else {
                inputArray[k] = rightHalf[j];
                k++;
                j++;
            }
        }

        while (i < leftSize) {
            inputArray[k] = leftHalf[i];
            k++;
            i++;
        }
        while (j < rightSize) {
            inputArray[k] = rightHalf[j];
            j++;
            k++;
        }

    }
    public static void main(String[] args) {

        int arr[] ={3,60,35,2,45,320,5};
        testMergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
