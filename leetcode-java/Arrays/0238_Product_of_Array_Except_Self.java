/*
 * ============================================================================
 * LeetCode Problem : 238. Product of Array Except Self
 * Difficulty       : Medium
 * Topic            : Array / Prefix Product
 * Language         : Java
 *
 * Problem Link:
 * https://leetcode.com/problems/product-of-array-except-self/
 *
 * ----------------------------------------------------------------------------
 * Approach:
 * - For every index, we need the product of all elements except nums[i].
 * - First, store the product of all elements to the left of each index.
 * - Then, traverse from right to left and multiply each position by the
 *   product of all elements to its right.
 * - Use the result array itself to store the left products.
 * - This avoids using division and uses O(1) extra space apart from the
 *   output array.
 *
 * Time Complexity : O(n)
 * Space Complexity: O(1) Extra Space
 *
 * Concepts Used:
 * - Prefix Product
 * - Suffix Product
 * - Array Traversal
 * - In-Place Result Construction
 *
 * Author : Sachin Ranjan
 * GitHub : https://github.com/Sachinranjan1905
 * Brand  : TheCodeOfTruth
 * ============================================================================
 */

public class 0238_Product_of_Array_Except_Self {
    public int[] productExceptSelf(int[] nums) {
        int left=1,right=1;
        int [] suffix=new int[nums.length];
        int [] prefix=new int[nums.length];
        prefix[0]=1;
        for(int i=1;i<nums.length;i++){
            left *=nums[i-1];
            prefix[i]=left;
        }
        suffix[nums.length-1]=1;
        for(int i=nums.length-2;i>=0;i--){
            right *=nums[i+1];
            suffix[i] =right;
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=prefix[i]*suffix[i];
        }
        return nums;
    }
}
