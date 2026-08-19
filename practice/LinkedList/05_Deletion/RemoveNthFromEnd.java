/** Remove the nth node from the end using a sentinel and a fixed pointer gap. */
public class RemoveNthFromEnd {
    static class ListNode { int value; ListNode next; ListNode(int value) { this.value = value; } }

    static ListNode remove(ListNode head, int n) {
        if (n <= 0) throw new IllegalArgumentException("n must be positive");
        ListNode dummy = new ListNode(0); dummy.next = head;
        ListNode fast = dummy, slow = dummy;
        for (int step = 0; step < n; step++) {
            if (fast.next == null) throw new IndexOutOfBoundsException("n is too large");
            fast = fast.next;
        }
        while (fast.next != null) { fast = fast.next; slow = slow.next; }
        slow.next = slow.next.next;
        return dummy.next;
    }

    // Invariant: fast is n nodes ahead of slow; slow reaches the predecessor of the target.
}
