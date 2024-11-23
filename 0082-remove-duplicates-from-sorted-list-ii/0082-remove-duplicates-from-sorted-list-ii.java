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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode ln = new ListNode(100);
        ListNode temp = ln;
        ListNode t1 = head;
        while(t1!=null) {
            if(t1.next==null || t1.val!=t1.next.val) {
                temp.next = t1;
                temp = temp.next;
                t1  = t1.next;
            } else {
                ListNode t2 = t1;
                while(t1.val == t2.val) {
                    t2 = t2.next;
                    if(t2 == null) break;
                } if(temp.next == t1) {
                    temp.next = null;
                }
                t1 = t2;
            } 
        } return ln.next;
    }
}