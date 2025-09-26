public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow=head, fast=head;
        if(slow==null || slow.next==null) return null;
        do {
            slow = slow.next;
            if(fast==null || fast.next==null) return null;
            fast = fast.next.next;
        } while(slow != fast);
        fast = head;
        while(slow != fast) {
            slow = slow.next;
            fast = fast.next;
        } return slow;
    }
}