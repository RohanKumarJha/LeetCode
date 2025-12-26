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

    private int tabu(int n,int[] dp) {
        for(int i=0; i<=n; i++) {
            if(i < 2) {
                dp[i] = i;
            } else {
                dp[i] = dp[i-1] + dp[i-2];
            }
        } return dp[n];
    }

    public int fib(int n) {
        int[] dp = new int[n+1];
        // return recur(n);
        // Arrays.fill(dp,-1);
        // return memo(n,dp);
        return tabu(n,dp);
    }
}