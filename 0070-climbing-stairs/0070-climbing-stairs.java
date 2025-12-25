class Solution {
    private int climb(int n,int[] dp) {
        if(n < 2) {
            dp[n] = n+1;
            return n+1;
        }
        if(dp[n] != -1) return dp[n];
        dp[n] = climb(n-1,dp) + climb(n-2,dp);
        return dp[n];
    }

    public int climbStairs(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        return climb(n-1,dp);
    }
}