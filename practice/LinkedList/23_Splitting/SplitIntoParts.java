import java.util.ArrayList;
import java.util.List;

/** Split a list into k consecutive parts whose sizes differ by at most one. */
public class SplitIntoParts {
    static class ListNode { int value; ListNode next; ListNode(int value) { this.value = value; } }

    static List<ListNode> split(ListNode head, int k) {
        if (k <= 0) throw new IllegalArgumentException("k must be positive");
        int length = 0; for (ListNode current = head; current != null; current = current.next) length++;
        List<ListNode> parts = new ArrayList<>(); int base = length / k, extra = length % k; ListNode current = head;
        for (int part = 0; part < k; part++) { ListNode partHead = current; int size = base + (part < extra ? 1 : 0); for (int step = 1; step < size; step++) current = current.next; if (size > 0) { ListNode next = current.next; current.next = null; current = next; } parts.add(partHead); }
        return parts;
    }
}
