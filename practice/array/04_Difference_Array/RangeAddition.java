import java.util.Arrays;

/** Apply many inclusive range additions, then reconstruct the final array. */
public class RangeAddition {
    public static int[] apply(int length, int[][] updates) {
        int[] difference = new int[length + 1];
        for (int[] update : updates) {
            int left = update[0], right = update[1], amount = update[2];
            difference[left] += amount;
            difference[right + 1] -= amount;
        }
        int[] result = new int[length];
        for (int index = 0; index < length; index++) {
            if (index > 0) difference[index] += difference[index - 1];
            result[index] = difference[index];
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(apply(5, new int[][] {{1, 3, 2}, {2, 2, 1}})));
    }
}
