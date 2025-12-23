class Solution {
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
        fibonacci(n,dp);
        return dp[n];
    }
}