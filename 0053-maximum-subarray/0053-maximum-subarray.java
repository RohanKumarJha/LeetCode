class Solution {
    public int maxSubArray(int[] nums) {
        int len = nums.length;
        int sum = 0;
        int result = Integer.MIN_VALUE;
        for(int i=0; i<len; i++) {
            sum += nums[i];
            result = Math.max(sum,result);
            if(sum < 0) sum=0;
        } return result;
    }
}