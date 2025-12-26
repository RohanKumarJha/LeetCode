class Solution {
    private int recur(int n) {
        if(n < 2) return n;
        return recur(n-1) + recur(n-2);
    }

    private int memo(int n,int[] dp) {
        if(n < 2) {
            dp[n] = n;
            return n;
        }
        if(dp[n] != -1) return dp[n];
        dp[n] = memo(n-1,dp) + memo(n-2,dp);
        return dp[n];
    }

    public int fib(int n) {
        // return recur(n);

        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        return memo(n,dp);
    }
}