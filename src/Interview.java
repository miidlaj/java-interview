import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;
import java.util.Stack;

public class Interview {

    public static String reverse(String str) {

        StringBuilder reversed = new StringBuilder();
        for (String string: str.split(" ")) {

            for (int i = string.length() - 1; i >= 0; i--) {
                reversed.append(string.charAt(i));
            }
            reversed.append(" ");
        }
        return reversed.toString();
    }

    public static void main(String[] args) {

        String str = "Hello World";
        System.out.println(reverse(str));

    }
}
