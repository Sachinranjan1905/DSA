/*
 * ============================================================================
 * LeetCode Problem : 162. Find Peak Element
 * Difficulty       : Medium
 * Topic            : Binary Search
 * Language         : Java
 *
 * Problem Link:
 * https://leetcode.com/problems/find-peak-element/
 *
 * ----------------------------------------------------------------------------
 * Approach:
 * - Use Binary Search to find a peak element.
 * - Compare nums[mid] with nums[mid + 1].
 * - If nums[mid] > nums[mid + 1]:
 *      - We are on the decreasing side.
 *      - A peak exists at mid or to the left.
 *      - Move right = mid.
 * - Otherwise:
 *      - We are on the increasing side.
 *      - A peak exists to the right.
 *      - Move left = mid + 1.
 * - When left == right, both pointers point to a peak element.
 *
 * Time Complexity : O(log n)
 * Space Complexity: O(1)
 *
 * Concepts Used:
 * - Binary Search
 * - Peak Element
 * - Increasing and Decreasing Slope
 * - Search Space Reduction
 *
 * Author : Sachin Ranjan
 * GitHub : https://github.com/Sachinranjan1905
 * Brand  : TheCodeOfTruth
 * ============================================================================
 */

public class 0162_Find_Peak_Element {
    public int findPeakElement(int[] nums) {
        int left=0;
        int right=nums.length-1;
        while(left< right){
            int mid=left + (right - left)/2;
            if(nums[mid]>nums[mid+1]){
                right=mid;
            }
            else{
                left=mid+1;
            }
           
        }
        return left;
    }
}
