/*
 * ============================================================================
 * LeetCode Problem : 1295. Find Numbers with Even Number of Digits
 * Difficulty       : Easy
 * Topic            : Array
 * Language         : Java
 *
 * Problem Link:
 * https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
 *
 * ----------------------------------------------------------------------------
 * Approach:
 * - Traverse every number in the array.
 * - Count the number of digits in each number.
 * - If the number of digits is even, increment the result count.
 * - Return the total count of numbers having an even number of digits.
 *
 * Time Complexity : O(n × d)
 * Space Complexity: O(1)
 *
 * Concepts Used:
 * - Array Traversal
 * - Digit Counting
 * - Modulo Operator
 * - Integer Division
 *
 * Author : Sachin Ranjan
 * GitHub : https://github.com/Sachinranjan1905
 * Brand  : TheCodeOfTruth
 * ============================================================================
 */


public class 1295_Find_Numbers_with_Even_Number_of_Digits {
    public int findNumbers(int[] nums) {
        int evenCount=0;
        for(int i=0;i<nums.length;i++){
            int temp=nums[i];
            int count=0;
            while(temp>0){
                temp /=10;
                count++;
            }
            if(count%2==0){
                evenCount++;
            }
        }
        return evenCount;
    }
}
