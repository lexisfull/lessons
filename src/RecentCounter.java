import java.util.ArrayDeque;
import java.util.Deque;

public class RecentCounter {

    private Deque<Integer> ping = new ArrayDeque<>();
    private static final int WINDOW_MS = 3000;

    public RecentCounter() {

    }

    public int ping(int t) {
        ping.offer(t);
        int time = t - WINDOW_MS;
        while (ping.peek() < time) {
            ping.poll();
        }
        return ping.size();
    }
}
