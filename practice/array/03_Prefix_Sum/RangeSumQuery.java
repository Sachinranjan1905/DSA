/** Immutable range-sum queries using a leading-zero prefix array. */
public class RangeSumQuery {
    private final long[] prefix;

    public RangeSumQuery(int[] values) {
        prefix = new long[values.length + 1];
        for (int index = 0; index < values.length; index++) {
            prefix[index + 1] = prefix[index] + values[index];
        }
    }

    public long sum(int left, int right) {
        if (left < 0 || right >= prefix.length - 1 || left > right) {
            throw new IllegalArgumentException("Invalid inclusive range");
        }
        return prefix[right + 1] - prefix[left];
    }

    public static void main(String[] args) {
        System.out.println(new RangeSumQuery(new int[] {2, 4, 1, 5}).sum(1, 3));
    }
}
