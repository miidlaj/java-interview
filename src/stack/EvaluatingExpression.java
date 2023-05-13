package stack;

import java.util.Stack;

public class EvaluatingExpression {

    public static void main(String[] args) {

        String postfix = "5 3 2 / +";

        Stack<Integer> stack = new Stack();
        for (String token : postfix.split(" ")) {
            if (token.equals("+")) {
                int b = stack.pop();
                int a = stack.pop();
                stack.push(a + b);
            } else if (token.equals("-")) {
                int b = stack.pop();
                int a = stack.pop();
                stack.push(a - b);
            } else if (token.equals("/")) {
                int b = stack.pop();
                int a = stack.pop();
                stack.push(a / b);
            } else if (token.equals("*")) {
                int b = stack.pop();
                int a = stack.pop();
                stack.push(a * b);
            } else {
                int converted = Integer.parseInt(token);
                stack.push(converted);
            }
        }

        System.out.println();
        System.out.println(stack.pop());
    }
}
