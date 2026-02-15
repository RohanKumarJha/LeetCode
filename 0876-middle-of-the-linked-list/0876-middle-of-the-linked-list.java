class Solution {
    public ListNode middleNode(ListNode head) {
        if(head==null) return null;
        if(head.next==null) return head;
        ListNode slow = head;
        ListNode fast = head;
        do {
            slow = slow.next;
            fast = fast.next.next;
        } while(fast!=null && fast.next!=null);
        return slow;
    }
}