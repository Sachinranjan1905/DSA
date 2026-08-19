/** Create and traverse a singly linked list.
 * Example: [10, 20, 30] -> 10 -> 20 -> 30 -> null.
 * Pattern: fundamentals and traversal. Time O(n), space O(n) for nodes.
 */
public class CreateAndTraverse {
    static class ListNode { int value; ListNode next; ListNode(int value) { this.value = value; } }

    static ListNode fromArray(int[] values) {
        ListNode head = null, tail = null;
        for (int value : values) {
            ListNode node = new ListNode(value);
            if (head == null) head = tail = node;
            else { tail.next = node; tail = node; }
        }
        return head;
    }

    static void print(ListNode head) {
        for (ListNode current = head; current != null; current = current.next) {
            System.out.print(current.value + (current.next == null ? " -> null" : " -> "));
        }
        System.out.println();
    }

    public static void main(String[] args) { print(fromArray(new int[] {10, 20, 30})); }
}
