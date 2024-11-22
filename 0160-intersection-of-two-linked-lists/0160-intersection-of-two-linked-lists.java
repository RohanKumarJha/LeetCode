/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public int size(ListNode head) {
        int len = 0;
        ListNode temp = head;
        while(temp != null) {
            len += 1;
            temp = temp.next;
        } return len;
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int size1 = size(headA);
        int size2 = size(headB);
        ListNode temp1 = headA;
        ListNode temp2 = headB;
        while(temp1 != temp2) {
            if(size1 == size2) {
                temp1 = temp1.next;
                temp2 = temp2.next;
                size1 -= 1;
                size2 -= 1;
            } else if(size1>size2) {
                temp1 = temp1.next;
                size1 -= 1;
            } else {
                temp2 = temp2.next;
                size2 -= 1;
            }
        } return temp1;
    }
}