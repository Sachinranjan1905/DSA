/** Floyd cycle detection. Node identity, not value equality, determines a cycle. */
public class HasCycle {
    static class ListNode { int value; ListNode next; ListNode(int value) { this.value = value; } }

    static boolean hasCycle(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) return true;
        }
        return false;
    }
}
