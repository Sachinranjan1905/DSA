/** Minimum ship capacity that delivers all packages within a day limit. */
public class ShipCapacity {
    public static int minimumCapacity(int[] weights, int days) {
        int low = 0, high = 0;
        for (int weight : weights) { low = Math.max(low, weight); high += weight; }
        while (low < high) {
            int capacity = low + (high - low) / 2;
            if (canShip(weights, days, capacity)) high = capacity;
            else low = capacity + 1;
        }
        return low;
    }

    private static boolean canShip(int[] weights, int days, int capacity) {
        int usedDays = 1, load = 0;
        for (int weight : weights) {
            if (load + weight > capacity) { usedDays++; load = 0; }
            load += weight;
        }
        return usedDays <= days;
    }
}
