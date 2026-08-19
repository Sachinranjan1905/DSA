/** Return the second middle for even-length lists. */
public class MiddleOfList {
    static class ListNode { int value; ListNode next; ListNode(int value) { this.value = value; } }

    static ListNode middle(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // For 1->2->3->4, slow returns 3 because fast reaches null after two jumps.
}
