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

class Solution {
    public int removeElement(int[] nums, int val) {
        int j = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[j] = nums[i];
                j++;
            }
        }

        return j;
    }
}


public class 0027_Remove_Element {
public int removeElement(int[] nums, int val) {
        int count=0;
      
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[j++]=nums[i];
                count++;
            }
           
        }
        return count;
    }
}