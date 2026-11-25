import java.util.ArrayDeque;
import java.util.Deque;

public class RemoveKDigits {

    public static void main(String[] args) {
        System.out.println(removeKdigits("123009245790283475", 2));
    }

    public static String removeKdigits(String num, int k) {
        if (k >= num.length()) {
            return "0";
        }
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(Character.getNumericValue(num.charAt(0)));
        for (int i = 1; i < num.length(); i++) {
            int current = Character.getNumericValue(num.charAt(i));
            while (!stack.isEmpty() && stack.peek() > current && k > 0) {
                stack.pop();
                k--;
            }
            stack.push(current);

        }
        while (k > 0) {
            stack.pop();
            k--;
        }
        StringBuilder str = new StringBuilder();
        while (!stack.isEmpty()) {
            str.append(stack.pop());
        }
        for (int i = str.length() - 1; i > 0; i--) {
            if (Character.getNumericValue(str.charAt(i)) > 0) {
                break;
            }
            str.deleteCharAt(i);
        }

        return str.reverse().toString();
    }
}
