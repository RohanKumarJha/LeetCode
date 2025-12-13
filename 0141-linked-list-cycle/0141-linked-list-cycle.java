public class Solution {
    private boolean cycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        do {
            slow = slow.next;
            if(slow == null) return false;
            fast = fast.next.next;
        } while(slow == null);
        return true;
    }

    public boolean hasCycle(ListNode head) {
        if(head==null) return false;
        return cycle(head);
    }
}