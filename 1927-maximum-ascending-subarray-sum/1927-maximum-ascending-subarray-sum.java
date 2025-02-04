class Solution {
    public int maxAscendingSum(int[] nums) {
        int len = nums.length;
        int sum=0, maxSum=Integer.MIN_VALUE;
        if(len > 0) {
            sum=nums[0];
            maxSum = Math.max(sum,maxSum);
        }
        for(int i=1; i<len; i++) {
            if(nums[i-1] < nums[i]) {
                sum += nums[i];
            } else {
                sum = nums[i];
            } maxSum = Math.max(sum, maxSum);
        } return maxSum;
    }
}