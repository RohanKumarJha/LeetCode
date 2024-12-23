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
        ListNode temp = head;
        int len = 0;
        while(temp!=null) {
            len+=1;
            temp = temp.next;
        }
        temp = head;
        int i=0;
        if(len-n == 0) return head.next;
        while(i<len-n-1) {
            temp = temp.next; 
            i+=1;
        }
        if(temp.next == null) {
            temp = temp.next;
        } else temp.next=temp.next.next;
        return head;
    }
}