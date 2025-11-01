class Solution {
    public ListNode modifiedList(int[] nums, ListNode head) {
        Set<Integer> set = new HashSet<>();
        for(int i : nums) {
            set.add(i);
        }

        while(head!=null && set.contains(head.val)) {
            head = head.next;
        } 

        ListNode temp = head;
        while(temp.next != null) {
            if(set.contains(temp.next.val)) {
                temp.next = temp.next.next;
            } else {
                temp = temp.next;
            }
        }
        
        return head;
    }
}