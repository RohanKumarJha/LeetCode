class Solution {
    public int longestSubarray(int[] nums) {
        int start=0, end=0;
        int result = 0;
        int count = 0;
        boolean flag = false;
        while(end != nums.length) {
            if(nums[end] == 1) {
                count++;
                end++;
            } else if(nums[end] == 0 && !flag) {
                end++;
                flag = true;
            } else {
                start++;
                if(nums[start-1] == 0) {
                    end++;
                } else {
                    count--;
                }
            } result = Math.max(result,count);
        } return (!flag) ? result-1 : result;
    }
}