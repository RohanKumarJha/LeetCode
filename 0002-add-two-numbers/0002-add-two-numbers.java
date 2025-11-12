class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyList = new ListNode();
        ListNode current = dummyList;
        int carry = 0;

        while(l1!=null || l2!=null || carry!=0) {
            ListNode node;
            if(l1 != null && l2 != null) {
                int digit = l1.val+l2.val+carry;
                node = new ListNode(digit%10);
                carry = digit/10;
                current.next = node;
                l1 = l1.next;
                l2 = l2.next;
            } else if(l2 != null) {
                int digit = l2.val+carry;
                node = new ListNode(digit%10);
                carry = digit/10;
                current.next = node;
                l2 = l2.next;
            } else if(l1 != null) {
                int digit = l1.val+carry;
                node = new ListNode(digit%10);
                carry = digit/10;
                current.next = node;
                l1 = l1.next;
            } else {
                int digit = carry;
                node = new ListNode(digit%10);
                carry = 0;
                current.next = node;
            }
            current = current.next;
        } return dummyList.next;
    }
}