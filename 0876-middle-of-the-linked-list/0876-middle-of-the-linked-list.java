class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode slow = head, fast = head;
        while(true) {
            if(fast == null || fast.next == null) return slow;
            slow = slow.next;
            fast = fast.next.next;
        }
    }
}