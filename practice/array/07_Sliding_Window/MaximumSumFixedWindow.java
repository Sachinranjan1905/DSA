/** Maximum sum of any contiguous window of exactly k items. */
public class MaximumSumFixedWindow {
    public static long maximumSum(int[] values, int k) {
        if (k <= 0 || k > values.length) throw new IllegalArgumentException("Invalid k");
        long window = 0;
        for (int index = 0; index < k; index++) window += values[index];
        long best = window;
        for (int right = k; right < values.length; right++) {
            window += values[right] - values[right - k];
            best = Math.max(best, window);
        }
        return best;
    }

    public static void main(String[] args) {
        System.out.println(maximumSum(new int[] {2, 1, 5, 3, 4}, 3));
    }
}
