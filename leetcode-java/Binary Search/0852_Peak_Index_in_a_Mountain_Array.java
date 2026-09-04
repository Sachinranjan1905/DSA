/*
 * ============================================================================
 * LeetCode Problem : 852. Peak Index in a Mountain Array
 * Difficulty       : Medium
 * Topic            : Binary Search
 * Language         : Java
 *
 * Problem Link:
 * https://leetcode.com/problems/peak-index-in-a-mountain-array/
 *
 * ----------------------------------------------------------------------------
 * Approach:
 * - A mountain array first increases and then decreases.
 * - Use Binary Search to find the peak element.
 * - Compare nums[mid] with nums[mid + 1].
 * - If nums[mid] > nums[mid + 1]:
 *      - We are on the decreasing side.
 *      - The peak can be at mid or to the left.
 *      - Move right = mid.
 * - Otherwise:
 *      - We are on the increasing side.
 *      - The peak must be to the right of mid.
 *      - Move left = mid + 1.
 * - When left == right, both pointers point to the peak index.
 *
 * Time Complexity : O(log n)
 * Space Complexity: O(1)
 *
 * Concepts Used:
 * - Binary Search
 * - Mountain Array
 * - Peak Element
 * - Search Space Reduction
 * - Two Pointers
 *
 * Author : Sachin Ranjan
 * GitHub : https://github.com/Sachinranjan1905
 * Brand  : TheCodeOfTruth
 * ============================================================================
 */

public class 0852_Peak_Index_in_a_Mountain_Array {
    
}
