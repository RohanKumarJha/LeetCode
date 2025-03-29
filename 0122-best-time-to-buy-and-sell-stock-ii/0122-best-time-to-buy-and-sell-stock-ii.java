class Solution {
    public int maxProfit(int[] prices) {
        int LEN = prices.length;
        int PROFIT = 0;
        for(int i=1; i<LEN; i++) {
            PROFIT += Math.max(0,(prices[i]-prices[i-1]));
        } return PROFIT;
    }
}