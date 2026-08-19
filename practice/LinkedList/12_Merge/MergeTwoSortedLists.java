/** Merge two ascending lists by reusing nodes. */
public class MergeTwoSortedLists {
    static class ListNode { int value; ListNode next; ListNode(int value) { this.value = value; } }

    static ListNode merge(ListNode first, ListNode second) {
        ListNode dummy = new ListNode(0), tail = dummy;
        while (first != null && second != null) {
            if (first.value <= second.value) { tail.next = first; first = first.next; }
            else { tail.next = second; second = second.next; }
            tail = tail.next;
        }
        tail.next = first != null ? first : second;
        return dummy.next;
    }

    // Invariant: dummy.next..tail is sorted and contains exactly all consumed nodes.
}
