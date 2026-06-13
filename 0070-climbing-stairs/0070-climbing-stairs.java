class Solution {
    private int climbingStairs(int n,int[] dp) {
        if(dp[n] != 0) {
            return dp[n];
        }
        if(n <= 2) {
            dp[n] = n;
            return n;
        }
        dp[n] = climbingStairs(n-1,dp) + climbingStairs(n-2,dp);
        return dp[n];
    }

    public int climbStairs(int n) {
        int[] dp = new int[n+1];
        return climbingStairs(n,dp);
    }
}