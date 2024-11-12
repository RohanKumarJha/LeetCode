class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int maxProfit = 0;
        int profit = 0;
        int minVal = prices[0];
        for(int i=1; i<n; i++) {
            maxProfit = Math.max(maxProfit,prices[i]-minVal);
            if(minVal > prices[i]) {
                minVal = prices[i];
            }
        } return maxProfit;
    }
}