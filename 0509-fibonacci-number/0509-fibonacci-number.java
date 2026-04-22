class Solution {
    private int fibonacci(int idx, int n, int[] dp) {
        for(int i=idx; i<=n; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }

    public int fib(int n) {
        if(n < 2) return n;
        int[] dp = new int[31];
        for(int i=0; i<2; i++) {
            dp[i] = i;
        }
        return fibonacci(2, n, dp);
    }
}