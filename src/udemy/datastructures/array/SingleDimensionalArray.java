package udemy.datastructures.array;

import java.util.Arrays;

public class SingleDimensionalArray {

    int arr[] = null;

    public SingleDimensionalArray(int size) {
        arr = new int[size];

        /**
         * By default, the array values will be 0;
         * here we set it as min integer value of java for identifying and checking already inserted.
         */
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.MIN_VALUE;
        }
    }

    /**
     * Inserting array
     * @param location
     * @param valueToBeInserted
     */
    public void insert(int location, int valueToBeInserted) {

        try {
            if (arr[location] == Integer.MIN_VALUE)
                arr[location] = valueToBeInserted;
            else
                System.out.println("This cell is already occupied");
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index access array!");
        }

    }

    /**
     * print array using Arrays function ( toString() )
     *
     */
    public void display() {
        System.out.println(Arrays.toString(arr));
    }

    /**
     * Traversing into every element in an array
     */
    public void traverse() {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }

    /**
     * We loop into every element and check until our target found.
     * @param value
     * @return
     */
    public int search(int value) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value){
                index = i;
                break;
            }

        }
        return index;
    }

    public static void main(String[] args) {

        /**
         * Building an array
         */
        SingleDimensionalArray array = new SingleDimensionalArray(10);

        /**
         * Inserting into an array
         */
        array.insert(0,0);
        array.insert(9,5);
        array.insert(2,1);
        array.insert(9,10);

        /**
         * Displaying using Arrays function
         */
        array.display();

        /**
         * Accessing array using index
         */
        var firstElement = array.arr[9];
        System.out.println(firstElement);

        /**
         * Traversal
         */
        array.traverse();

        /**
         * Searching element
         */
        System.out.println(array.search(5));

    }
}
