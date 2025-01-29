class Solution {
    public int maxSubArray(int[] nums) {
        int len = nums.length;
        int sum=0, maxSum=Integer.MIN_VALUE;
        for(int i=0; i<len; i++) {
            sum += nums[i];
            if(sum < 0) {
                maxSum = Math.max(sum, maxSum);
                sum=0;
            } else {
                maxSum = Math.max(sum, maxSum);
            }
        } return maxSum;
    }
}