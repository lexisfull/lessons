import java.util.ArrayDeque;
import java.util.Deque;

public class DailyTemperatures {

    public int[] dailyTemperatures(int[] temperatures) {

        int[] answer = new int[temperatures.length];
        Deque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < temperatures.length; i++) {
            while (!stack.isEmpty() && temperatures[stack.peek()] < temperatures[i]) {
                int previous = stack.pop();
                answer[previous] = i - previous;
            }
            stack.push(i);
        }
        return answer;
    }

//    public int[] dailyTemperatures(int[] temperatures) {
//
//        int[] answer = new int[temperatures.length];
//        Deque<Integer> stack = new ArrayDeque<>();
//        stack.push(0);
//        for (int i = 1; i < temperatures.length; i++) {
//            int j = i;
//            while (j < temperatures.length) {
//                if (temperatures[stack.peek()] < temperatures[j]) {
//                    answer[i - 1] += j - stack.pop();
//                    break;
//                }
//                j++;
//            }
//            stack.push(i);
//        }
//        return answer;
//    }
}
