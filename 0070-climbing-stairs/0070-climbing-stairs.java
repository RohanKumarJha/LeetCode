class Solution {
    private int climbstair(int idx, int n, int[] dp) {
        for(int i=idx; i<=n; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }

    public int climbStairs(int n) {
        int[] dp = new int[46];
        dp[1] = 1;
        dp[2] = 2;
        return climbstair(3, n, dp);
    }
}