class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null) return null;
        if(head.next == null) return head;
        int size = 0;
        ListNode temp = head;
        while(temp != null) {
            size++;
            temp = temp.next;
        }
        k %= size;
        if(k == 0) return head;

        temp = head;
        ListNode temp2 = head;
        for(int i=0; i<k; i++) {
            temp2 = temp2.next;
        }

        while(temp2.next != null) {
            temp = temp.next;
            temp2 = temp2.next;
        }
        ListNode agla = temp.next;
        temp.next = null;
        temp2.next = head;

        return agla;

    }
}