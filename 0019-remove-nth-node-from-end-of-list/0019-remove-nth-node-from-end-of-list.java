class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int size = 0;
        ListNode temp = head;
        while(temp != null) {
            size++;
            temp = temp.next;
        }
        int actualSize = size-n;
        if(actualSize == 0) return head.next;
        temp = head;
        for(int i=1; i<actualSize; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return head;
    }
}