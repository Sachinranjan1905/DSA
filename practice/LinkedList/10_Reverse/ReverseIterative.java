/** Reverse links in place: 1->2->3 becomes 3->2->1. */
public class ReverseIterative {
    static class ListNode { int value; ListNode next; ListNode(int value) { this.value = value; } }

    static ListNode reverse(ListNode head) {
        ListNode previous = null, current = head;
        while (current != null) {
            ListNode next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;
    }

    // Invariant: previous is the completely reversed prefix; next preserves the unread suffix.
}
