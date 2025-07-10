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
        int len1=0, len2=0;
        ListNode temp = headA;
        while(temp != null) {
            temp = temp.next;
            len1++;
        }
        temp = headB;
        while(temp != null) {
            temp = temp.next;
            len2++;
        }

        ListNode temp1 = headA;
        ListNode temp2 = headB;
        if(len1 == len2) {
            while(temp1 != temp2) {
                temp1 = temp1.next;
                temp2 = temp2.next;
            } return temp1;
        } else if(len1 < len2) {
            while(len1 != len2) {
                temp2 = temp2.next;
                len2--;
            }
            while(temp1 != temp2) {
                temp1 = temp1.next;
                temp2 = temp2.next;
            } return temp1;
        } else {
            while(len1 != len2) {
                temp1 = temp1.next;
                len1--;
            }
            while(temp1 != temp2) {
                temp1 = temp1.next;
                temp2 = temp2.next;
            } return temp1;
        } 
    }
}