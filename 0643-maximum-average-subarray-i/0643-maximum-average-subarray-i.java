class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum=0;
        for(int i=0; i<k; i++) {
            sum += nums[i];
        } 
        double result = sum/k;
        int start=0, end=k;
        while(end < nums.length) {
            sum += nums[end++];
            sum -= nums[start++];
            result = Math.max(sum/k,result);
        } return result;
    }
}