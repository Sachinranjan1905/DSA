/*
 * ============================================================================
 * LeetCode Problem : 1089. Duplicate Zeros
 * Difficulty       : Easy
 * Topic            : Array
 * Language         : Java
 *
 * Problem Link:
 * https://leetcode.com/problems/duplicate-zeros/
 *
 * ----------------------------------------------------------------------------
 * Approach:
 * - Traverse the array from left to right.
 * - Whenever a zero is found, shift all elements after it one position
 *   to the right.
 * - Insert another zero immediately after the original zero.
 * - Since the array size must remain unchanged, ignore the last element
 *   if the shift goes beyond the array boundary.
 *
 * Time Complexity : O(n²)
 * Space Complexity: O(1)
 *
 * Concepts Used:
 * - Array Traversal
 * - In-Place Modification
 * - Element Shifting
 * - Boundary Handling
 *
 * Author : Sachin Ranjan
 * GitHub : https://github.com/Sachinranjan1905
 * Brand  : TheCodeOfTruth
 * ============================================================================
 */

public class 1089_Duplicate_Zeros {
    public void rightSift(int[] arr , int position){
        for(int i=arr.length-1;i>position;i--){
            arr[i]=arr[i-1];
        }
    }
    public void duplicateZeros(int[] arr) {
        for(int i=0;i<arr.length;i++ ){
            if(arr[i]==0){
                rightSift(arr,i);
                arr[i]=0;
                i++;
            }
        }
    }
}
