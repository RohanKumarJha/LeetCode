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
        ListNode curr = head;

        // Find length
        int len=0;
        while(curr != null) {
            len+=1;
            curr = curr.next;
        }

        curr = head;
        if(len == 1) return null;
        if(len-n == 0) return curr=curr.next;
        int i=0;
        while(i < len-n-1) {
            curr = curr.next;
            i+=1;
        }
        if(curr.next.next == null) {
            curr.next = null;
        } else {
            curr.next = curr.next.next;
        } return head;
    }
}