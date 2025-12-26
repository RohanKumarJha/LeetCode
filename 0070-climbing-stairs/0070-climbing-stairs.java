class Solution {

    private int tabu(int n,int[] dp) {
        for(int i=0; i<n; i++) {
            if(i < 2) {
                dp[i] = i+1;
            } else {
                dp[i] = dp[i-1] + dp[i-2];
            }
        } return dp[n-1];
    }

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
        // return memo(n,dp);
        return tabu(n,dp);
    }
}