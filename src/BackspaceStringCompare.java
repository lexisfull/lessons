import java.util.ArrayDeque;
import java.util.Deque;

public class BackspaceStringCompare {
    public boolean backspaceCompare(String s, String t) {

        Deque<Character> stack = getStack(s);
        Deque<Character> stack2 = getStack(t);
        if (stack.size() != stack2.size()) {
            return false;
        }
        while (!stack.isEmpty()) {
            if (!stack.pop().equals(stack2.pop())) {
                return false;
            }
        }
        return stack2.isEmpty();
    }

    private ArrayDeque<Character> getStack(String s) {
        ArrayDeque<Character> stack = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '#') {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                stack.push(s.charAt(i));
            }
        }
        return stack;
    }
}
