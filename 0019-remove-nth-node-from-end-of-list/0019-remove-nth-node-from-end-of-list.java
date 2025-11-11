class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next == null && n==1) return null;
        ListNode temp = head;
        for(int i=0; i<n; i++) {
            temp = temp.next;
        }
        if(temp == null) return head.next;
        ListNode curr = head;
        while(temp.next != null) {
            curr = curr.next;
            temp = temp.next;
        } curr.next = curr.next.next;
        return head;
    }
}