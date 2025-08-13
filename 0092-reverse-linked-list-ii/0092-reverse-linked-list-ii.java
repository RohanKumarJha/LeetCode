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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left==right) return head;
        int[] arr = new int[right-left+1];
        ListNode temp = head;
        for(int i=1; i<left; i++) {
            temp = temp.next;
        }
        for(int i=0; i<arr.length; i++) {
            arr[i] = temp.val;
            temp = temp.next;
        }

        temp = head;
        for(int i=1; i<left; i++) {
            temp = temp.next;
        }

        for(int i=arr.length-1; i>=0; i--) {
            temp.val = arr[i];
            temp = temp.next;
        } return head;
    }
}