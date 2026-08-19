/*
 * Array Operations
 * ----------------
 * This program demonstrates the fundamental operations performed on an array:
 *
 * 1. Traversal  - Visit each element of the array.
 * 2. Searching  - Find an element and return its index.
 * 3. Updating   - Modify an element at a given index.
 * 4. Insertion  - Insert an element at a specific position by shifting elements.
 * 5. Deletion   - Remove an element and shift remaining elements.
 *
 * The implementation handles common edge cases such as:
 * - Null or empty arrays
 * - Invalid indices
 * - Full array during insertion
 * - Searching for unavailable elements
 *
 * Time Complexity:
 * - Access / Update: O(1)
 * - Traversal / Linear Search: O(n)
 * - Insertion: O(n)
 * - Deletion: O(n)
 *
 * Space Complexity:
 * - O(1) auxiliary space
 */

import java.util.Arrays;

public class ArrayOperations {

    // ==============================
    // 1. TRAVERSAL
    // ==============================
    public static void traverse(int[] arr, int size) {

        if (arr == null) {
            System.out.println("Array is null");
            return;
        }

        if (size <= 0) {
            System.out.println("Array is empty");
            return;
        }

        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }


    // ==============================
    // 2. SEARCHING
    // ==============================

    // Linear Search
    // Returns index, otherwise -1
    public static int search(int[] arr, int size, int target) {

        if (arr == null || size <= 0) {
            return -1;
        }

        for (int i = 0; i < size; i++) {
            if (arr[i] == target) {
                return i;
            }
        }

        return -1;
    }


    // ==============================
    // 3. UPDATE
    // ==============================
    public static boolean update(
            int[] arr,
            int size,
            int index,
            int newValue
    ) {

        if (arr == null) {
            return false;
        }

        if (index < 0 || index >= size) {
            return false;
        }

        arr[index] = newValue;

        return true;
    }


    // ==============================
    // 4. INSERTION
    // ==============================
    public static int insert(
            int[] arr,
            int size,
            int index,
            int value
    ) {

        if (arr == null) {
            return size;
        }

        // Array full
        if (size >= arr.length) {
            System.out.println("Array is full");
            return size;
        }

        // Invalid index
        if (index < 0 || index > size) {
            System.out.println("Invalid index");
            return size;
        }

        // Shift elements right
        for (int i = size; i > index; i--) {
            arr[i] = arr[i - 1];
        }

        arr[index] = value;

        return size + 1;
    }


    // ==============================
    // 5. DELETION
    // ==============================
    public static int delete(
            int[] arr,
            int size,
            int index
    ) {

        if (arr == null || size <= 0) {
            System.out.println("Array is empty");
            return size;
        }

        // Invalid index
        if (index < 0 || index >= size) {
            System.out.println("Invalid index");
            return size;
        }

        // Shift elements left
        for (int i = index; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }

        // Remove stale value
        arr[size - 1] = 0;

        return size - 1;
    }


    // ==============================
    // PRINT
    // ==============================
    public static void print(int[] arr, int size) {

        if (arr == null || size <= 0) {
            System.out.println("[]");
            return;
        }

        System.out.println(
                Arrays.toString(Arrays.copyOf(arr, size))
        );
    }


    // ==============================
    // MAIN
    // ==============================
    public static void main(String[] args) {

        int[] arr = new int[10];

        int size = 5;

        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        System.out.print("Original: ");
        print(arr, size);


        // Traversal
        System.out.print("Traversal: ");
        traverse(arr, size);


        // Searching
        int target = 30;

        int index = search(arr, size, target);

        if (index != -1) {
            System.out.println(
                    target + " found at index " + index
            );
        } else {
            System.out.println(target + " not found");
        }


        // Update
        boolean updated = update(
                arr,
                size,
                2,
                35
        );

        if (updated) {
            System.out.print("After Update: ");
            print(arr, size);
        }


        // Insertion
        size = insert(
                arr,
                size,
                2,
                25
        );

        System.out.print("After Insert: ");
        print(arr, size);


        // Deletion
        size = delete(
                arr,
                size,
                3
        );

        System.out.print("After Delete: ");
        print(arr, size);
    }
}