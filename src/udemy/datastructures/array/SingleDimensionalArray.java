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

    public void display() {
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {

        SingleDimensionalArray array = new SingleDimensionalArray(10);
        array.insert(0,0);
        array.insert(9,5);
        array.insert(2,1);
        array.insert(9,10);
        array.display();

        var firstElement = array.arr[10];
        System.out.println(firstElement);
    }
}
