class Solution {
    public int maxSubArray(int[] nums) {
        int SIZE = nums.length;
        int MAX_SUM = Integer.MIN_VALUE;
        int SUM = 0;
        for(int i=0; i<SIZE; i++) {
            SUM += nums[i];
            MAX_SUM = Math.max(MAX_SUM, SUM);
            if(SUM < 0) SUM=0;
        } return MAX_SUM;
    }
}