/*
 * ============================================================================
 * LeetCode Problem : 21. Merge Two Sorted Lists
 * Difficulty       : Easy
 * Topic            : Linked List
 * Language         : Java
 *
 * Problem Link:
 * https://leetcode.com/problems/merge-two-sorted-lists/
 *
 * ----------------------------------------------------------------------------
 * Approach:
 * - Create a dummy node to simplify merging.
 * - Compare the current nodes of both linked lists.
 * - Append the smaller node to the merged list.
 * - If both nodes have the same value, append both nodes while
 *   maintaining the sorted order.
 * - Continue until one list becomes null.
 * - Attach the remaining nodes of the non-empty list.
 *
 * Time Complexity : O(m + n)
 * Space Complexity: O(1)
 *
 * Concepts Used:
 * - Dummy Node
 * - Two Pointer Technique
 * - Linked List Traversal
 * - Pointer Manipulation
 *
 * Author : Sachin Ranjan
 * GitHub : https://github.com/Sachinranjan1905
 * Brand  : TheCodeOfTruth
 * ============================================================================
 */

public class P0021_Merge_Two_Sorted_Lists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy=new ListNode();
         ListNode list3=dummy;
        
        while(list1!=null && list2 !=null){
            if(list1.val<list2.val){
              
                list3.next=list1;
                list3=list3.next;
                list1=list1.next;
            }
            else if(list1.val>list2.val){
               
                list3.next=list2;
                list3=list3.next;
                list2=list2.next;
            }
            else{
              
                list3.next=list1;
                list3=list3.next;
                list1=list1.next;
                list3.next=list2;
                list3=list3.next;
                list2=list2.next;
            }
        }
        if(list1==null){
            list3.next=list2;
        }
        else{
            list3.next=list1;
        }

       
           return dummy.next;       
        
    }
    
}
