class Solution {
    private int climb(int n,int[] dp) {
        if(n <= 2) return dp[n-1];
        if(dp[n-1] != 0) return dp[n-1];
        dp[n-1] = climb(n-1,dp)+climb(n-2,dp);
        return dp[n-1];
    }

    public int climbStairs(int n) {
        int[] dp = new int[n+1];
        dp[0] = 1;
        if(n >= 2) dp[1] = 2;
        return climb(n,dp);
    }
}