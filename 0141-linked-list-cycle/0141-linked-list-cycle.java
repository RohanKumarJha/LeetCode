public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode slow=head, fast=head;
        if(head==null || head.next==null) return false;
        do {
            slow = slow.next;
            if(fast==null || fast.next==null) return false;
            fast = fast.next.next;
        } while(slow != fast);
        return true;
    }
}