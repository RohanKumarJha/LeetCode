class Solution {
    private int climbstair(int n, int[] dp) {
        if(n <= 2) {
            dp[n] = n;
            return n;
        }
        if(dp[n] != 0) return dp[n];
        dp[n] = climbstair(n-1, dp) + climbstair(n-2, dp);
        return dp[n];
    }

    public int climbStairs(int n) {
        int[] dp = new int[46];
        return climbstair(n, dp);
    }
}