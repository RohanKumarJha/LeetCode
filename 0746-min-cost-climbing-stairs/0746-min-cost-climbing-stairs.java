class Solution {
    private int minCost(int[] cost, int idx, int[] dp) {
        if(idx < 2) {
            dp[idx] = cost[idx];
            return cost[idx];
        }
        if(dp[idx] != -1) return dp[idx];
        dp[idx] = Math.min(cost[idx]+minCost(cost,idx-1,dp), cost[idx]+minCost(cost,idx-2,dp));
        return dp[idx];
    }

    public int minCostClimbingStairs(int[] cost) {
        int len = cost.length;
        int[] dp = new int[len+1];
        Arrays.fill(dp, -1);
        return Math.min(minCost(cost, len-1, dp),minCost(cost, len-2, dp));
    }
}