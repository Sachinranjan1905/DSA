/*
 * ============================================================================
 * LeetCode Problem : 704. Binary Search
 * Difficulty       : Easy
 * Topic            : Binary Search
 * Language         : Java
 *
 * Problem Link:
 * https://leetcode.com/problems/binary-search/
 *
 * ----------------------------------------------------------------------------
 * Approach:
 * - Use Binary Search because the array is sorted in ascending order.
 * - Maintain two pointers:
 *      left  = 0
 *      right = nums.length - 1
 * - Calculate the middle index using:
 *      mid = left + (right - left) / 2
 * - If nums[mid] == target, return mid.
 * - If nums[mid] < target, search in the right half.
 * - Otherwise, search in the left half.
 * - If the target is not found, return -1.
 *
 * Time Complexity : O(log n)
 * Space Complexity: O(1)
 *
 * Concepts Used:
 * - Binary Search
 * - Sorted Array
 * - Two Pointers
 * - Divide and Conquer
 *
 * Author : Sachin Ranjan
 * GitHub : https://github.com/Sachinranjan1905
 * Brand  : TheCodeOfTruth
 * ============================================================================
 */

public class 0704_Binary_Search {
    
    public int search(int[] nums, int target) {
        int left=0;
        int right=nums.length-1;
        while(left<=right){
            int medium=(left+right)/2;
            if(nums[medium]==target){
                return medium;
            }
            else if(nums[medium]>target){
                right=medium-1;
            }
            else{
                left=medium+1;
            }
        }
        return -1;
    }
}
    

