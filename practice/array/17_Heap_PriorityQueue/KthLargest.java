import java.util.PriorityQueue;

/** Keep a min-heap of k winners to find the kth largest value. */
public class KthLargest {
    public static int find(int[] values, int k) {
        if (k < 1 || k > values.length) throw new IllegalArgumentException("Invalid k");
        PriorityQueue<Integer> winners = new PriorityQueue<>();
        for (int value : values) {
            winners.offer(value);
            if (winners.size() > k) winners.poll();
        }
        return winners.peek();
    }

    public static void main(String[] args) {
        System.out.println(find(new int[] {3, 2, 1, 5, 6, 4}, 2));
    }
}
