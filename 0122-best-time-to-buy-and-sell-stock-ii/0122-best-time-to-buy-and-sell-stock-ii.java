class Solution {
    public int maxProfit(int[] prices) {
        int len = prices.length;

        if (len == 0) return 0; // No profit if there are no prices

        // Initialize DP arrays
        int[][] dp = new int[len][2];

        // Base cases
        dp[0][0] = 0;           // Profit when no stock is held on the first day
        dp[0][1] = -prices[0];  // Profit when a stock is held on the first day

        // Fill the DP table
        for (int i = 1; i < len; i++) {
            dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1] + prices[i]); // Max profit without holding a stock
            dp[i][1] = Math.max(dp[i - 1][1], dp[i - 1][0] - prices[i]); // Max profit while holding a stock
        }

        // The maximum profit will be the last day when no stock is held
        return dp[len - 1][0];
    }
}
