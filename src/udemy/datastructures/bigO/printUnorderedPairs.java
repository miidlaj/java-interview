package udemy.datastructures.bigO;

public class printUnorderedPairs {

    static void printUnorderedPair(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j< array.length; j++) {
                System.out.print(array[i] + " " + array[j] + "    ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int[] array = {1, 6, 5, 9};
        printUnorderedPair(array);

    }
}