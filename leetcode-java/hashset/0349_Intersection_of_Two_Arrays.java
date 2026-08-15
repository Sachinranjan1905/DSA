/*
 * ============================================================================
 * LeetCode Problem : 349. Intersection of Two Arrays
 * Difficulty       : Easy
 * Topic            : HashSet
 * Language         : Java
 *
 * Problem Link:
 * https://leetcode.com/problems/intersection-of-two-arrays/
 *
 * ----------------------------------------------------------------------------
 * Approach:
 * - Use HashSet to store unique elements of both arrays.
 * - Add all elements of the first array into a HashSet.
 * - Add all elements of the second array into another HashSet.
 * - Use retainAll() to keep only the common elements.
 * - Convert the resulting Set into an integer array.
 * - Return the resulting array.
 *
 * Time Complexity : O(n + m)
 * Space Complexity: O(n + m)
 *
 * Concepts Used:
 * - HashSet
 * - Set
 * - add()
 * - retainAll()
 * - Set to Array Conversion
 * - Array Traversal
 *
 * Author : Sachin Ranjan
 * GitHub : https://github.com/Sachinranjan1905
 * Brand  : TheCodeOfTruth
 * ============================================================================
 */
public class 0349_Intersection_of_Two_Arrays {
      public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer>list1=new HashSet<>();
        Set<Integer>list2=new HashSet<>();
        for(int x:nums1){
            list1.add(x);
        }
        for(int x:nums2){
            list2.add(x);
        }
        list1.retainAll(list2);

        int[] result=new int[list1.size()];
        int i=0;
        for(int x:list1){
            result[i++]=x;
        }
        return result;
    }
    
}
