/** Average-linear kth-largest selection using in-place Lomuto partitioning. */
public class KthLargestQuickselect {
    public static int find(int[] values, int k) {
        int target = values.length - k, left = 0, right = values.length - 1;
        while (left <= right) {
            int pivot = partition(values, left, right);
            if (pivot == target) return values[pivot];
            if (pivot < target) left = pivot + 1;
            else right = pivot - 1;
        }
        throw new IllegalArgumentException("Invalid k");
    }

    private static int partition(int[] values, int left, int right) {
        int pivotValue = values[right], write = left;
        for (int index = left; index < right; index++) if (values[index] <= pivotValue) swap(values, write++, index);
        swap(values, write, right);
        return write;
    }

    private static void swap(int[] values, int first, int second) { int temp = values[first]; values[first] = values[second]; values[second] = temp; }
}
