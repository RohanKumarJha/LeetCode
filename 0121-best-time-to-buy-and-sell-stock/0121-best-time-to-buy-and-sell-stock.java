class Solution {
    public int maxProfit(int[] prices) {
        int len = prices.length;
        int profit = 0;
        int buy = prices[0];
        for(int i=1; i<len; i++) {
            buy = Math.min(buy,prices[i]);
            profit = Math.max(profit,prices[i]-buy);
        } return profit;
    }
}