/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        // Find length of inkedlist
        ListNode temp = head;
        int len = 0;
        while(temp != null) {
            len++;
            temp = temp.next;
        }  

        // Divide the linkedlist
        temp = head;
        for(int i=0; i<len/2-1; i++) {
            temp = temp.next;
        }
        ListNode curr = temp.next;
        temp.next = null;

        // Reverse 2nd linkedlist
        ListNode prev=null, agla=null;
        while(curr!=null) {
            agla = curr.next;
            curr.next = prev;
            prev = curr;
            curr = agla;
        }
        while(prev != null && head!=null) {
            if(prev.val != head.val) return false;
            prev = prev.next;
            head = head.next;
        } return true;
    }
}