package recursion;

public class StringReversal {

    public static void main(String[] args) {

        String str = "Hello World";
        System.out.println("Original string: " + str);
        String reversed = reverseString(str);
        System.out.println("Reversed string: " + reversed);

    }

    private static String reverseString(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }

        return reverseString(str.substring(1)) + str.charAt(0);
    }
}
