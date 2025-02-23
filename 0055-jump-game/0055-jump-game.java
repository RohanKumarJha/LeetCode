class Solution {
    public boolean canJump(int[] nums) {
        int len = nums.length;
        int flag = len-1;
        for(int i=len-2; i>=0; i--) {
            if(i+nums[i] >= flag) {
                flag = i;
            }
        }
        return (flag==0)?true:false;
    }
}