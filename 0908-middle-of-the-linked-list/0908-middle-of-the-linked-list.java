class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode slow=head, fast=head;
        if(slow==null || slow.next==null) return slow; 
        do {
            slow = slow.next;
            fast = fast.next.next;
            if(fast == null) return slow;
        } while(fast!=null && fast.next!=null);
        return slow;
    }
}