class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxVal = 0;
        int count = 0;
        for(int i=0; i<nums.length; i++) {
            if(nums[i] == 1) {
                count++;
                maxVal = Math.max(count, maxVal);
            } else {
                count = 0;
            }
        } return maxVal;
    }
}