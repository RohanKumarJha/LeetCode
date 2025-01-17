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
        ListNode temp = head;
        int len = 0;
        while(temp != null) {
            len++;
            temp = temp.next;
        }
        if(len == 0) return false;
        if(len == 1) return true;

        temp = head;
        if(len % 2 != 0) {
            for(int i=0; i<len/2-1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
        }

        ListNode nextList = null;
        temp = head;
        for(int i=0; i<len/2-1; i++) {
            temp = temp.next;
        }
        nextList = temp.next;
        temp.next = null;

        ListNode prev=null, agla=null, curr=nextList;
        while(curr != null) {
            agla = curr.next;
            curr.next = prev;
            prev = curr;
            curr = agla;
        }

        temp = head;
        nextList = prev;

        while(temp != null) {
            if(temp.val == nextList.val) {
                temp = temp.next;
                nextList = nextList.next;
            } else return false;
        } return true;      
    }
}