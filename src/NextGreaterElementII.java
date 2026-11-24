import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class NextGreaterElementII {
    public int[] nextGreaterElements(int[] nums) {
        int[] answer = new int[nums.length];
        Arrays.fill(answer, -1);
        Deque<Integer> stack = new ArrayDeque<>();
        int i = 0;
        int passes = 1;
        while (i < nums.length) {
            while (!stack.isEmpty() && nums[i] > nums[stack.peek()]) {
                int previous = stack.pop();
                answer[previous] = nums[i];
            }
            if (passes == 1) {
                stack.push(i);
            }
            i++;
            if (i == nums.length && passes < 2) {
                i = 0;
                passes++;
            }
        }
        return answer;
    }
}
