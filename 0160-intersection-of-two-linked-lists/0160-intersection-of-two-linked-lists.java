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
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp = headA;
        int len1 = 0;
        while(temp != null) {
            len1++;
            temp = temp.next;
        }
        temp = headB;
        int len2 = 0;
        while(temp != null) {
            len2++;
            temp = temp.next;
        }
        ListNode temp1 = headA;
        ListNode temp2 = headB;
        while(len1 != len2) {
            if(len1 > len2) {
                temp1 = temp1.next;
                len1--;
            } else {
                temp2 = temp2.next;
                len2--;
            }
        }
        while(temp1 != temp2) {
            temp1 = temp1.next;
            temp2 = temp2.next;
        } return temp1;
    }
}