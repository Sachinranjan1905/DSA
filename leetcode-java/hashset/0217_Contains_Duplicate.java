/*
 * ============================================================================
 * LeetCode Problem : 217. Contains Duplicate
 * Difficulty       : Easy
 * Topic            : HashSet
 * Language         : Java
 *
 * Problem Link:
 * https://leetcode.com/problems/contains-duplicate/
 *
 * ----------------------------------------------------------------------------
 * Approach:
 * - Use a HashSet to store elements encountered while traversing the array.
 * - For each element, check whether it already exists in the Set.
 * - If the element is already present, a duplicate exists.
 * - Return true immediately when a duplicate is found.
 * - If the complete array is traversed without finding a duplicate, return
 *   false.
 *
 * Time Complexity : O(n)
 * Space Complexity: O(n)
 *
 * Concepts Used:
 * - HashSet
 * - Set
 * - contains()
 * - add()
 * - Duplicate Detection
 * - Array Traversal
 *
 * Author : Sachin Ranjan
 * GitHub : https://github.com/Sachinranjan1905
 * Brand  : TheCodeOfTruth
 * ============================================================================
 */
public class 0217_Contains_Duplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer>set=new HashSet<>();
        for(int x:nums){
            if(!set.contains(x)){
                set.add(x);
            }
            else{
                return true;
            }
        }
        return false;
        
    }
}
