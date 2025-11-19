class Solution {
    public ListNode middleNode(ListNode head) {
        if(head == null) return head;
        if(head.next == null) return head;
        ListNode slow = head;
        ListNode fast = head;
        do {
            slow = slow.next;
            fast = fast.next.next;
            if(fast==null || fast.next==null) return slow;
        } while(fast!=null);
        return slow;
    }
}