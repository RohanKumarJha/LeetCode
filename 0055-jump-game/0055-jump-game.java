class Solution {
    public boolean canJump(int[] nums) {
        int size = nums.length-1;
        int result = size;
        for(int i=size-1; i>=0; i--) {
            if(nums[i]+i >= result) {
                result = i;
            }
        }
        return (result == 0) ? true : false;
    }
}