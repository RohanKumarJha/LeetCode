class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int len = nums.length;
        int minLen = Integer.MAX_VALUE;
        int sum=0, left=0;
        for(int i=0; i<len; i++) {
            sum += nums[i];
            while(sum >= target) {
                minLen = Math.min(minLen,i-left+1);
                sum -= nums[left];
                left++;
            }
        } return (minLen == Integer.MAX_VALUE)?0:minLen;
    }
}