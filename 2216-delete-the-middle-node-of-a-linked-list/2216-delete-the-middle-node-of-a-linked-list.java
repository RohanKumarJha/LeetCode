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
    public int len(ListNode head) {
        ListNode temp = head;
        int size = 0;
        while(temp!=null) {
            size += 1;
            temp = temp.next;
        } return size;
    }
    public ListNode deleteMiddle(ListNode head) {
        int size = len(head);
        ListNode temp = head;
        if(size == 1) return head.next;
        for(int i=1; i<size/2; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return head;
    } 
}