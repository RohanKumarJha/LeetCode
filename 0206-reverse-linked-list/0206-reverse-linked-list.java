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
    static ListNode recursive(ListNode head)
    {
         if(head==null || head.next==null){
            return head;
        }
         ListNode newhead=recursive(head.next);
            head.next.next=head;
            head.next=null;
            return newhead;
    }
    public ListNode reverseList(ListNode head) {
        ListNode ans=recursive(head);
        return ans;
    }
}