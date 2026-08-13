/*
 * ============================================================================
 * LeetCode Problem : 328. Odd Even Linked List
 * Difficulty       : Medium
 * Topic            : Linked List
 * Language         : Java
 *
 * Problem Link:
 * https://leetcode.com/problems/odd-even-linked-list/
 *
 * ----------------------------------------------------------------------------
 * Approach:
 * - Handle the edge case where the linked list is empty.
 * - Maintain two pointers:
 *   • Odd  -> Points to nodes at odd indices.
 *   • Even -> Points to nodes at even indices.
 * - Store the head of the even-indexed list.
 * - Rearrange the next pointers so that all odd-indexed nodes come
 *   first, followed by all even-indexed nodes.
 * - Finally, connect the last odd-indexed node to the head of the
 *   even-indexed list.
 *
 * Time Complexity : O(n)
 * Space Complexity: O(1)
 *
 * Concepts Used:
 * - Two Pointer Technique
 * - Linked List Traversal
 * - In-place Reordering
 * - Pointer Manipulation
 *
 * Author : Sachin Ranjan
 * GitHub : https://github.com/Sachinranjan1905
 * Brand  : TheCodeOfTruth
 * ============================================================================
 */

public class P0328_Odd_Even_Linked_List {
     public ListNode oddEvenList(ListNode head) {
         if (head == null || head.next == null) {
           return head;
           }
        ListNode Odd=head;
        ListNode Even=head.next;
        ListNode temp=Even;
    while(Even!= null&& Even.next!=null){
        Odd.next=Even.next;
        Odd=Odd.next;
        Even.next=Odd.next;
        Even=Even.next;

    }
    Odd.next=temp;
    return head;
    }
    
}
