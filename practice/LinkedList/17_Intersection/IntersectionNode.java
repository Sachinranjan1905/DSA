/** Find shared node identity with pointer switching. */
public class IntersectionNode {
    static class ListNode { int value; ListNode next; ListNode(int value) { this.value = value; } }

    static ListNode find(ListNode headA, ListNode headB) {
        ListNode first = headA, second = headB;
        while (first != second) {
            first = first == null ? headB : first.next;
            second = second == null ? headA : second.next;
        }
        return first;
    }
}
