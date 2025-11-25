class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int size = Integer.MAX_VALUE;
        int start=0, end=0;
        int sum = 0;
        
        while(end < nums.length) {
            if(sum >= target) {
                size = Math.min(size,end-start);
                sum -= nums[start];
                start++;
            } else {
                sum += nums[end];
                end++;
            }
        } 
        while(sum >= target) {
            size = Math.min(size,end-start);
            sum -= nums[start];
            start++;
        }
        return (size == Integer.MAX_VALUE) ? 0 : size;
    }
}