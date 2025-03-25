class Solution {
    public int maxProfit(int[] prices) {
        int buy=Integer.MAX_VALUE, profit=0; 
        for(int i : prices) {
            buy = Math.min(i,buy);
            profit = Math.max(profit,i-buy);
        } return profit;
    }
}