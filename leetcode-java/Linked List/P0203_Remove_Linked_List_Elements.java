/*
 * ============================================================================
 * LeetCode Problem : 203. Remove Linked List Elements
 * Difficulty       : Easy
 * Topic            : Linked List
 * Language         : Java
 *
 * Problem Link:
 * https://leetcode.com/problems/remove-linked-list-elements/
 *
 * ----------------------------------------------------------------------------
 * Approach:
 * - Handle edge cases such as an empty list or a single-node list.
 * - Remove consecutive nodes from the beginning if their value matches
 *   the target value.
 * - Traverse the remaining linked list.
 * - If the next node contains the target value, skip it by updating the
 *   current node's next pointer.
 * - Continue until all matching nodes are removed.
 *
 * Time Complexity : O(n)
 * Space Complexity: O(1)
 *
 * Concepts Used:
 * - Linked List Traversal
 * - Pointer Manipulation
 * - Head Node Handling
 * - In-place Deletion
 *
 * Author : Sachin Ranjan
 * GitHub : https://github.com/Sachinranjan1905
 * Brand  : TheCodeOfTruth
 * ============================================================================
 */
public class P0203_Remove_Linked_List_Elements {
    public ListNode removeElements(ListNode head, int val) {
        if(head==null)
        return head;
       
        ListNode temp=head;
        if(temp.next==null){
            if(temp.val==val){
                return null;
            }
            return temp;
        }
        while(temp.val==val){
        if(temp.val==val){//from head
            temp=temp.next;
            if(temp==null){
                return null;
            }
           
        }
        }
         head=temp;
        //ListNode temp=head;
        while(temp!=null){
            if(temp.next==null){
                return head;
            }
            if(temp.next.val==val){
                if(temp.next.next==null){
                    temp.next=null;
                    return head;
                }
                temp.next=temp.next.next;
            }
            else{
            temp=temp.next;
            }

        
        }
        return head;
        
    }
    
}
