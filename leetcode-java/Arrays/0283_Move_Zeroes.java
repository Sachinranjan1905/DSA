/*
 * ============================================================================
 * LeetCode Problem : 283. Move Zeroes
 * Difficulty       : Easy
 * Topic            : Array / Two Pointers
 * Language         : Java
 *
 * Problem Link:
 * https://leetcode.com/problems/move-zeroes/
 *
 * ----------------------------------------------------------------------------
 * Approach:
 * - Use a pointer `index` to track the position where the next non-zero
 *   element should be placed.
 * - Traverse the array from left to right.
 * - Whenever a non-zero element is found, place it at `index` and increment
 *   the pointer.
 * - After all non-zero elements are placed, fill the remaining positions
 *   with zeroes.
 * - This modifies the array in-place without using an extra array.
 *
 * Time Complexity : O(n)
 * Space Complexity: O(1)
 *
 * Concepts Used:
 * - Two Pointers
 * - Array Traversal
 * - In-Place Modification
 * - Stable Ordering
 *
 * Author : Sachin Ranjan
 * GitHub : https://github.com/Sachinranjan1905
 * Brand  : TheCodeOfTruth
 * ============================================================================
 */

public class 0283_Move_Zeroes {
    public void moveZeroes(int[] nums) {
      int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                count++;
            }
        }
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[j++]=nums[i];
            }
        }
        while(count>0){
            nums[j++]=0;
            count--;
        }
      
    }
}
