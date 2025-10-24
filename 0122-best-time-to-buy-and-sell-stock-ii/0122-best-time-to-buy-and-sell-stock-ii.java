class Solution {
    public int maxProfit(int[] prices) {
        int buy=Integer.MAX_VALUE, profit=0;
        for(int i : prices) {
            if(i < buy) {
                buy = i;
            } else {
                profit += (i-buy);
                buy = i;
            }
        } return profit;
    }
}