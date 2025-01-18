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
    public ListNode rotateRight(ListNode head, int k) {
        int len = 0;
        ListNode temp = head;
        while(temp != null) {
            len++;
            temp = temp.next;
        }
        if(len == 0) return null;
        for(int i=0; i<k%len; i++) {
            temp = head;
            ListNode agla=null;
            for(int j=0; j<len-2; j++) {
                temp = temp.next;
            }
            agla = temp.next;
            temp.next = null;
            agla.next = head;
            head = agla;
        } return head;
    }
}