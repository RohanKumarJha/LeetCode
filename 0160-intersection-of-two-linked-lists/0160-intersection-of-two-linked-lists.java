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
        ListNode temp1 = headA;
        ListNode temp2 = headB;
        int len1 = 0;
        while(temp1 != null) {
            len1++;
            temp1 = temp1.next;
        }
        int len2 = 0;
        while(temp2 != null) {
            len2++;
            temp2 = temp2.next;
        }
        while(len1 != len2) {
            if(len1 > len2) {
                headA = headA.next;
                len1--;
            } else {
                headB = headB.next;
                len2--;
            }
        }
        temp1 = headA;
        temp2 = headB;
        while(temp1 != null) {
            if(temp1 == temp2) {
                return temp1;
            } temp1 = temp1.next;
            temp2 = temp2.next;
        } return null;
    }
}