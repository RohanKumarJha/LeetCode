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
    public boolean hasCycle(ListNode head) {
        ListNode start=head;
        ListNode end=head;
        if(head == null) return false;
        if(head.next == null) return false;
        do {
            start = start.next;
            end = end.next.next;
            if(end == null) return false;
            if(end.next == null) return false;
        } while(start != end);
        return true;
    }
}