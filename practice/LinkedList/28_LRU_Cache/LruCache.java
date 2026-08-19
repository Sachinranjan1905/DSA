import java.util.HashMap;
import java.util.Map;

/** HashMap + doubly linked list LRU cache: expected O(1) get and put. */
public class LruCache {
    private static class Node { int key, value; Node previous, next; Node(int key, int value) { this.key = key; this.value = value; } }
    private final int capacity; private final Map<Integer, Node> nodes = new HashMap<>();
    private final Node head = new Node(0, 0), tail = new Node(0, 0);

    public LruCache(int capacity) { if (capacity < 0) throw new IllegalArgumentException("Negative capacity"); this.capacity = capacity; head.next = tail; tail.previous = head; }
    public int get(int key) { Node node = nodes.get(key); if (node == null) return -1; remove(node); addAfterHead(node); return node.value; }
    public void put(int key, int value) { if (capacity == 0) return; Node node = nodes.get(key); if (node != null) { node.value = value; remove(node); addAfterHead(node); return; } node = new Node(key, value); nodes.put(key, node); addAfterHead(node); if (nodes.size() > capacity) { Node evicted = tail.previous; remove(evicted); nodes.remove(evicted.key); } }
    private void remove(Node node) { node.previous.next = node.next; node.next.previous = node.previous; }
    private void addAfterHead(Node node) { node.next = head.next; node.previous = head; head.next.previous = node; head.next = node; }
}
