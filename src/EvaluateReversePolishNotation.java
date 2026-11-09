import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Set;

public class EvaluateReversePolishNotation {


    public int evalRPN(String[] tokens) {
        Deque<Integer> stack = new ArrayDeque<>();
        Set<String> operations = new HashSet<>();
        operations.add("*");
        operations.add("/");
        operations.add("+");
        operations.add("-");
        for (String token : tokens) {
            if (!operations.contains(token)) {
                stack.push(Integer.valueOf(token));
            } else {
                char operation = token.charAt(0);
                int num2 = stack.pop();
                int num1 = stack.pop();
                int result = switch (operation) {
                    case '+' -> num1 + num2;
                    case '-' -> num1 - num2;
                    case '*' -> num1 * num2;
                    case '/' -> num1 / num2;
                    default -> throw new IllegalArgumentException();
                };

                stack.push(result);
            }
        }
        return stack.pop();
    }
}
