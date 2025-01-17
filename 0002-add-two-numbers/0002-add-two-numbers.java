/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode();
        ListNode temp = head;
        int carry=0;
        while(l1!=null && l2!=null) {
            ListNode curr = new ListNode(((l1.val)+(l2.val)+carry)%10);
            temp.next = curr;
            temp = temp.next;
            carry = ((l1.val)+(l2.val)+carry)/10;
            l1 = l1.next;
            l2 = l2.next;
        }
        while(l1!=null) {
            ListNode curr = new ListNode(((l1.val)+carry)%10);
            temp.next = curr;
            temp = temp.next;
            carry = ((l1.val)+carry)/10;
            l1 = l1.next;
        }
        while(l2!=null) {
            ListNode curr = new ListNode(((l2.val)+carry)%10);
            temp.next = curr;
            temp = temp.next;
            carry = ((l2.val)+carry)/10;
            l2 = l2.next;
        }
        if(carry > 0) {
            ListNode curr = new ListNode(carry%10);
            temp.next = curr;
        } return head.next;
    }
}