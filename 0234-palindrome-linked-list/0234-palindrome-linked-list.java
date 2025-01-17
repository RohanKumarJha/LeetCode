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
    public boolean isPalindrome(ListNode head) {
        ListNode temp = head;
        int len = 0;
        while(temp != null) {
            len++;
            temp = temp.next;
        }
        if(len == 0) return false;
        if(len == 1) return true;

        Stack<Integer> st = new Stack<>();
        // If len is even
        int mid = len/2;
        temp = head;
        if(len % 2 == 0) {
            for(int i=0; i<len; i++) {
                if(i < mid) {
                    st.push(temp.val);
                } else {
                    if(st.peek() == temp.val) st.pop();
                    else return false;
                }
                temp = temp.next;
            }
        }

        // If len is odd
        if(len % 2 != 0) {
            for(int i=0; i<len; i++) {
                if(i < mid) {
                    st.push(temp.val);
                } else if(i != mid){
                    if(st.peek() == temp.val) st.pop();
                    else return false;
                }
                temp = temp.next;
            }
        } return true;
    }
}