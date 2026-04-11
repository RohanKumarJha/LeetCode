class Solution {
    private int climb(int n, int[] dp) {
        if(n <= 2) return n;
        if(dp[n] != 0) return dp[n];
        dp[n] = climb(n-1, dp) + climb(n-2,dp);
        return dp[n];
    }

    public int climbStairs(int n) {
        return climb(n,new int[n+1]);
    }
}