class Solution {
    public int findDuplicate(int[] nums) {
        int slow=0, fast=0;
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while(slow != fast);
        slow = 0;
        do {
            slow = nums[slow];
            fast = nums[fast];
        } while(slow != fast);
        return slow;
    }
}