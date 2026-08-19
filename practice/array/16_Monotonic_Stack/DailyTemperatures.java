import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

/** For each day, find how many days until a warmer temperature. */
public class DailyTemperatures {
    public static int[] daysUntilWarmer(int[] temperatures) {
        int[] answer = new int[temperatures.length];
        Deque<Integer> decreasingIndices = new ArrayDeque<>();
        for (int day = 0; day < temperatures.length; day++) {
            while (!decreasingIndices.isEmpty()
                    && temperatures[decreasingIndices.peek()] < temperatures[day]) {
                int previousDay = decreasingIndices.pop();
                answer[previousDay] = day - previousDay;
            }
            decreasingIndices.push(day);
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(daysUntilWarmer(new int[] {73, 74, 75, 71, 69, 72, 76, 73})));
    }
}
