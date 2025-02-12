class Solution {
    public int maxProfit(int[] prices) {
        int len = prices.length;
        int buy=prices[0], sell=prices[0];
        int maxProfit=0, profit=0;
        for(int i=1; i<len; i++) {
            buy = Math.min(buy,prices[i]);
            profit = prices[i]-buy;
            maxProfit = Math.max(prices[i]-buy,maxProfit);
        } return maxProfit;
    }
}