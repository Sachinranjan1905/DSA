/*
 * Maximum Subarray
 * ----------------
 * Finds the contiguous subarray with the maximum possible sum.
 *
 * Approach:
 * - Use Kadane's Algorithm to solve the problem in one pass.
 * - Maintain the maximum sum of a subarray ending at the current index.
 * - At each element, decide whether to start a new subarray or
 *   continue the existing subarray.
 * - Keep track of the maximum sum found so far.
 *
 * Kadane's Algorithm:
 * currentSum = max(nums[i], currentSum + nums[i])
 * maxSum     = max(maxSum, currentSum)
 *
 * The subarray must be contiguous, and negative elements can also
 * be part of the maximum-sum subarray.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

public class 0053_Maximum_Subarray {
    public int maxSubArray(int[] nums) {
        int currentSum=nums[0];
        int maxSum=nums[0];
        for(int i=1;i<nums.length;i++){
            currentSum=Math.max(nums[i],currentSum+nums[i]);
            maxSum=Math.max(maxSum,currentSum);
        }
        return maxSum;
    }
}
