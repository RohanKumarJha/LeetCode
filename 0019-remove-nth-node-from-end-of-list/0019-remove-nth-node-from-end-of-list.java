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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int len = 0;
        ListNode temp = head;
        while(temp != null) {
            len+=1;
            temp = temp.next;
        }
        if(n==1 & len==1) return null;
        if(len-n-1<0) return head.next;
        int i=0;
        temp = head;
        while(i < len-n-1) {
            temp = temp.next;
            i+=1;
        }
        temp.next = temp.next.next;
        return head;
    }
}