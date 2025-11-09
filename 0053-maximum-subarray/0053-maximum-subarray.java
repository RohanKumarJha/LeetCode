class Solution {
    public int maxSubArray(int[] nums) {
        int result = nums[0];
        int sum = 0;
        for(int i : nums) {
            sum += i;
            result = Math.max(result,sum);
            if(sum < 0) sum=0;
        } return result;
    }
}