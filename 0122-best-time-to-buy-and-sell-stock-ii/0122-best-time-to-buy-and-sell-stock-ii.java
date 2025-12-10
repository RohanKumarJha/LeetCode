class Solution {
    public int maxProfit(int[] prices) {
        int buy = Integer.MAX_VALUE, result = 0;
        for(int i : prices) {
            if(i < buy) {
                buy = i;
            } else {
                result += (i-buy);
                buy = i;
            }
        } 
        return result;
    }
}