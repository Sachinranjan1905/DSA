/*
 * ============================================================================
 * LeetCode Problem : 1920. Build Array from Permutation
 * Difficulty       : Easy
 * Topic            : Array
 * Language         : Java
 *
 * Problem Link:
 * https://leetcode.com/problems/build-array-from-permutation/
 *
 * ----------------------------------------------------------------------------
 * Approach:
 * - Create a new array to store the result.
 * - Traverse the input array from left to right.
 * - For each index i, set:
 *      ans[i] = nums[nums[i]]
 * - Return the resulting array.
 *
 * Time Complexity : O(n)
 * Space Complexity: O(n)
 *
 * Concepts Used:
 * - Array Traversal
 * - Array Indexing
 * - Permutation
 *
 * Author : Sachin Ranjan
 * GitHub : https://github.com/Sachinranjan1905
 * Brand  : TheCodeOfTruth
 * ============================================================================
 */

public class 1920_Build_Array_from_Permutation {
    public int[] buildArray(int[] nums) {
        int len=nums.length;
        int[] dummy=new int[len];
        for(int i=0;i<len;i++){
            dummy[i]=nums[nums[i]];
        }
        return dummy;
    }
}
