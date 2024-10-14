class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int buyStock = prices[0];
        int profit = 0;
        int max=0;
        for(int i=1; i<n; i++) {
            if(prices[i]<buyStock) {
                buyStock = prices[i];
            }
            profit = Math.max(profit, prices[i]-buyStock);
        } return profit;
    }
}