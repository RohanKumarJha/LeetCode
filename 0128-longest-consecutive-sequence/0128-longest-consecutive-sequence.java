class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        if(len == 0) return 0;
        int count=0, maxCount=0;
        for(int i=1; i<len; i++) {
            if(nums[i]==nums[i-1]+1) {
                count++;
            } else if(nums[i]==nums[i-1]) {
                count = count;
            } else {
                maxCount = Math.max(count+1, maxCount);
                count = 0;
            }
        }
        maxCount = Math.max(count+1, maxCount);
        return maxCount;
    }
}