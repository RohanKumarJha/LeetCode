class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        // Step 1: Dummy node simplifies pointer logic
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prevGroupEnd = dummy;

        while (true) {
            // Step 2: Find the kth node
            ListNode kth = getKthNode(prevGroupEnd, k);
            if (kth == null) break; // less than k nodes left → done

            ListNode groupStart = prevGroupEnd.next;
            ListNode nextGroupStart = kth.next;

            // Step 3: Reverse the group
            reverse(groupStart, kth);

            // Step 4: Reconnect pointers
            prevGroupEnd.next = kth;
            groupStart.next = nextGroupStart;

            // Move prevGroupEnd forward for next group
            prevGroupEnd = groupStart;
        }

        return dummy.next;
    }

    // Helper: get the kth node from the given node
    private ListNode getKthNode(ListNode curr, int k) {
        while (curr != null && k > 0) {
            curr = curr.next;
            k--;
        }
        return curr;
    }

    // Helper: reverse the linked list between two nodes
    private void reverse(ListNode start, ListNode end) {
        ListNode prev = null;
        ListNode curr = start;
        ListNode stop = end.next;

        while (curr != stop) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
    }
}
