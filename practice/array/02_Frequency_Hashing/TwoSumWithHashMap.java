import java.util.HashMap;
import java.util.Map;

/** Find two indices whose values add to target. Primary pattern: HashMap. */
public class TwoSumWithHashMap {
    public static int[] twoSum(int[] values, int target) {
        Map<Integer, Integer> indexByValue = new HashMap<>();
        for (int index = 0; index < values.length; index++) {
            int needed = target - values[index];
            if (indexByValue.containsKey(needed)) {
                return new int[] {indexByValue.get(needed), index};
            }
            indexByValue.put(values[index], index);
        }
        return new int[] {-1, -1};
    }

    public static void main(String[] args) {
        int[] result = twoSum(new int[] {2, 7, 11, 15}, 9);
        System.out.println(result[0] + ", " + result[1]);
    }
}
