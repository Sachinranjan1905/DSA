import java.util.HashSet;
import java.util.Set;

/** Remove repeated values from an unsorted list while preserving first occurrences. */
public class RemoveDuplicates {
    static class ListNode { int value; ListNode next; ListNode(int value) { this.value = value; } }

    static ListNode remove(ListNode head) {
        Set<Integer> seen = new HashSet<>(); ListNode previous = null, current = head;
        while (current != null) { ListNode next = current.next; if (seen.add(current.value)) previous = current; else previous.next = next; current = next; }
        return head;
    }
}
