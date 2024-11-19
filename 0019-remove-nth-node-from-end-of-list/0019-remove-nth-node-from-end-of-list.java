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
        // Find size
        ListNode temp = head;
        int size=0;
        while(temp != null){
            size += 1;
            temp = temp.next;
        }

        // For the diff
        int diff = size-n;
        if(diff == 0) return head.next;
        temp = head;
        for(int i=1; i<diff; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return head;
    }
}