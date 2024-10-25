class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int min = prices[0];
        int diff = 0;
        for(int i=0; i<n; i++) {
            min = Math.min(min,prices[i]);
            diff = Math.max(diff,prices[i]-min);
        } return diff;
    }
}