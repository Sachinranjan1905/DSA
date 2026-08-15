/*
 * ============================================================================
 * LeetCode Problem : 1. Two Sum
 * Difficulty       : Easy
 * Topic            : Array
 * Language         : Java
 *
 * Problem Link:
 * https://leetcode.com/problems/two-sum/
 *
 * ----------------------------------------------------------------------------
 * Approach:
 * - Use a HashMap to store each number along with its index.
 * - Traverse the array from left to right.
 * - For each element, calculate its complement using:
 *      complement = target - current element
 * - Check whether the complement already exists in the HashMap.
 * - If the complement exists, return the indices of the two elements.
 * - Otherwise, store the current element and its index in the HashMap.
 *
 * Time Complexity : O(n) Average
 * Space Complexity: O(n)
 *
 * Concepts Used:
 * - HashMap
 * - Array Traversal
 * - Complement Technique
 * - Key-Value Pair
 * - Searching in HashMap
 *
 * Author : Sachin Ranjan
 * GitHub : https://github.com/Sachinranjan1905
 * Brand  : TheCodeOfTruth
 * ============================================================================
 */
public class 0001_Two_Sum {
     public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> list=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int complement=target-nums[i];
            if(list.containsKey(complement)){
                return new int[]{list.get(complement),i};
            }
            list.put(nums[i],i);
        }
        return nums;
    }
    
}
