/*
 * ============================================================================
 * LeetCode Problem : 141. Linked List Cycle
 * Difficulty       : Easy
 * Topic            : Linked List
 * Language         : Java
 *
 * Problem Link:
 * https://leetcode.com/problems/linked-list-cycle/
 *
 * ----------------------------------------------------------------------------
 * Approach:
 * - Use Floyd's Cycle Detection Algorithm (Tortoise and Hare).
 * - Initialize two pointers (temp1 and temp2) at the head.
 * - Move temp1 one step at a time.
 * - Move temp2 two steps at a time.
 * - If both pointers meet, a cycle exists.
 * - If the fast pointer reaches null, the linked list has no cycle.
 *
 * Time Complexity : O(n)
 * Space Complexity: O(1)
 *
 * Concepts Used:
 * - Fast & Slow Pointer
 * - Two Pointer Technique
 *
 * Author : Sachin Ranjan
 * GitHub : https://github.com/Sachinranjan1905
 * Brand  : TheCodeOfTruth
 * ============================================================================
 */

public class P0141_Linked_List_Cycle {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode temp1=head;
        ListNode temp2=head;
        
        while(temp2!=null && temp2.next!=null){
            
            temp1=temp1.next;
            temp2=temp2.next.next;
            if(temp1==temp2){
                return true;
            }
        }
        return false;
    }
    
}
