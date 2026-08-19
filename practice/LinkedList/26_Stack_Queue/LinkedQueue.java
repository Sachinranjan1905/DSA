/** FIFO queue backed by a singly linked list. Enqueue and dequeue are O(1). */
public class LinkedQueue {
    private static class Node { int value; Node next; Node(int value) { this.value = value; } }
    private Node head, tail;
    public void offer(int value) { Node node = new Node(value); if (tail == null) head = tail = node; else { tail.next = node; tail = node; } }
    public int poll() { if (head == null) throw new IllegalStateException("Queue is empty"); int value = head.value; head = head.next; if (head == null) tail = null; return value; }
}
