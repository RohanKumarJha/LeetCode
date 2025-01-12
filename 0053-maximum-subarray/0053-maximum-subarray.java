class Solution {
    public int maxSubArray(int[] nums) {
        int len = nums.length;
        int sum=0, maxSum=Integer.MIN_VALUE;
        for(int j=0; j<len; j++) {
            sum += nums[j];
            maxSum = Math.max(sum,maxSum);
            if(sum < 0) sum=0;
        } return maxSum;
    }
}