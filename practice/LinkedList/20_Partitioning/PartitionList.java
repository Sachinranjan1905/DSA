/** Stable partition: values below pivot precede values at least pivot. */
public class PartitionList {
    static class ListNode { int value; ListNode next; ListNode(int value) { this.value = value; } }

    static ListNode partition(ListNode head, int pivot) {
        ListNode smallDummy = new ListNode(0), largeDummy = new ListNode(0), small = smallDummy, large = largeDummy;
        while (head != null) { ListNode next = head.next; head.next = null; if (head.value < pivot) { small.next = head; small = head; } else { large.next = head; large = head; } head = next; }
        small.next = largeDummy.next; return smallDummy.next;
    }
}
