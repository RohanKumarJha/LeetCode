class Solution {
    public int maxProfit(int[] prices) {
        int size = prices.length;
        int buy=Integer.MAX_VALUE, profit=0;
        for(int i=0; i<size; i++) {
            buy = Math.min(buy,prices[i]);
            profit = Math.max(profit,prices[i]-buy);
        }
        return profit;
    }
}