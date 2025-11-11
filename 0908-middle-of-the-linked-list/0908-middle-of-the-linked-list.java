class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode slow=head, fast=head;
        do {
            slow = slow.next;
            if(slow == null) return fast;
            fast = fast.next.next;
        } while(fast!=null && fast.next!=null);
        return slow;
    }
}