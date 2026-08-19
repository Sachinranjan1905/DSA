/** Bottom-up recursive merge sort for a singly linked list. */
public class SortList {
    static class ListNode { int value; ListNode next; ListNode(int value) { this.value = value; } }

    static ListNode sort(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode slow = head, fast = head.next;
        while (fast != null && fast.next != null) { slow = slow.next; fast = fast.next.next; }
        ListNode right = slow.next; slow.next = null;
        return merge(sort(head), sort(right));
    }

    private static ListNode merge(ListNode first, ListNode second) {
        ListNode dummy = new ListNode(0), tail = dummy;
        while (first != null && second != null) {
            if (first.value <= second.value) { tail.next = first; first = first.next; }
            else { tail.next = second; second = second.next; }
            tail = tail.next;
        }
        tail.next = first == null ? second : first; return dummy.next;
    }
}
