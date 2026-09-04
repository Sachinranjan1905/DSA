/*
 * ============================================================================
 * LeetCode Problem : 485. Max Consecutive Ones
 * Difficulty       : Easy
 * Topic            : Array
 * Language         : Java
 *
 * Problem Link:
 * https://leetcode.com/problems/max-consecutive-ones/
 *
 * ----------------------------------------------------------------------------
 * Approach:
 * - Traverse the array from left to right.
 * - Maintain a counter for the current consecutive sequence of 1s.
 * - If the current element is 1, increment the counter.
 * - If the current element is 0, reset the counter to 0.
 * - Keep track of the maximum consecutive 1s found.
 * - Return the maximum count.
 *
 * Time Complexity : O(n)
 * Space Complexity: O(1)
 *
 * Concepts Used:
 * - Array Traversal
 * - Counting
 * - Maximum Value
 * - Conditional Statements
 *
 * Author : Sachin Ranjan
 * GitHub : https://github.com/Sachinranjan1905
 * Brand  : TheCodeOfTruth
 * ============================================================================
 */


public class 0485_Max_Consecutive_Ones {
    public int findMaxConsecutiveOnes(int[] nums) {
      
        int count=0;
        int n=nums.length;
        int max=0;
        for(int i=0;i<n;i++){
            if(nums[i]==1){
                count++;
                if(count>max){
                    max=count;
                }
            }
            else{
                count=0;
            }
        }
        
    
        return max;
    }
}
