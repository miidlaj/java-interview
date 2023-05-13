package stack;

import java.util.Stack;

public class ReverseString {

    public static void main(String[] args) {

        String str = "Midlaj";
        Stack stack = new Stack();

        for (char c: str.toCharArray()) {
            stack.push(c);
        }

        StringBuffer reversed = new StringBuffer();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }

        System.out.println(reversed);

    }
}
