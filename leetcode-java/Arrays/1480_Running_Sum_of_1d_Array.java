/*
 * ============================================================================
 * LeetCode Problem : 1480. Running Sum of 1d Array
 * Difficulty       : Easy
 * Topic            : Array
 * Language         : Java
 *
 * Problem Link:
 * https://leetcode.com/problems/running-sum-of-1d-array/
 *
 * ----------------------------------------------------------------------------
 * Approach:
 * - Traverse the array from left to right.
 * - Add the previous element to the current element.
 * - Store the running sum directly in the same array.
 * - Each element at index i becomes the sum of all elements from index 0
 *   to index i.
 *
 * Time Complexity : O(n)
 * Space Complexity: O(1)
 *
 * Concepts Used:
 * - Array Traversal
 * - Prefix Sum
 * - In-Place Modification
 *
 * Author : Sachin Ranjan
 * GitHub : https://github.com/Sachinranjan1905
 * Brand  : TheCodeOfTruth
 * ============================================================================
 */

public class 1480_Running_Sum_of_1d_Array {
    public int[] runningSum(int[] nums) {

        for(int i=0;i<nums.length;i++){
            if(i!=0)
            nums[i]=nums[i-1]+nums[i];
        }
        return nums;
    }
}
