package recursion;

public class BinarySearch {

    public static int binarySearch(int[] array, int target) {
        return binarySearchRecursiveHelper(array, target, 0, array.length - 1);
    }

    private static int binarySearchRecursiveHelper(int[] array, int target, int low, int high) {
        if (low > high) {
            return -1; // target not found
        }

        int mid = low + (high - low) / 2; // calculate the middle index of the array

        if (array[mid] == target) {
            return mid; // target found at the middle index
        } else if (array[mid] < target) {
            return binarySearchRecursiveHelper(array, target, mid + 1, high); // search the right half of the array
        } else {
            return binarySearchRecursiveHelper(array, target, low, mid - 1); // search the left half of the array
        }
    }

    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 5, 6, 10};

        System.out.println(binarySearch(arr, 0));

    }
}
