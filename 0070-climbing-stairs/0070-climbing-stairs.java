class Solution {
    private int memo(int n,int[] dp) {
        if(n < 3) {
            dp[n-1] = n;
            return n;
        }
        if(dp[n-1] != -1) return dp[n-1];
        dp[n-1] = memo(n-1,dp) + memo(n-2,dp);
        return dp[n-1];
    }

    public int climbStairs(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        return memo(n,dp);
    }
}