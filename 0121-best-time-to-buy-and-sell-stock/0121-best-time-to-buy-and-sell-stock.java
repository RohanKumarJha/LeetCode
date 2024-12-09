class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int buy = prices[0];
        int sell;
        int maxSell = 0;
        for(int i=0; i<n-1; i++) {
            if(prices[i+1] > buy) {
                sell = prices[i+1]-buy;
                maxSell = Math.max(sell, maxSell);
            } else {
                buy = prices[i+1];
            }
        } return maxSell;
    }
}