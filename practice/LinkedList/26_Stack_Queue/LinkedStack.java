/** LIFO stack backed by a singly linked list. Push and pop are O(1). */
public class LinkedStack {
    private static class Node { int value; Node next; Node(int value) { this.value = value; } }
    private Node top;
    public void push(int value) { Node node = new Node(value); node.next = top; top = node; }
    public int pop() { if (top == null) throw new IllegalStateException("Stack is empty"); int value = top.value; top = top.next; return value; }
}
