/*
 * ============================================================================
 * LeetCode Problem : 86. Partition List
 * Difficulty       : Medium
 * Topic            : Linked List
 * Language         : Java
 *
 * Problem Link:
 * https://leetcode.com/problems/partition-list/
 *
 * ----------------------------------------------------------------------------
 * Approach:
 * - Create two dummy linked lists:
 *   • One for nodes with values less than x.
 *   • Another for nodes with values greater than or equal to x.
 * - Traverse the original linked list once.
 * - Append each node to its respective list based on its value.
 * - Terminate the greater list to avoid forming a cycle.
 * - Connect the end of the smaller list to the beginning of the
 *   greater-or-equal list.
 * - Return the head of the newly partitioned linked list.
 *
 * Time Complexity : O(n)
 * Space Complexity: O(1)
 *
 * Concepts Used:
 * - Dummy Nodes
 * - Linked List Traversal
 * - Pointer Manipulation
 * - List Partitioning
 *
 * Author : Sachin Ranjan
 * GitHub : https://github.com/Sachinranjan1905
 * Brand  : TheCodeOfTruth
 * ============================================================================
 */

public class P0086_Partition_List {
    public ListNode partition(ListNode head, int x) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode lessDummy = new ListNode(0);
        ListNode less=lessDummy;
        ListNode greaterDummy = new ListNode(0);
        ListNode gre=greaterDummy;
        ListNode temp=head;
        while(temp!=null){
            if(temp.val>=x){
                gre.next=temp;
                gre=gre.next;
                temp=temp.next;
            }
            else{
                less.next=temp;
                less=less.next;
                temp=temp.next;
            }
        }
        gre.next=null;
        less.next=greaterDummy.next;
        return lessDummy.next;
     
    }
    
}
