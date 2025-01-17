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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head1=list1, head2=list2;
        ListNode head = new ListNode();
        ListNode temp = head;
        while(head1!=null && head2!=null) {
            if(head1.val>head2.val) {
                temp.next = head2;
                temp = temp.next;
                head2 = head2.next;
            } else {
                temp.next = head1;
                temp = temp.next;
                head1 = head1.next;
            }
        }
        while(head1!=null) {
            temp.next = head1;
            temp = temp.next;
            head1 = head1.next;
        }
        while(head2!=null) {
            temp.next = head2;
            temp = temp.next;
            head2 = head2.next;     
        } return head.next;
    }
}