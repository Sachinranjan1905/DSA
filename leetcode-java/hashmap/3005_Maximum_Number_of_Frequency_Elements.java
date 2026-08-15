/*
 * ============================================================================
 * LeetCode Problem : 3005. Maximum Number of Frequency Elements
 * Difficulty       : Easy
 * Topic            : HashMap
 * Language         : Java
 *
 * Problem Link:
 * https://leetcode.com/problems/maximum-number-of-frequency-elements/
 *
 * ----------------------------------------------------------------------------
 * Approach:
 * - Use a HashMap to store the frequency of each element.
 * - Traverse the array and count the occurrences of every element.
 * - Find the maximum frequency among all elements.
 * - Traverse the frequencies again.
 * - Add the frequencies of all elements whose frequency is equal to the
 *   maximum frequency.
 * - Return the total frequency.
 *
 * Time Complexity : O(n)
 * Space Complexity: O(n)
 *
 * Concepts Used:
 * - HashMap
 * - Frequency Counting
 * - getOrDefault()
 * - values()
 * - Array Traversal
 *
 * Author : Sachin Ranjan
 * GitHub : https://github.com/Sachinranjan1905
 * Brand  : TheCodeOfTruth
 * ============================================================================
 */
public class 3005_Maximum_Number_of_Frequency_Elements {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer,Integer>list=new HashMap<>();
        for(int x:nums){
           list.put(x,list.getOrDefault(x,0)+1);
        }
        int max=0;
       int maxFrequency=0;
        for(int x:list.values()){
            if(x>max){
                max=x;
               
            }
        }
        for(int x:list.values()){
            if(x==max){
                maxFrequency +=x;
            }
        }
        return maxFrequency;
    }
}
