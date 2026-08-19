/** Iterative binary search on a sorted array. */
public class BinarySearch {
    public static int search(int[] values, int target) {
        int left = 0, right = values.length - 1;
        while (left <= right) {
            int middle = left + (right - left) / 2;
            if (values[middle] == target) return middle;
            if (values[middle] < target) left = middle + 1;
            else right = middle - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(search(new int[] {1, 2, 4, 6, 8, 9}, 8));
    }
}
