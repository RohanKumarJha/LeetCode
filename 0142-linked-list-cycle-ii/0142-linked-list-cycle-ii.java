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
        ListNode start=head;
        ListNode end=head;
        do {
            start = start.next;
            end = end.next.next;
            if(end == null) return null;
            if(end.next == null) return null;
        } while(start != end);
        start = head;
        while(start != end) {
            start = start.next;
            end = end.next;
        } return start;
    }
}