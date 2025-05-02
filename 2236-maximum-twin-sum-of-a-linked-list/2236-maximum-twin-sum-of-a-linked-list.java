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
    public int pairSum(ListNode head) {
        List<Integer> list = new ArrayList<>();
        ListNode temp = head;
        while(temp != null) {
            list.add(temp.val);
            temp = temp.next;
        }
        int start=0, end=list.size()-1;
        int maxElm = Integer.MIN_VALUE;
        while(start < end) {
            maxElm = Math.max(maxElm,list.get(start)+list.get(end));
            start++; end--;
        } return maxElm;
    }
}