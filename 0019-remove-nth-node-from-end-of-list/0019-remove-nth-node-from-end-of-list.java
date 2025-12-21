class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null) return head;
        ListNode slow=head, fast=head;
        int pointer=0;
        while(pointer < n) {
            fast = fast.next;
            pointer++;
        }
        if(fast == null) return head.next;
        while(fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return head;
    }
}