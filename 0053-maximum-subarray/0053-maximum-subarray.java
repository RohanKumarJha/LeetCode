class Solution {
    public int maxSubArray(int[] nums) {
        int len = nums.length;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int i=0; i<len; i++) {
            sum += nums[i];
            max = Math.max(max,sum);
            if(sum < 0) {
                sum = 0;
            }
        } return max;
    }
}