/*
 * ============================================================================
 * LeetCode Problem : 234. Palindrome Linked List
 * Difficulty       : Easy
 * Topic            : Linked List
 * Language         : Java
 *
 * Problem Link:
 * https://leetcode.com/problems/palindrome-linked-list/
 *
 * ----------------------------------------------------------------------------
 * Approach:
 * - Count the total number of nodes in the linked list.
 * - Traverse to the middle of the list.
 * - Reverse the second half of the linked list.
 * - Compare the first half with the reversed second half.
 * - If all corresponding nodes match, the linked list is a palindrome.
 *   Otherwise, it is not.
 *
 * Time Complexity : O(n)
 * Space Complexity: O(1)
 *
 * Concepts Used:
 * - Linked List Traversal
 * - In-place Reversal
 * - Two Pointer Comparison
 * - Pointer Manipulation
 *
 * Author : Sachin Ranjan
 * GitHub : https://github.com/Sachinranjan1905
 * Brand  : TheCodeOfTruth
 * ============================================================================
 */

public class P0234_Palindrome_Linked_List {
    public ListNode Reverse(ListNode head){
        ListNode pre=null;
        ListNode curr=head;
        ListNode next=null;
        while(curr!=null){
            next=curr.next;
            curr.next=pre;
            pre=curr;
            curr=next;
        }
        return pre;
    }
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null){
            return true;
        }
        ListNode temp=head;
        int count=0;
        while(temp!=null){
            temp=temp.next;
            count++;
        }
        temp=head;
        for (int i = 1; i < count / 2; i++) {
            temp = temp.next;
        }
        ListNode SecondHalf;
        if(count%2==0){
        SecondHalf=Reverse(temp.next);
        }
        else{
        SecondHalf=Reverse(temp.next.next);
        }
        ListNode temp2=SecondHalf;
        ListNode temp1=head;
        while(temp2!=null){
            if(temp1.val!=temp2.val){
                return false;
            }
            temp1=temp1.next;
            temp2=temp2.next;
        }
        return true;
        
    }
    
}
