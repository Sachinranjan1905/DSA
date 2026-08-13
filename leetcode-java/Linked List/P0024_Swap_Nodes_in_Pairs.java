/*
 * ============================================================================
 * LeetCode Problem : 24. Swap Nodes in Pairs
 * Difficulty       : Medium
 * Topic            : Linked List
 * Language         : Java
 *
 * Problem Link:
 * https://leetcode.com/problems/swap-nodes-in-pairs/
 *
 * ----------------------------------------------------------------------------
 * Approach:
 * - Handle edge cases where the linked list is empty or contains
 *   only one node.
 * - Set the second node as the new head of the modified list.
 * - Traverse the linked list two nodes at a time.
 * - Swap each adjacent pair by updating their next pointers.
 * - Connect the current swapped pair with the next pair.
 * - Continue until all possible pairs are swapped.
 *
 * Time Complexity : O(n)
 * Space Complexity: O(1)
 *
 * Concepts Used:
 * - Linked List Traversal
 * - Pointer Manipulation
 * - In-place Node Swapping
 * - Iterative Approach
 *
 * Author : Sachin Ranjan
 * GitHub : https://github.com/Sachinranjan1905
 * Brand  : TheCodeOfTruth
 * ============================================================================
 */

public class P0024_Swap_Nodes_in_Pairs {
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode temp1=head;
        ListNode temp2=head.next;
        ListNode NewHead=temp2;
        
        while(temp1!=null && temp2!=null){
            
            ListNode temp3=temp2.next;
            
            
            temp2.next=temp1;
           if(temp3==null){
            temp1.next=null;
            return NewHead;
           }
            if(temp3.next!=null){
            temp1.next=temp3.next;
            }
            
            else{
                temp1.next=temp3;
                return NewHead;
            }
            temp1=temp3;
            temp2=temp3.next;
          
        }
        return NewHead;
    }
}
