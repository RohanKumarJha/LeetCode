class Solution {
    private int climb(int idx, int n, int[] dp) {
        if (idx > n) return dp[n];

        dp[idx] = dp[idx - 1] + dp[idx - 2];

        return climb(idx + 1, n, dp);
    }

    public int climbStairs(int n) {
        if (n <= 2) return n;

        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;

        return climb(3, n, dp);
    }
}