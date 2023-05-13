package sorting;

import java.util.Arrays;
import java.util.Random;

public class QuickSort {

    public static void quickSort(int arr[]) {
        testQuickSort(arr, 0, arr.length - 1);
    }

    private static void quickSort(int arr[], int lowIdx, int highIdx) {

        if (lowIdx >= highIdx)
            return;

        int pivot = arr[highIdx];

        int leftPointer = lowIdx;
        int rightPointer = highIdx;

        while (leftPointer < rightPointer) {

            while (arr[leftPointer] <= pivot && leftPointer < rightPointer) {
                leftPointer++;
            }

            while (arr[rightPointer] >= pivot && leftPointer < rightPointer) {
                rightPointer--;
            }

            swap(arr, leftPointer, rightPointer);
        }

        swap(arr, leftPointer, highIdx);

        quickSort(arr, lowIdx, leftPointer - 1);
        quickSort(arr, leftPointer + 1, highIdx);

    }

    private static void testQuickSort(int arr[], int lowIdx, int highIdx) {

        int pivot = arr[highIdx];

        int leftPointer = lowIdx;
        int rightPointer = highIdx;

        while (leftPointer < rightPointer) {

            while (arr[leftPointer] <= pivot && leftPointer < rightPointer ) {
                leftPointer++;
            }

            while (arr[rightPointer] >= pivot && leftPointer < rightPointer) {
                rightPointer--;
            }

            swap(arr, leftPointer, rightPointer);
        }

        swap(arr, leftPointer, highIdx);

        quickSort(arr, lowIdx, leftPointer - 1);
        quickSort(arr, leftPointer + 1, highIdx);
    }

    private static void swap(int arr[], int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
    public static void main(String[] args) {
        int arr[] ={3,60,35,2,45,320,5};
        quickSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
