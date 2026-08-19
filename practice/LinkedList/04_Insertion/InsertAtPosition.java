/** Insert a value at a zero-based position. Example: 1->3, position 1, value 2 => 1->2->3. */
public class InsertAtPosition {
    static class ListNode { int value; ListNode next; ListNode(int value) { this.value = value; } }

    static ListNode insert(ListNode head, int position, int value) {
        if (position < 0) throw new IllegalArgumentException("Negative position");
        ListNode dummy = new ListNode(0); dummy.next = head;
        ListNode previous = dummy;
        for (int index = 0; index < position; index++) {
            if (previous.next == null) throw new IndexOutOfBoundsException("Position is past the end");
            previous = previous.next;
        }
        ListNode node = new ListNode(value);
        node.next = previous.next;
        previous.next = node;
        return dummy.next;
    }

    // Pointer invariant: previous is the node immediately before the insertion point.
}
