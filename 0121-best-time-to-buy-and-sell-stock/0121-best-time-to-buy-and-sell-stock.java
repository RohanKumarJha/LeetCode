class Solution {
    public int maxProfit(int[] prices) {
        int len = prices.length;
        int buy=prices[0], sell=0;
        for(int i=1; i<len; i++) {
            buy = Math.min(prices[i],buy);
            sell = Math.max(sell,prices[i]-buy);
        } return sell;
    }
}