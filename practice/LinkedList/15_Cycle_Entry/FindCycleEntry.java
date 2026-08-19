/** Return the first node in a cycle, or null when the list is acyclic. */
public class FindCycleEntry {
    static class ListNode { int value; ListNode next; ListNode(int value) { this.value = value; } }

    static ListNode entry(ListNode head) {
        ListNode slow = head, fast = head;
        do {
            if (fast == null || fast.next == null) return null;
            slow = slow.next; fast = fast.next.next;
        } while (slow != fast);
        ListNode fromHead = head;
        while (fromHead != slow) { fromHead = fromHead.next; slow = slow.next; }
        return slow;
    }
}
