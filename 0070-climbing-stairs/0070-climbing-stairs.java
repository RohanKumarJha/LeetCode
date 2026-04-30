class Solution {

    private int withoutDp(int n) {
        int first = 1;
        int second = 2;
        int result = 0;
        for(int i=3; i<=n; i++) {
            result = first + second;
            first = second;
            second = result;
        }
        return result;
    }
    
    private int tabulation(int n,int[] dp) {
        dp[1] = 1;
        dp[2] = 2;
        for(int i=3; i<=n; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }

    private int memoization(int n,int[] dp) {
        if(dp[n] != 0) {
            return dp[n];
        }
        if(n <= 2) {
            dp[n] = n;
            return n;
        }
        dp[n] = memoization(n-1,dp) + memoization(n-2,dp);
        return dp[n];
    }

    public int climbStairs(int n) {
        if(n <= 2) return n;
        int[] dp = new int[n+1];
        // return memoization(n,dp);
        // return tabulation(n,dp);
        return withoutDp(n);
    }
}