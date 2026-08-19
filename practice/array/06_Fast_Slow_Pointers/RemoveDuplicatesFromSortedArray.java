/*
 * ============================================================================
 * LeetCode Problem : 26. Remove Duplicates from Sorted Array
 * Difficulty       : Easy
 * Topic            : Array
 * Language         : Java
 *
 * Problem Link:
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 *
 * ----------------------------------------------------------------------------
 * Approach:
 * - Use the Two Pointer Technique.
 * - Keep one pointer to traverse the array.
 * - Use another pointer to place the next unique element.
 * - Since the array is sorted, compare the current element with the
 *   previous element.
 * - If the current element is different, place it at the next position
 *   and move the pointer forward.
 * - Return the number of unique elements.
 *
 * Time Complexity : O(n)
 * Space Complexity: O(1)
 *
 * Concepts Used:
 * - Two Pointer Technique
 * - Array Traversal
 * - In-Place Modification
 * - Sorted Array
 *
 * Author : Sachin Ranjan
 * GitHub : https://github.com/Sachinranjan1905
 * Brand  : TheCodeOfTruth
 * ============================================================================
 */

public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int write = 1;
        for (int read = 1; read < nums.length; read++) {
            if (nums[read] != nums[read - 1]) {
                nums[write++] = nums[read];
            }
        }
        return write;
    }
}
