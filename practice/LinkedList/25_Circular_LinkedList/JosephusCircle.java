/** Josephus elimination on a circular singly linked list. */
public class JosephusCircle {
    static int survivor(int people, int step) {
        if (people <= 0 || step <= 0) throw new IllegalArgumentException("Positive inputs required");
        int survivor = 0;
        for (int size = 2; size <= people; size++) survivor = (survivor + step) % size;
        return survivor;
    }
}
