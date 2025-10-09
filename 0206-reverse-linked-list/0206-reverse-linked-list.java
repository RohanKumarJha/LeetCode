class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null, curr=head, agla=null;
        while(curr != null) {
            agla = curr.next;
            curr.next = prev;
            prev = curr;
            curr = agla;
        } return prev;
    }
}