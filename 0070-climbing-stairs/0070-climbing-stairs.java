class Solution {
    private int climb(int[] dp, int n) {
        if(dp[n] != 0) return dp[n];
        if(n <= 2) {
            dp[n] = n;
            return n;
        }
        dp[n] = climb(dp, n-1) + climb(dp, n-2);
        return dp[n];
    }

    public int climbStairs(int n) {
        int[] dp = new int[n+1];
        return climb(dp, n);
    }
}