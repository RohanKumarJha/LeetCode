class Solution {
    public int maxSubArray(int[] nums) {
        int len=nums.length;
        int sum=0, maxSum=Integer.MIN_VALUE;
        for(int i=0; i<len; i++) {
            sum += nums[i];
            maxSum = Math.max(sum,maxSum);
            if(sum < 0) sum=0;
        } return maxSum;
    }
}