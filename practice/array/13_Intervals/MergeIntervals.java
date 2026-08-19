import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/** Merge overlapping inclusive intervals after sorting by start. */
public class MergeIntervals {
    public static int[][] merge(int[][] intervals) {
        if (intervals.length == 0) return new int[0][];
        Arrays.sort(intervals, Comparator.comparingInt(interval -> interval[0]));
        List<int[]> merged = new ArrayList<>();
        int start = intervals[0][0], end = intervals[0][1];
        for (int index = 1; index < intervals.length; index++) {
            if (intervals[index][0] <= end) end = Math.max(end, intervals[index][1]);
            else { merged.add(new int[] {start, end}); start = intervals[index][0]; end = intervals[index][1]; }
        }
        merged.add(new int[] {start, end});
        return merged.toArray(new int[0][]);
    }
}
