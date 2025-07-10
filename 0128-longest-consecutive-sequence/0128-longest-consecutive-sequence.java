class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        Arrays.sort(nums);
        int maxCount = 0;
        int count = 0;
        for(int i=1; i<nums.length; i++) {
            if(nums[i] == nums[i-1]+1) {
                count++;
                maxCount = Math.max(maxCount, count);
            } else if(nums[i] == nums[i-1]) {

            } else {
                count = 0;
            }
        } maxCount = Math.max(maxCount, count);
        return maxCount+1;
    }
}