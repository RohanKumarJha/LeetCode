class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode answer = head;
        ListNode permanent = head;
        if(head == null) return null;
        ListNode temp = head.next;
        while(temp != null) {
            if(temp.val != permanent.val) {
                permanent.next = temp;
                permanent = permanent.next;
            } temp = temp.next;
        }
        permanent.next = null;
        return head;
    }
}