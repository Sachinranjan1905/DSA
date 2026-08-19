/** Minimal doubly linked list with O(1) append and remove by node. */
public class DoublyLinkedList {
    static class Node { int value; Node previous, next; Node(int value) { this.value = value; } }
    private Node head, tail;

    void addLast(int value) { Node node = new Node(value); if (tail == null) head = tail = node; else { node.previous = tail; tail.next = node; tail = node; } }
    void remove(Node node) { if (node.previous == null) head = node.next; else node.previous.next = node.next; if (node.next == null) tail = node.previous; else node.next.previous = node.previous; }
    boolean isEmpty() { return head == null; }
}
