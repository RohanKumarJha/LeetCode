class Solution {
    public int longestSubarray(int[] nums) {
        int result = 0;
        int count = 0;
        for(int i=2; i<nums.length; i++) {
            if(nums[i-2]+nums[i-1] == nums[i]) {
                count++;
            } else {
                result = Math.max(result,count);
                count = 0;
            }
        } result = Math.max(result,count);
        return result+2;
    }
}