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
        ListNode slow = head;
        ListNode fast = head;
        if(slow == null) return false;   // List has 0 elements
        if(slow.next == null) return false;   // List has 1 element
        do {
            slow = slow.next;
            fast = fast.next.next;
            if(fast == null) return false;
            if(fast.next == null) return false;
        } while(slow != fast);
        return true;
    }
}