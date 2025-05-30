class Solution {
    public int maxProfit(int[] prices) {
        int maxDiff = 0;
        int buy = Integer.MAX_VALUE;
        for(int i=0; i<prices.length; i++) {
            buy = Math.min(buy, prices[i]);
            maxDiff = Math.max(maxDiff, prices[i]-buy);
        } return maxDiff;
    }
}