class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode head = new ListNode();
        ListNode temp = head;

        while(l1!=null && l2!=null) {
            int sum = l1.val + l2.val + carry;
            ListNode curr = new ListNode(sum % 10);
            temp.next = curr;
            temp = temp.next;
            carry = sum/10;
            l1 = l1.next;
            l2 = l2.next;
        }
        while(l1 != null) {
            int sum = l1.val + carry;
            ListNode curr = new ListNode(sum % 10);
            temp.next = curr;
            temp = temp.next;
            carry = sum/10;
            l1 = l1.next;
        }
        while(l2 != null) {
            int sum = l2.val + carry;
            ListNode curr = new ListNode(sum % 10);
            temp.next = curr;
            temp = temp.next;
            carry = sum/10;
            l2 = l2.next;
        }
        if(carry != 0) {
            int sum = carry;
            ListNode curr = new ListNode(sum % 10);
            temp.next = curr;
            temp = temp.next;
            carry = 0;
        } return head.next;
    }
}