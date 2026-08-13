/*
 * ============================================================================
 * LeetCode Problem : 61. Rotate List
 * Difficulty       : Medium
 * Topic            : Linked List
 * Language         : Java
 *
 * Problem Link:
 * https://leetcode.com/problems/rotate-list/
 *
 * ----------------------------------------------------------------------------
 * Approach:
 * - Handle edge cases such as an empty list, a single-node list,
 *   or when k = 0.
 * - Calculate the length of the linked list.
 * - Reduce unnecessary rotations by computing k % length.
 * - Rotate the linked list one step at a time using a helper method:
 *   • Find the second last node.
 *   • Move the last node to the front.
 *   • Update the head pointer.
 * - Repeat the process k times and return the new head.
 *
 * Time Complexity : O(n × k), where k = k % n
 * Space Complexity: O(1)
 *
 * Concepts Used:
 * - Linked List Traversal
 * - Pointer Manipulation
 * - List Rotation
 * - Modular Arithmetic
 *
 * Author : Sachin Ranjan
 * GitHub : https://github.com/Sachinranjan1905
 * Brand  : TheCodeOfTruth
 * ============================================================================
 */

public class P0061_Rotate_List {
        public ListNode Rotate(ListNode head){
        ListNode temp=head;
        while(temp.next.next!= null){
            temp=temp.next;
        }
        ListNode newhead=temp.next;
        newhead.next=head;
        temp.next=null; 
        return newhead;
    }
    public ListNode rotateRight(ListNode head, int k) {
        if(k==0 || head==null || head.next==null){
            return head;
        }
        int len=0;
        ListNode temp=head;
        while(temp!=null){
            temp=temp.next;
            len++;
        }
        k=k%len;
        while(k>0){
            head=Rotate(head);
            k--;
        }
        return head;

    }
    
}
