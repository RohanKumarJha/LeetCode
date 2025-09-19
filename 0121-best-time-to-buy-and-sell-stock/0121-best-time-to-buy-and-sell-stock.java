class Solution {
    public int maxProfit(int[] prices) {
        int SIZE = prices.length;
        int MAX_PROFIT = 0;
        int BUY = Integer.MAX_VALUE;
        for(int i=0; i<SIZE; i++) {
            BUY = Math.min(BUY, prices[i]);
            MAX_PROFIT = Math.max(MAX_PROFIT, prices[i]-BUY);
        } return MAX_PROFIT;
    }
}