class Solution {
    public int maxProfit(int[] prices) {
        int result = 0;
        int buy = Integer.MAX_VALUE;
        for(int i : prices) {
            buy = Math.min(buy,i);
            result = Math.max(result,i-buy);
        }
        return result;
    }
}