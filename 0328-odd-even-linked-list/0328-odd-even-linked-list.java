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
    public ListNode oddEvenList(ListNode head) {
        if(head.next == null) return head;
        ListNode first = head;
        ListNode temp = head.next;
        ListNode second = temp;
        while(first.next!=null && first.next.next!=null) {
            first.next = first.next.next;
            second.next = second.next.next;
            first = first.next;
            second = second.next;
        }
        first.next = temp;
        return head;
    }
}