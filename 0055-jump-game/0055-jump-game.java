class Solution {
    public boolean canJump(int[] nums) {
        int FLAG = nums.length-1;
        int START = FLAG-1;
        while(START >= 0) {
            if(START+nums[START] >= FLAG) {
                FLAG = START;
            } START--;
        } 
        if(FLAG == 0) return true;
        return false;
    }
}