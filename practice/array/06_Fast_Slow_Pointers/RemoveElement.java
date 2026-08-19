/*
 * ============================================================================
 * LeetCode Problem : 27. Remove Element
 * Difficulty       : Easy
 * Topic            : Array
 * Language         : Java
 *
 * Problem Link:
 * https://leetcode.com/problems/remove-element/
 *
 * ----------------------------------------------------------------------------
 * Approach:
 * - Use the Two Pointer Technique.
 * - Use one pointer to traverse the array.
 * - Use another pointer to place elements that are not equal to val.
 * - If the current element is not equal to val, place it at the next
 *   available position and move the pointer forward.
 * - Elements equal to val are skipped.
 * - Return the number of remaining elements.
 *
 * Time Complexity : O(n)
 * Space Complexity: O(1)
 *
 * Concepts Used:
 * - Two Pointer Technique
 * - Array Traversal
 * - In-Place Modification
 * - Conditional Filtering
 *
 * Author : Sachin Ranjan
 * GitHub : https://github.com/Sachinranjan1905
 * Brand  : TheCodeOfTruth
 * ============================================================================
 */

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int write = 0;
        for (int read = 0; read < nums.length; read++) {
            if (nums[read] != val) {
                nums[write++] = nums[read];
            }
        }
        return write;
    }
}