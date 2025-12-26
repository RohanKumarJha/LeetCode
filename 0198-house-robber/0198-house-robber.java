class Solution {
    // private int robbed(int[] nums,int n,int[] dp) {
    //     if(n == 0) {
    //         dp[0] = nums[0];
    //         return nums[0];
    //     }
    //     if(n == 1) {
    //         dp[1] = Math.max(nums[n],nums[n-1]);
    //         return Math.max(nums[n],nums[n-1]);
    //     }
    //     if(dp[n] != -1) return dp[n];
    //     dp[n] = Math.max(robbed(nums,n-2,dp)+nums[n], robbed(nums,n-1,dp));
    //     return dp[n];
    // }

    private int robbed(int[] nums,int n,int[] dp) {
        for(int i=0; i<n; i++) {
            if(i == 0) dp[0]=nums[0];
            else if(i == 1) dp[1] = Math.max(nums[0],nums[1]);
            else dp[i] = Math.max(dp[i-2]+nums[i], dp[i-1]);
        } return dp[n-1];
    }

    public int rob(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n+1];
        // Arrays.fill(dp,-1);
        return robbed(nums,n,dp);
    }
}