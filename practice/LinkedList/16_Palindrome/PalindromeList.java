/** Check and restore a singly linked list palindrome in O(n) time/O(1) space. */
public class PalindromeList {
    static class ListNode { int value; ListNode next; ListNode(int value) { this.value = value; } }

    static boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) return true;
        ListNode slow = head, fast = head;
        while (fast.next != null && fast.next.next != null) { slow = slow.next; fast = fast.next.next; }
        ListNode right = reverse(slow.next); boolean equal = true;
        for (ListNode left = head, current = right; current != null; left = left.next, current = current.next) {
            if (left.value != current.value) { equal = false; break; }
        }
        slow.next = reverse(right);
        return equal;
    }

    private static ListNode reverse(ListNode head) {
        ListNode previous = null;
        while (head != null) { ListNode next = head.next; head.next = previous; previous = head; head = next; }
        return previous;
    }
}
