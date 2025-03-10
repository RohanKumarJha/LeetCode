/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head == null) return null;
        if(head.next == null) return null;
        ListNode slow=head, fast=head;
        boolean flag = true;
        do {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) {
                fast=head;
                flag = false;
                break;
            }
        } while(fast!=null && fast.next!=null);
        if(!flag) {
            while(fast!=slow) {
                fast = fast.next;
                slow = slow.next;
            } return slow;
        } return null;
    }
}