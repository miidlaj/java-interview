package udemy.datastructures.bigO;

public class printPairsOfArray {

    static void printPairs(int arr[]) {

        for (int i = 0; i < arr.length; i++) {              /** O(n) */
            for (int j = 0; j < arr.length; j++) {          /** O(n) */
                System.out.println(arr[i] + " " + arr[j]);  /** O(1) */
            }
        }
    }

    /**
     * So when we combine we should multiply the O(n) with O(n) because it is nested loop
     * So the complexity will be O(n^2)
     * we drop O(1)
     */
    public static void main(String[] args) {

        int[] array = {1, 6, 5, 9};
        printPairs(array);
    }
}
