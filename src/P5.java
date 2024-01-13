import java.util.Stack;
import java.util.concurrent.BlockingDeque;

public class P5 {

    public static boolean method(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(')');
            } else if (c == '{') {
                stack.push('}');
            } else if (c == '[') {
                stack.push(']');
            } else if (stack.isEmpty() || stack.pop() != c) {
                return false;
            }
        }

        return stack.isEmpty();
    }

    public static void main (String[] arg){
        String input = "()";
        String input1 = "()[]{}";
        String input2 = "(]";

        boolean result1 = method(input);
        boolean result2 = method(input1);
        boolean result3 = method(input2);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);


    }
}
