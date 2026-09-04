/*
 * ============================================================================
 * LeetCode Problem : 34. Find First and Last Position of Element in Sorted Array
 * Difficulty       : Medium
 * Topic            : Binary Search
 * Language         : Java
 *
 * Problem Link:
 * https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
 *
 * ----------------------------------------------------------------------------
 * Approach:
 * - Since the array is sorted, use Binary Search to achieve O(log n) time.
 * - Perform two separate Binary Searches:
 *      1. Find the first occurrence of the target.
 *      2. Find the last occurrence of the target.
 * - For the first occurrence:
 *      - If nums[mid] == target, store mid and continue searching left.
 * - For the last occurrence:
 *      - If nums[mid] == target, store mid and continue searching right.
 * - If the target does not exist, return {-1, -1}.
 *
 * Time Complexity : O(log n)
 * Space Complexity: O(1)
 *
 * Concepts Used:
 * - Binary Search
 * - Sorted Array
 * - First Occurrence
 * - Last Occurrence
 * - Search Space Reduction
 *
 * Author : Sachin Ranjan
 * GitHub : https://github.com/Sachinranjan1905
 * Brand  : TheCodeOfTruth
 * ============================================================================
 */

public class 0034_Find_First_and_Last_Position_of_Element_in_Sorted_Array {
    public int[] searchRange(int[] nums, int target) {

        int[] result = {-1, -1};

        // Find first occurrence
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                result[0] = mid;
                right = mid - 1;       // go left
            }
            else if (nums[mid] > target) {
                right = mid - 1;
            }
            else {
                left = mid + 1;
            }
        }

        // Find last occurrence
        left = 0;
        right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                result[1] = mid;
                left = mid + 1;        // go right
            }
            else if (nums[mid] > target) {
                right = mid - 1;
            }
            else {
                left = mid + 1;
            }
        }

        return result;
    }
}
