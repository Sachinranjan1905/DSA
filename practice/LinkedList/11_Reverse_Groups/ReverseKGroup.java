/** Reverse every complete group of k nodes; leave a short suffix unchanged. */
public class ReverseKGroup {
    static class ListNode { int value; ListNode next; ListNode(int value) { this.value = value; } }

    static ListNode reverseKGroup(ListNode head, int k) {
        if (k <= 1) return head;
        ListNode dummy = new ListNode(0); dummy.next = head; ListNode groupPrevious = dummy;
        while (true) {
            ListNode groupEnd = groupPrevious;
            for (int count = 0; count < k && groupEnd != null; count++) groupEnd = groupEnd.next;
            if (groupEnd == null) break;
            ListNode groupStart = groupPrevious.next, nextGroup = groupEnd.next;
            ListNode previous = nextGroup, current = groupStart;
            while (current != nextGroup) { ListNode next = current.next; current.next = previous; previous = current; current = next; }
            groupPrevious.next = groupEnd; groupPrevious = groupStart;
        }
        return dummy.next;
    }
}
