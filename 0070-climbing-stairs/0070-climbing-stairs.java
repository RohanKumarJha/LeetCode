class Solution {
    public int climbStairs(int n) {
        int dp[] = new int[n+1];
        dp[0] = 1;
        if(n > 1) dp[1] = 2;
        for(int state=3; state<=n; state++) {
            dp[state-1] = dp[state-2] + dp[state-3];
        } return dp[n-1];
    }
}