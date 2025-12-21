class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null) return null;
        int size = 0;
        ListNode temp = head;
        while(temp != null) {
            temp = temp.next;
            size++;
        }
        int index = size-n;
        if(index == 0) return head.next;
        temp = head;
        int pointer = 0;
        while(pointer < index-1) {
            temp = temp.next;
            pointer++;
        }
        temp.next = temp.next.next;
        return head;
    }
}