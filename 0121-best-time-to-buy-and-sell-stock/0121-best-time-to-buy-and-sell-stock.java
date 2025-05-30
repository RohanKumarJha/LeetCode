class Solution {
    public int maxProfit(int[] prices) {
        int maxDiff=0, minNum=Integer.MAX_VALUE;
        for(int i=0; i<prices.length; i++) {
            minNum = Math.min(prices[i],minNum);
            maxDiff = Math.max(prices[i]-minNum,maxDiff);
        } return maxDiff;
    }
}