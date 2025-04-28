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
        ListNode result = new ListNode();
        ListNode temp = result;
        int carry = 0;
        int sum = 0;
        while(l1 != null && l2 != null) {
            sum = carry+l1.val+l2.val;
            ListNode answer = new ListNode(sum % 10);
            temp.next = answer;
            carry = sum/10;
            l1 = l1.next;
            l2 = l2.next;
            temp = temp.next;
        }
        while(l1 != null) {
            sum = carry+l1.val;
            ListNode answer = new ListNode(sum % 10);
            temp.next = answer;
            carry = sum/10;
            l1 = l1.next;
            temp = temp.next;
        }
        while(l2 != null) {
            sum = carry+l2.val;
            ListNode answer = new ListNode(sum % 10);
            temp.next = answer;
            carry = sum/10;
            l2 = l2.next;
            temp = temp.next;
        } 
        if(carry != 0) {
            sum = carry;
            ListNode answer = new ListNode(sum % 10);
            temp.next = answer;
            carry = sum/10;
            temp = temp.next;
        } return result.next;
    }
}