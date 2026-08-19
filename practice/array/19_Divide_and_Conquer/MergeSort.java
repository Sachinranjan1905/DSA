import java.util.Arrays;

/** Stable divide-and-conquer sorting for integer arrays. */
public class MergeSort {
    public static void sort(int[] values) {
        if (values.length < 2) return;
        int[] buffer = new int[values.length];
        sort(values, buffer, 0, values.length - 1);
    }

    private static void sort(int[] values, int[] buffer, int left, int right) {
        if (left >= right) return;
        int middle = left + (right - left) / 2;
        sort(values, buffer, left, middle);
        sort(values, buffer, middle + 1, right);
        int first = left, second = middle + 1, write = left;
        while (first <= middle && second <= right) buffer[write++] = values[first] <= values[second] ? values[first++] : values[second++];
        while (first <= middle) buffer[write++] = values[first++];
        while (second <= right) buffer[write++] = values[second++];
        for (int index = left; index <= right; index++) values[index] = buffer[index];
    }

    public static void main(String[] args) { int[] values = {4, 1, 3, 2}; sort(values); System.out.println(Arrays.toString(values)); }
}
