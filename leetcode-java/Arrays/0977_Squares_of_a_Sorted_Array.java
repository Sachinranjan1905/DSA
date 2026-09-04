/*
 * ============================================================================
 * LeetCode Problem : 977. Squares of a Sorted Array
 * Difficulty       : Easy
 * Topic            : Array / Two Pointers
 * Language         : Java
 *
 * Problem Link:
 * https://leetcode.com/problems/squares-of-a-sorted-array/
 *
 * ----------------------------------------------------------------------------
 * Approach:
 * - The input array is sorted in non-decreasing order.
 * - Negative numbers can have larger squares than positive numbers.
 * - Use two pointers:
 *      left  -> beginning of the array
 *      right -> end of the array
 * - Compare the absolute values at both pointers.
 * - Place the larger square at the end of the result array.
 * - Move the corresponding pointer inward.
 * - Continue until all elements are processed.
 *
 * Time Complexity : O(n)
 * Space Complexity: O(n)
 *
 * Concepts Used:
 * - Two Pointers
 * - Sorted Array
 * - Array Traversal
 * - Comparing Absolute Values
 *
 * Author : Sachin Ranjan
 * GitHub : https://github.com/Sachinranjan1905
 * Brand  : TheCodeOfTruth
 * ============================================================================
 */

public class 0977_Squares_of_a_Sorted_Array {
    public int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];
        int left=0;
        int right=nums.length-1;
        int i=nums.length-1;
        while(left <=right){
            if(nums[right]*nums[right] > nums[left]*nums[left]){
                result[i--] = nums[right]*nums[right];
                right--;
            }
            else{
               
                result[i--] = nums[left]*nums[left];
                left++;
            }
            
        }
            return result;
        }
    
}
