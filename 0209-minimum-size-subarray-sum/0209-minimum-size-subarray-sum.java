class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int result = Integer.MAX_VALUE;
        int start=0,end=0, sum=0;
        while(end < nums.length) {
            if(sum < target) {
                sum += nums[end++];
            }
            while(sum >= target) {
                result = Math.min(result,end-start);
                sum -= nums[start++];
            }
        }
        return (sum >= target) ? Math.min(result,end-start) : (result == Integer.MAX_VALUE) ? 0 : result;
    }
}