/*
 * ============================================================================
 * LeetCode Problem : 11. Container With Most Water
 * Difficulty       : Medium
 * Topic            : Array / Two Pointers
 * Language         : Java
 *
 * Problem Link:
 * https://leetcode.com/problems/container-with-most-water/
 *
 * ----------------------------------------------------------------------------
 * Approach:
 * - Use two pointers:
 *      left  -> beginning of the array
 *      right -> end of the array
 * - The width of the container is right - left.
 * - The height is the minimum of height[left] and height[right].
 * - Calculate the current area:
 *      area = width × minimum height
 * - Update the maximum area.
 * - Move the pointer having the smaller height because moving the taller
 *   pointer cannot increase the limiting height.
 * - Continue until both pointers meet.
 *
 * Time Complexity : O(n)
 * Space Complexity: O(1)
 *
 * Concepts Used:
 * - Two Pointers
 * - Greedy Approach
 * - Array Traversal
 * - Maximum Area
 *
 * Author : Sachin Ranjan
 * GitHub : https://github.com/Sachinranjan1905
 * Brand  : TheCodeOfTruth
 * ============================================================================
 */


public class 0011_Container_With_Most_Water {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int maxWater=0;
        while(left<right){


            int MIN=Math.min(height[left],height[right]);
            maxWater=Math.max(maxWater,MIN*(right - left));


            if(height[left]<height[right]){
                left++;
            }
            else{
                right--;
            }
            
        }
        return maxWater;
    }
}
