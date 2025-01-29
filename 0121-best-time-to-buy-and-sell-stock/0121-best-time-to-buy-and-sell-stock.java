class Solution {
    public int maxProfit(int[] prices) {
        int len = prices.length;
        int maxProfit = 0;
        int buy = Integer.MAX_VALUE;
        for(int i=0; i<len; i++) {
            buy = Math.min(buy,prices[i]);
            maxProfit = Math.max(maxProfit, prices[i]-buy);
        } return maxProfit;
    }
}