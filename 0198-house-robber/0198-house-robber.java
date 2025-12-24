class Solution {
    private int recur(int[] nums,int n,int dp[]) {
        if(n < 0) {
            return 0;
        }
        if(dp[n] != -1) return dp[n];
        int robb = nums[n] + recur(nums,n-2,dp);
        int skip = recur(nums,n-1,dp);
        dp[n] = Math.max(robb, skip);
        return dp[n];
    }
    public int rob(int[] nums) {
        int n = nums.length;
        int dp[] = new int[n+1];
        Arrays.fill(dp,-1);
        return recur(nums,n-1,dp);
    }
}