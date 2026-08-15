/*
 * ============================================================================
 * LeetCode Problem : 169. Majority Element
 * Difficulty       : Easy
 * Topic            : HashMap
 * Language         : Java
 *
 * Problem Link:
 * https://leetcode.com/problems/majority-element/
 *
 * ----------------------------------------------------------------------------
 * Approach:
 * - Use a HashMap to store the frequency of each element.
 * - Traverse the array and count the occurrences of every element.
 * - Calculate the majority limit using n / 2.
 * - Traverse the HashMap using entrySet().
 * - If the frequency of an element is greater than n / 2, return that element.
 *
 * Time Complexity : O(n)
 * Space Complexity: O(n)
 *
 * Concepts Used:
 * - HashMap
 * - Frequency Counting
 * - getOrDefault()
 * - entrySet()
 * - Key-Value Pair
 * - Array Traversal
 *
 * Author : Sachin Ranjan
 * GitHub : https://github.com/Sachinranjan1905
 * Brand  : TheCodeOfTruth
 * ============================================================================
 */
public class 0169_Majority_Element {
    public int majorityElement(int[] nums) {
        int majorityLimit=nums.length/2;
        Map<Integer,Integer> list=new HashMap<>();
        for(int x:nums){
            list.put(x,list.getOrDefault(x,0)+1);
        }
        int majority=0;
        int major=0;
        for(int x:list.values()){
            if(x>majorityLimit)
             majority=x ;
        }
        for(int x:list.keySet()){
            if(list.get(x)==majority){
                major=x;
            }
        }
        return major;
    }
}
