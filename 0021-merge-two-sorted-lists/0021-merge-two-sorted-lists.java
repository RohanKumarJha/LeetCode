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
    public ListNode mergeTwoLists(ListNode temp1, ListNode temp2) {
        ListNode ll = new ListNode();
        ListNode nl = ll;
        while(temp1!=null || temp2!=null) {
            if(temp1 == null){
                nl.next = temp2;
                temp2 = temp2.next;
            } else if(temp2 == null) {
                nl.next = temp1;
                temp1 = temp1.next;
            } else if(temp1.val > temp2.val) {
                nl.next = temp2;
                temp2 = temp2.next;
            } else {
                nl.next = temp1;
                temp1 = temp1.next;
            }
            nl = nl.next;
        } return ll.next;
    }
}