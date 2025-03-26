class Solution {
    public boolean canJump(int[] nums) {
        int len = nums.length;
        if(len == 1) return true;
        int flag = len-1;
        int start = len-2;
        while(start > 0) {
            if(nums[start]+start >= flag) {
                flag = start;
            } start--;
        }
        if(start+nums[start] >= flag) return true;
        return false;
    }
}