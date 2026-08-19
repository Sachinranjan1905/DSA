/** Rotate right in O(n): 1->2->3->4->5, k=2 => 4->5->1->2->3. */
public class RotateRight {
    static class ListNode { int value; ListNode next; ListNode(int value) { this.value = value; } }

    static ListNode rotate(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) return head;
        int length = 1; ListNode tail = head;
        while (tail.next != null) { tail = tail.next; length++; }
        k %= length; if (k == 0) return head;
        tail.next = head;
        for (int steps = 0; steps < length - k; steps++) tail = tail.next;
        ListNode newHead = tail.next; tail.next = null; return newHead;
    }
}
