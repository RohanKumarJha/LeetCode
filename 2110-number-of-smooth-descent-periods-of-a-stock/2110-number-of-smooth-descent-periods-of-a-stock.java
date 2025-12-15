class Solution {
    public long getDescentPeriods(int[] prices) {
        long count = 0;
        long result = 0;
        for(int i=0; i<prices.length; i++) {
            if(count == 0) {
                result += 1;
                count = 1;
            } else if(prices[i]+1 == prices[i-1]) {
                result = result+count+1;
                count++;
            } else {
                result += 1;
                count = 1;
            }
        }
        return result;
    }
}