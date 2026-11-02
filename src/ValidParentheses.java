import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Map;

/**
 *  https://leetcode.com/problems/valid-parentheses/
 */
public class ValidParentheses {

    private static final Map<Character, Character> BRACKETS = Map.of(
            ')', '(',
            ']', '[',
            '}', '{'
    );
    
    public boolean isValid(String s) {

        Deque<Character> stack = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i ++) {
            if (BRACKETS.containsKey(s.charAt(i)) && stack.isEmpty()) {
                return false;
            }
            if (!BRACKETS.containsKey(s.charAt(i))) {
                stack.push(s.charAt(i));
            }
            if (BRACKETS.containsKey(s.charAt(i)) && !stack.pop().equals(BRACKETS.get(s.charAt(i)))) {
                return false;
            }
        }


        return stack.isEmpty();
    }
}
