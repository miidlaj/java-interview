import java.util.ArrayList;
import java.util.Collection;
import java.util.function.BiConsumer;

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

        java.util.ArrayList l = new java.util.ArrayList();

        l.add("String");
        l.add(5);
        l.add(null);

        l.forEach(oneItem -> System.out.println(oneItem));

        String str = "Hello World";
        System.out.println(reverse(str));

        System.out.println(0.1 + 0.2);

    }
}
