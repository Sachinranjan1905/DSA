/*
 * ============================================================================
 * LeetCode Problem : 876. Middle of the Linked List
 * Difficulty       : Easy
 * Topic            : Linked List
 * Language         : Java
 *
 * Problem Link:
 * https://leetcode.com/problems/middle-of-the-linked-list/
 *
 * ----------------------------------------------------------------------------
 * Approach:
 * - Use two pointers (temp1 and temp2).
 * - temp1 moves one step at a time.
 * - temp2 moves two steps at a time.
 * - If temp2 reaches the last node, return temp1.
 * - If temp2 reaches the second last node, return temp1.next
 *   to satisfy the requirement of returning the second middle node.
 *
 * Time Complexity : O(n)
 * Space Complexity: O(1)
 *
 * Author : Sachin Ranjan
 * GitHub : https://github.com/Sachinranjan1905
 * Brand  : TheCodeOfTruth
 * ============================================================================
 */

public class P0876_Middle_of_the_Linked_List {
     public ListNode middleNode(ListNode head) {
        ListNode temp1=head;
        ListNode temp2=head;
        if(temp1.next==null){
            return head;
        }
        while(temp2!=null){
            
           
            if(temp2.next==null){
                head=temp1;
               return head;
            }
             if(temp2.next.next==null){
                head=temp1.next;
                return head;
            }
            temp1=temp1.next;
            temp2=temp2.next.next;
            
        }
        return null;
        
    
}
    
}
