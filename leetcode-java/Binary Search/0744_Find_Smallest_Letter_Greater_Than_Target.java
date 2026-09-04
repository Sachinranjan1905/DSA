/*
 * ============================================================================
 * LeetCode Problem : 744. Find Smallest Letter Greater Than Target
 * Difficulty       : Easy
 * Topic            : Binary Search
 * Language         : Java
 *
 * Problem Link:
 * https://leetcode.com/problems/find-smallest-letter-greater-than-target/
 *
 * ----------------------------------------------------------------------------
 * Approach:
 * - The letters array is sorted in non-decreasing order.
 * - Use Binary Search to find the first letter that is strictly greater
 *   than the target.
 * - Maintain two pointers:
 *      left  = 0
 *      right = letters.length - 1
 * - If letters[mid] > target:
 *      - Store mid as a possible answer.
 *      - Continue searching in the left half for a smaller valid letter.
 * - Otherwise:
 *      - Search in the right half.
 * - If no letter greater than target is found, return letters[0] because
 *   the array follows a circular order.
 *
 * Time Complexity : O(log n)
 * Space Complexity: O(1)
 *
 * Concepts Used:
 * - Binary Search
 * - Sorted Array
 * - Character Comparison
 * - Lower Bound Technique
 * - Circular Array
 *
 * Author : Sachin Ranjan
 * GitHub : https://github.com/Sachinranjan1905
 * Brand  : TheCodeOfTruth
 * ============================================================================
 */

public class 0744_Find_Smallest_Letter_Greater_Than_Target {
    public char nextGreatestLetter(char[] letters, char target) {
        int left=0;
        int right=letters.length-1;
        char found=letters[0];
        while(left<=right){
            int mid=(left+right)/2;
            if(letters[mid]>target){
                found=letters[mid];
                right=mid-1;
            }
            else{
                left=mid+1;
            }
            

        }
        return found;
    }
}
