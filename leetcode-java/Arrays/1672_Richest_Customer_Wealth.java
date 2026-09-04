/*
 * ============================================================================
 * LeetCode Problem : 1672. Richest Customer Wealth
 * Difficulty       : Easy
 * Topic            : Array
 * Language         : Java
 *
 * Problem Link:
 * https://leetcode.com/problems/richest-customer-wealth/
 *
 * ----------------------------------------------------------------------------
 * Approach:
 * - Each row represents the bank accounts of one customer.
 * - Traverse every customer's accounts.
 * - Calculate the total wealth of each customer.
 * - Keep track of the maximum wealth found.
 * - Return the maximum wealth.
 *
 * Time Complexity : O(m × n)
 * Space Complexity: O(1)
 *
 * Concepts Used:
 * - 2D Array
 * - Nested Loops
 * - Array Traversal
 * - Maximum Value
 *
 * Author : Sachin Ranjan
 * GitHub : https://github.com/Sachinranjan1905
 * Brand  : TheCodeOfTruth
 * ============================================================================
 */


public class 1672_Richest_Customer_Wealth {
    public int maximumWealth(int[][] accounts) {
        int m=accounts.length;
        int n=accounts[0].length;
        int sum=0;
       
        for(int i=0;i<m;i++){
             int temp=0;
            for(int j=0;j<n;j++){
                temp+=accounts[i][j];
            }
            if(sum<=temp){
                sum=temp;
            }
        }
        return sum;
    }
}
