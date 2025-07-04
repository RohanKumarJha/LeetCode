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
        ListNode temp = head;
        int i=0;
        while(i < n) {
            temp = temp.next;
            if(temp == null) return head.next;
            i++;
        }
        while(temp.next != null) {
            curr = curr.next;
            temp = temp.next;
        }
        curr.next = curr.next.next;
        return head;
    }
}