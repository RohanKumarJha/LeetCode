class Solution {
    private int  memo(int n,int[] dp) {
        if(n < 2) {
            dp[n] = n;
            return n;
        }
        if(n == 2) {
            dp[n] = 1;
            return 1;
        }
        if(dp[n] != -1) return dp[n];
        dp[n] = memo(n-1,dp) + memo(n-2,dp) + memo(n-3,dp);
        return dp[n];
    }

    public int tribonacci(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        return memo(n,dp);
    }
}