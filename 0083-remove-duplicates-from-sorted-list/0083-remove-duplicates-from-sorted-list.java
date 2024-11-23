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
            if(temp.val!=t1.val) {
                temp.next = t1;
                temp = t1;
            } t1 = t1.next;
            temp.next = null;
        } 
        return ln.next;
    }
}