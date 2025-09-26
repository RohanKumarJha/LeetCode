class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev=null, agla=null;
        ListNode curr = head;
        while(curr != null) {
            agla = curr.next;
            curr.next = prev;
            prev = curr;
            curr = agla;
        } return prev;
    }
}