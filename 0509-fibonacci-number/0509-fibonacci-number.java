class Solution {
    // Using tabulation
    private void tabulation(int n,int[] dp) {
        for(int i=2; i<=n; i++) {
            dp[i] = dp[i-1]+dp[i-2];
        }
    }

    // Using memoization
    private int fibonacci(int n,int[] dp) {
        if(n <= 1) {
            dp[n] = n;
            return n;
        }
        if(dp[n] != 0) return dp[n];
        dp[n] = fibonacci(n-1,dp) + fibonacci(n-2,dp);
        return dp[n];
    }

    public int fib(int n) {
        int[] dp = new int[n+1];
        // fibonacci(n,dp);
        dp[0] = 0;
        if(n>=1) dp[1] = 1;
        tabulation(n,dp);
        return dp[n];
    }
}