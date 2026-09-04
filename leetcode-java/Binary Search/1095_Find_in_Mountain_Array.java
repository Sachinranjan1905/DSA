/*
 * ============================================================================
 * LeetCode Problem : 1095. Find in Mountain Array
 * Difficulty       : Hard
 * Topic            : Binary Search
 * Language         : Java
 *
 * Problem Link:
 * https://leetcode.com/problems/find-in-mountain-array/
 *
 * ----------------------------------------------------------------------------
 * Approach:
 * - The Mountain Array first increases and then decreases.
 * - First, use Binary Search to find the peak index.
 * - Then perform Binary Search on the increasing part.
 * - If the target is not found, perform Binary Search on the decreasing part.
 * - Return the smallest index where the target is found.
 * - The MountainArray interface is used to access elements.
 *
 * Time Complexity : O(log n)
 * Space Complexity: O(1)
 *
 * Concepts Used:
 * - Binary Search
 * - Mountain Array
 * - Peak Element
 * - Increasing and Decreasing Array
 * - Search Space Reduction
 *
 * Author : Sachin Ranjan
 * GitHub : https://github.com/Sachinranjan1905
 * Brand  : TheCodeOfTruth
 * ============================================================================
 */

/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */

public class 1095_Find_in_Mountain_Array {
     public int findPeak(MountainArray mountainArr){
        
        int left = 0;
        int right = mountainArr.length() - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (mountainArr.get(mid) > mountainArr.get(mid + 1)) {
                right = mid;
            } 
            else {
                left = mid + 1;
            }
        }
        return left;
    }
    public int findInMountainArray(int target, MountainArray mountainArr) {

        

        int peak = findPeak(mountainArr);

        // Step 2: Search in increasing part
        int firstHalf = 0;
        int last = peak;

        while (firstHalf <= last) {
            int mid = firstHalf + (last - firstHalf) / 2;

            if (mountainArr.get(mid) == target) {
                return mid;
            } 
            else if (mountainArr.get(mid) > target) {
                last = mid - 1;
            } 
            else {
                firstHalf = mid + 1;
            }
        }

        // Step 3: Search in decreasing part
        int secondHalf = peak + 1;
        int r = mountainArr.length() - 1;

        while (secondHalf <= r) {
            int mid = secondHalf + (r - secondHalf) / 2;

            if (mountainArr.get(mid) == target) {
                return mid;
            } 
            else if (mountainArr.get(mid) > target) {
                secondHalf = mid + 1;
            } 
            else {
                r = mid - 1;
            }
        }

        return -1;
    }
}
