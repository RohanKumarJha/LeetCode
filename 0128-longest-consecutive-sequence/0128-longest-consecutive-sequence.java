class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        if(nums.length == 0) return 0;
        int result = 0;
        int curr = 1;
        for(int i=1; i<nums.length; i++) {
            if(nums[i] == nums[i-1]+1) {
                curr++;
            } else if(nums[i] == nums[i-1]) {

            } else {
                result = Math.max(result, curr);
                curr = 1;
            }
        } return Math.max(result, curr);
    }
}