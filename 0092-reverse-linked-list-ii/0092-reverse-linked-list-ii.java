class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || left == right) return head;

        // Step 1: Create a dummy node to handle edge case when left = 1
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;

        // Step 2: Move prev to the node just before 'left'
        for (int i = 1; i < left; i++) {
            prev = prev.next;
        }

        // Step 3: Reverse sublist from left to right
        ListNode curr = prev.next;
        ListNode next = null;
        ListNode before = null;

        for (int i = 0; i <= right - left; i++) {
            next = curr.next;
            curr.next = before;
            before = curr;
            curr = next;
        }

        // Step 4: Connect the reversed part
        prev.next.next = curr; // Connect tail of reversed sublist to remaining list
        prev.next = before;    // Connect node before sublist to new head

        return dummy.next;
    }
}
