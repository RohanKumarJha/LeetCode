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
        ListNode list1 = headA;
        ListNode list2 = headB;
        while(list1 != null) {
            list1 = list1.next;
            len1++;
        }
        while(list2 != null) {
            list2 = list2.next;
            len2++;
        }

        list1 = headA;
        list2 = headB;
        while(len1 != len2) {
            if(len2 < len1) {
                list1 = list1.next;
                len1--;
            } else {
                list2 = list2.next;
                len2--;
            }
        }
        while(len1 != 0) {
            if(list1 == list2) {
                return list1;
            } else {
                len1--;
                len2--;
                list1 = list1.next;
                list2 = list2.next;
            }
        } return null;
    }
}