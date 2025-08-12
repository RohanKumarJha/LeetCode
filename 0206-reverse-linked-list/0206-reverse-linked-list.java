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
    public ListNode reverseList(ListNode head) {
        ListNode temp = head;

        ListNode newHead = null;
        while(temp != null) {
            ListNode curr = new ListNode(temp.val);
            curr.next = newHead;
            newHead = curr;
            temp = temp.next;
        } return newHead;
    }
}