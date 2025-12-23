class Solution {
    private int climb(int n,int[] dp) {
        for(int i=2; i<n; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n-1];
    }

    public int climbStairs(int n) {
        int[] dp = new int[n+1];
        dp[0] = 1;
        if(n >= 2) dp[1] = 2;
        return climb(n,dp);
    }
}