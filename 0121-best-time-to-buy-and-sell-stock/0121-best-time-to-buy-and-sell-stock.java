class Solution {
    public int maxProfit(int[] prices) {
        int buy=Integer.MAX_VALUE;
        int result = 0;
        for(int i=0; i<prices.length; i++) {
            buy = Math.min(buy, prices[i]);
            result = Math.max(result, prices[i]-buy);
        } return result;
    }
}