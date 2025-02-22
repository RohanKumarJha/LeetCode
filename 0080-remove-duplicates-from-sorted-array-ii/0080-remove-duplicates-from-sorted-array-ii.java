class Solution {
    public int removeDuplicates(int[] nums) {
        int idx=1, count=1;
        for(int i=1; i<nums.length; i++) {
            if(nums[i]!=nums[i-1]) {
                nums[idx++] = nums[i];
                count = 1;
            } else if(nums[i]==nums[i-1] & count==1) {
                nums[idx++] = nums[i];
                count += 1;
            }
        } return idx;
    }
}