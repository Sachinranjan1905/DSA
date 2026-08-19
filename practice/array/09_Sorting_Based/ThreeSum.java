import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/** Return unique triplets whose sum is zero. Primary pattern: sorting + pointers. */
public class ThreeSum {
    public static List<List<Integer>> find(int[] values) {
        Arrays.sort(values);
        List<List<Integer>> result = new ArrayList<>();
        for (int first = 0; first < values.length - 2; first++) {
            if (first > 0 && values[first] == values[first - 1]) continue;
            int left = first + 1, right = values.length - 1;
            while (left < right) {
                int sum = values[first] + values[left] + values[right];
                if (sum == 0) {
                    result.add(Arrays.asList(values[first], values[left], values[right]));
                    while (left < right && values[left] == values[left + 1]) left++;
                    while (left < right && values[right] == values[right - 1]) right--;
                    left++; right--;
                } else if (sum < 0) left++;
                else right--;
            }
        }
        return result;
    }
}
