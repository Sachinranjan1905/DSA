/*
 * ============================================================================
 * LeetCode Problem : 19. Remove Nth Node From End of List
 * Difficulty       : Medium
 * Topic            : Linked List
 * Language         : Java
 *
 * Problem Link:
 * https://leetcode.com/problems/remove-nth-node-from-end-of-list/
 *
 * ----------------------------------------------------------------------------
 * Approach:
 * - Traverse the linked list to count the total number of nodes.
 * - If the node to be removed is the head node (n == count),
 *   return head.next.
 * - Otherwise, traverse to the (count - n)th node.
 * - Update the next pointer to skip the target node.
 *
 * Time Complexity : O(n)
 * Space Complexity: O(1)
 *
 * Concepts Used:
 * - Linked List Traversal
 * - Node Counting
 * - Pointer Manipulation
 *
 * Author : Sachin Ranjan
 * GitHub : https://github.com/Sachinranjan1905
 * Brand  : TheCodeOfTruth
 * ============================================================================
 */

public class P0019_Remove_Nth_Node_From_End_of_List {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null){
            return null;
        }
        ListNode temp=head;
        int count=0;
      
        
        while(temp!=null){
            temp=temp.next;
            count++;
        }
          
        if(n==count){
            head=head.next;
            return head;
        }
        ListNode temp1=head;
        for(int i=1;i<count-n;i++){
            temp1=temp1.next;
        }
        temp1.next=temp1.next.next;
        
        return head;
    }
  

}
