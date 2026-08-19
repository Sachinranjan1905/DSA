import java.util.HashMap;
import java.util.Map;

/** Count subarrays with sum k; negative values make a simple window invalid. */
public class SubarraySumEqualsK {
    public static int count(int[] values, int target) {
        Map<Integer, Integer> prefixCounts = new HashMap<>();
        prefixCounts.put(0, 1);
        int prefix = 0, answer = 0;
        for (int value : values) {
            prefix += value;
            answer += prefixCounts.getOrDefault(prefix - target, 0);
            prefixCounts.put(prefix, prefixCounts.getOrDefault(prefix, 0) + 1);
        }
        return answer;
    }
}
