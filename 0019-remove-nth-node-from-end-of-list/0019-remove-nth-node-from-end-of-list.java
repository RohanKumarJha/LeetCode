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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int size = 0;
        ListNode temp = head;
        while(temp != null) {
            size++;
            temp = temp.next;
        }

        // Delete first element
        if(size-n == 0) {
            return head.next;
        }

        // Delete element
        int pointer = 0;
        temp = head;
        while(pointer < size-n-1) {
            temp = temp.next;
            pointer++;
        } 
        // Temp reaches til before target element
        temp.next = temp.next.next;
        return head;        
    }
}