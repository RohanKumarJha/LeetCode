class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int result = Integer.MAX_VALUE;
        int start=0, end=0;
        int sum=0;
        while(end < nums.length || sum>=target) {
            if(sum < target && end==nums.length) break;
            if(sum >= target) {
                result = Math.min(result,end-start);
                sum -= nums[start++];
            } else {
                sum += nums[end++];
            }
        }
        return (result == Integer.MAX_VALUE) ? 0 : result;
    }
}