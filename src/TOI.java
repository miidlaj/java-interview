public class TOI {

    public static boolean search(int[] arr, int target) {
        return search(arr, target, 0, arr.length - 1);
    }

    public static boolean search(int[] arr, int target, int lowIdx, int highIdx) {

        if (lowIdx > highIdx)
            return false;

        System.out.println(lowIdx + " " + highIdx);
        int mid = lowIdx + (highIdx - lowIdx) / 2;

        if (arr[mid] == target)
            return true;
        else if (arr[mid] < target) {
            return search(arr, target, mid + 1, highIdx);
        } else {
            return search(arr, target, lowIdx, mid - 1);
        }
    }


    public static void main(String[] args) {

        int array[] = {1, 6, 5 ,7, 9, 15};

        System.out.println(search(array, 1));

        Test.find("jnjr");
    }

}
