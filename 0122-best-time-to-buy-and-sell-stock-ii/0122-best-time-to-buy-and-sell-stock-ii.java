class Solution {
    public int maxProfit(int[] prices) {
        int LEN = prices.length;
        int PROFIT = 0;
        for(int i=1; i<LEN; i++) {
            if(prices[i] > prices[i-1]) {
                PROFIT += (prices[i]-prices[i-1]);
            }
        } return PROFIT;
    }
}