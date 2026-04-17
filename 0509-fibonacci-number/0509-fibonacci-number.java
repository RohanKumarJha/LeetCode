class Solution {
    private int fibonacci(int[] dp, int n) {
        if(dp[n] != 0) return dp[n];
        if(n <= 3) {
            dp[n] = n-1;
            return dp[n];
        }
        dp[n] = fibonacci(dp, n-1) + fibonacci(dp, n-2);
        return dp[n];
    }

    public int fib(int n) {
        if(n == 0) return 0;
        if(n == 1) return 1;
        int[] dp = new int[n+1];
        return fibonacci(dp, n);
    }
}