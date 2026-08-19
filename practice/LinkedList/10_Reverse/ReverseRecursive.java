/** Recursive reversal. The recursive call returns the new head of the suffix. */
public class ReverseRecursive {
    static class ListNode { int value; ListNode next; ListNode(int value) { this.value = value; } }

    static ListNode reverse(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode newHead = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }

    // Time O(n), recursion stack O(n); the final assignment prevents a cycle.
}
