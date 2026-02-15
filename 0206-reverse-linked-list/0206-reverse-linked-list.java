class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode agla = null;
        while(head != null) {
            agla = head.next;
            head.next = prev;
            prev = head;
            head = agla;
        }
        return prev;
    }
}