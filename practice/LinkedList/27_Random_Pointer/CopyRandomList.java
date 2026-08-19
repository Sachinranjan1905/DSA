import java.util.IdentityHashMap;
import java.util.Map;

/** Deep-copy a list whose nodes have next and arbitrary random references. */
public class CopyRandomList {
    static class Node { int value; Node next, random; Node(int value) { this.value = value; } }

    static Node copy(Node head) {
        Map<Node, Node> copies = new IdentityHashMap<>();
        for (Node current = head; current != null; current = current.next) copies.put(current, new Node(current.value));
        for (Node current = head; current != null; current = current.next) { Node clone = copies.get(current); clone.next = copies.get(current.next); clone.random = copies.get(current.random); }
        return copies.get(head);
    }
}
