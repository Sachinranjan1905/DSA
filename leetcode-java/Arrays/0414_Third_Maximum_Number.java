/*
 * ============================================================================
 * LeetCode Problem : 414. Third Maximum Number
 * Difficulty       : Easy
 * Topic            : Array / HashSet
 * Language         : Java
 *
 * Problem Link:
 * https://leetcode.com/problems/third-maximum-number/
 *
 * ----------------------------------------------------------------------------
 * Approach:
 * - Use a HashSet to remove duplicate elements from the array.
 * - If there are fewer than 3 distinct elements, return the maximum element.
 * - Find the largest distinct element from the HashSet.
 * - Find the largest element smaller than the first maximum.
 * - Find the largest element smaller than the second maximum.
 * - The third value obtained is the third maximum number.
 *
 * Time Complexity : O(n)
 * Space Complexity: O(n)
 *
 * Concepts Used:
 * - Array Traversal
 * - HashSet
 * - Removing Duplicates
 * - Finding Maximum Values
 * - Distinct Elements
 *
 * Author : Sachin Ranjan
 * GitHub : https://github.com/Sachinranjan1905
 * Brand  : TheCodeOfTruth
 * ============================================================================
 */


public class 0414_Third_Maximum_Number {
     public int thirdMax(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

       
        if (set.size() < 3) {
            int max = Integer.MIN_VALUE;

            for (int num : set) {
                max = Math.max(max, num);
            }

            return max;
        }


        int firstMax = Integer.MIN_VALUE;

        for (int num : set) {
            if (num > firstMax) {
                firstMax = num;
            }
        }


        int secondMax = Integer.MIN_VALUE;

        for (int num : set) {
            if (num < firstMax && num > secondMax) {
                secondMax = num;
            }
        }

        int thirdMax = Integer.MIN_VALUE;

        for (int num : set) {
            if (num < secondMax && num > thirdMax) {
                thirdMax = num;
            }
        }

        return thirdMax;
    }
}
