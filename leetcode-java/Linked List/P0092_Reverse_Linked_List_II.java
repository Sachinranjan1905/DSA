/*
 * ============================================================================
 * LeetCode Problem : 92. Reverse Linked List II
 * Difficulty       : Medium
 * Topic            : Linked List
 * Language         : Java
 *
 * Problem Link:
 * https://leetcode.com/problems/reverse-linked-list-ii/
 *
 * ----------------------------------------------------------------------------
 * Approach:
 * - Handle edge cases such as an empty list, a single-node list,
 *   or when left == right.
 * - Traverse the linked list to locate the node before the
 *   reversal range and the node immediately after the range.
 * - Reverse only the nodes between positions left and right
 *   using a helper function.
 * - Reconnect the reversed sublist with the remaining
 *   portions of the linked list.
 *
 * Time Complexity : O(n)
 * Space Complexity: O(1)
 *
 * Concepts Used:
 * - Partial Linked List Reversal
 * - Pointer Manipulation
 * - Linked List Traversal
 * - In-place Reversal
 *
 * Author : Sachin Ranjan
 * GitHub : https://github.com/Sachinranjan1905
 * Brand  : TheCodeOfTruth
 * ============================================================================
 */

public class P0092_Reverse_Linked_List_II {
    
    public ListNode Reverse(ListNode head,int right,ListNode pree){
        if(right==0){
            return head;
        }
        ListNode pre=pree;
        ListNode curr=head;
        ListNode next=null;
        ListNode temp=head;
        while(right>0){
            next=curr.next;
            curr.next=pre;
            pre=curr;
            curr=next;
            right--;
        }
        return pre;
    }
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head==null || head.next==null){
            return head;
        }
        if(left==right){
            return head;
        }
        int tem=right;
        int tem1=left;
        ListNode temp=head;
        ListNode Right=head;
        
        while(right>0){
            Right=Right.next;
            right--;

        }
        while(left>2){
           temp=temp.next;
           left--;
        }
        if(left==1){
            head=Reverse(temp,tem-tem1+1,Right);
            return head;
        }
        temp.next=Reverse(temp.next,tem-tem1+1,Right);


    return head;
       
    }
}
