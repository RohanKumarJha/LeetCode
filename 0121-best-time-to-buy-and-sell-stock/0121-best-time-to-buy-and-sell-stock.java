class Solution {
    public int maxProfit(int[] prices) {
        int LEN = prices.length;
        int BUY=prices[0], PROFIT=0;
        for(int i=0; i<LEN; i++) {
            BUY = Math.min(BUY,prices[i]);
            PROFIT = Math.max(PROFIT,prices[i]-BUY);
        } return PROFIT;
    }
}