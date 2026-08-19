import java.util.PriorityQueue;

/** Merge k sorted lists with a min-heap of current heads. */
public class MergeKSortedLists {
    static class ListNode { int value; ListNode next; ListNode(int value) { this.value = value; } }

    static ListNode merge(ListNode[] lists) {
        PriorityQueue<ListNode> heap = new PriorityQueue<>((first, second) -> Integer.compare(first.value, second.value));
        for (ListNode head : lists) if (head != null) heap.offer(head);
        ListNode dummy = new ListNode(0), tail = dummy;
        while (!heap.isEmpty()) { ListNode node = heap.poll(); tail.next = node; tail = node; if (node.next != null) heap.offer(node.next); }
        tail.next = null; return dummy.next;
    }
}
