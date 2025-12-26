class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n+1];
        int sum = 0;
        for(int i=0; i<n; i++) {
            sum += nums[i];
            dp[i] = sum;
            if(sum < 0) {
                sum = 0;
            }
        }
        int result = Integer.MIN_VALUE;
        for(int i=0; i<n; i++) {
            result = Math.max(result,dp[i]);
        } return result;
    }
}