/** Reorder 1->2->3->4->5 as 1->5->2->4->3. */
public class ReorderList {
    static class ListNode { int value; ListNode next; ListNode(int value) { this.value = value; } }

    static void reorder(ListNode head) {
        if (head == null || head.next == null) return;
        ListNode slow = head, fast = head;
        while (fast.next != null && fast.next.next != null) { slow = slow.next; fast = fast.next.next; }
        ListNode right = reverse(slow.next); slow.next = null;
        ListNode left = head;
        while (right != null) { ListNode leftNext = left.next, rightNext = right.next; left.next = right; right.next = leftNext; left = leftNext; right = rightNext; }
    }

    private static ListNode reverse(ListNode head) { ListNode previous = null; while (head != null) { ListNode next = head.next; head.next = previous; previous = head; head = next; } return previous; }
}
