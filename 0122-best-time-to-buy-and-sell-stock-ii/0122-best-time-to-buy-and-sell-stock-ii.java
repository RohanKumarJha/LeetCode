class Solution {
    public int maxProfit(int[] prices) {
        int len = prices.length;
        int buy = prices[0];
        int result = 0;
        for(int i=1; i<len; i++) {
            if(prices[i] > prices[i-1]) {
                result += (prices[i]-prices[i-1]);
            }
        } return result;
    }
}