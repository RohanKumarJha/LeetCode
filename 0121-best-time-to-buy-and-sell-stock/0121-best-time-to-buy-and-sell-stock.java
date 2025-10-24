class Solution {
    public int maxProfit(int[] prices) {
        int buy=Integer.MAX_VALUE, profit = 0;
        for(int i : prices) {
            if(i < buy) buy = i;
            profit = Math.max(i-buy,profit);
        } return profit;
    }
}