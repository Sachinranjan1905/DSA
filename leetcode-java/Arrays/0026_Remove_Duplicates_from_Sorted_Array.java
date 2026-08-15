p/*
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

public class 0026_Remove_Duplicates_from_Sorted_Array {
    public int removeDuplicates(int[] nums) {
        int count=0;
        int j=0;
        if(nums.length==1){
            return 1;
        }
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]!=nums[i+1]){
                nums[j++]=nums[i];
                count++;
            }
        }
        
        nums[j]=nums[nums.length-1];
        count++;
    
        return count;
        
    }
}
