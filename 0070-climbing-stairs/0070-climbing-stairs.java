class Solution {
    private int recur(int n,int dp[]) {
        if(n < 3) {
            dp[n-1] = n;
            return n;
        }
        if(dp[n-1] != -1) return dp[n-1];
        dp[n-1] = recur(n-1,dp) + recur(n-2,dp);
        return dp[n-1];
    }

    public int climbStairs(int n) {
        int dp[] = new int[n+1];
        Arrays.fill(dp,-1);
        return recur(n,dp);
    }
}