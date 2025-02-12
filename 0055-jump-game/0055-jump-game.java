class Solution {
    public boolean canJump(int[] nums) {
        int len = nums.length;
        int flag = len-1;
        int start = len-2;
        while(start >= 0) {
            if(start+nums[start] >= flag) {
                flag = start;
            }start--;
        } 
        if(flag == 0) return true;
        return false;
    }
}