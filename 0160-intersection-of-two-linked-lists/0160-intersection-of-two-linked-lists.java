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
    public int len(ListNode temp) {
        int len=0;
        while(temp != null) {
            len+=1;
            temp = temp.next;
        } return len;
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp1=headA, temp2=headB;
        int len1=len(headA), len2=len(headB);
        while(temp1 != temp2) {
            if(len1 > len2) {
                temp1 = temp1.next;
                len1 -= 1;
            } else if(len1 < len2) {
                temp2 = temp2.next;
                len2 -= 1;
            } else {
                temp1 = temp1.next;
                temp2 = temp2.next;
                len1 -= 1;
                len2 -= 1;
            }
        } return temp1;
    }
}