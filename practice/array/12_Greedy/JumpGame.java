/** Determine whether the last index is reachable with greedy frontier tracking. */
public class JumpGame {
    public static boolean canReachEnd(int[] jumps) {
        int farthest = 0;
        for (int index = 0; index < jumps.length; index++) {
            if (index > farthest) return false;
            farthest = Math.max(farthest, index + jumps[index]);
        }
        return jumps.length > 0;
    }
}
