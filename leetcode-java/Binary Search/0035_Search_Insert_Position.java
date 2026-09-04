/*
 * ============================================================================
 * LeetCode Problem : 35. Search Insert Position
 * Difficulty       : Easy
 * Topic            : Binary Search
 * Language         : Java
 *
 * Problem Link:
 * https://leetcode.com/problems/search-insert-position/
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
 * - If the target is not found, the value of `left` represents the correct
 *   position where the target should be inserted.
 *
 * Time Complexity : O(log n)
 * Space Complexity: O(1)
 *
 * Concepts Used:
 * - Binary Search
 * - Sorted Array
 * - Two Pointers
 * - Search Space Reduction
 *
 * Author : Sachin Ranjan
 * GitHub : https://github.com/Sachinranjan1905
 * Brand  : TheCodeOfTruth
 * ============================================================================
 */

public class 0035_Search_Insert_Position {
    
    public int searchInsert(int[] nums, int target) {
        int left=0;
        int right=nums.length-1;
        //int medium=
        int found=0;
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
       
        return left;
        
    
}
}
