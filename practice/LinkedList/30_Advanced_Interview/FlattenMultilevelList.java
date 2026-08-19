/** Flatten nodes with next and child links depth-first, preserving child order. */
public class FlattenMultilevelList {
    static class Node { int value; Node next, child; Node(int value) { this.value = value; } }

    static Node flatten(Node head) {
        if (head == null) return null;
        Node current = head;
        while (current != null) {
            if (current.child != null) {
                Node afterChild = current.next, childHead = flatten(current.child);
                current.next = childHead; current.child = null;
                Node childTail = childHead; while (childTail.next != null) childTail = childTail.next;
                childTail.next = afterChild;
            }
            current = current.next;
        }
        return head;
    }
}
