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
    public int length(ListNode head) {
        ListNode temp = head;
        int size = 0;
        while(temp != null) {
            size += 1;
            temp = temp.next;
        } return size;
    }
    public ListNode middleNode(ListNode head) {
        int size = length(head);
        ListNode temp = head;
        for(int i=1; i<=size/2; i++) {
            temp = temp.next;
        } return temp;
    }
}