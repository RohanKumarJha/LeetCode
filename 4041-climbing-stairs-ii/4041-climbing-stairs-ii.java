class Solution {
    public int calCost(int initial,int finalVal, int value) {
        return (value + (finalVal-initial)*(finalVal-initial));
    }

    public int climbStairs(int n, int[] cost) {
        int[] dp = new int[n];
        dp[0] = calCost(0, 1, cost[0]);
        if (n > 1)
            dp[1] = Math.min(calCost(0, 2, cost[1]), dp[0] + calCost(1, 2, cost[1]));
        if (n > 2)
            dp[2] = Math.min(
                calCost(0, 3, cost[2]),
                Math.min(dp[0] + calCost(1, 3, cost[2]), dp[1] + calCost(2, 3, cost[2]))
            );

        for (int i = 3; i < n; i++) {
            dp[i] = Math.min(
                dp[i - 3] + calCost(i - 3, i, cost[i]),
                Math.min(
                    dp[i - 2] + calCost(i - 2, i, cost[i]),
                    dp[i - 1] + calCost(i - 1, i, cost[i])
                )
            );
        }

        return dp[n - 1];
    }
}