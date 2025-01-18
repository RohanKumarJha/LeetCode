class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int len = nums.length;
        int count=0, maxCount=0;
        for(int i=0; i<len; i++) {
            if(nums[i] == 1) {
                count += 1;
            } else {
                maxCount = Math.max(count,maxCount);
                count = 0;
            }
        } return Math.max(count,maxCount);
    }
}