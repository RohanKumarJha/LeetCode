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
        ListNode result = new ListNode();
        ListNode ll = result;
        while(list1!=null || list2!=null) {
            if(list1==null) {
                ll.next = list2;
                list2 = list2.next;
            } else if(list2==null) {
                ll.next = list1;
                list1 = list1.next;
            } else if(list1.val > list2.val) {
                ll.next = list2;
                list2 = list2.next;
            } else {
                ll.next = list1;
                list1 = list1.next;
            }
            ll = ll.next;
        } return result.next;
    }
}