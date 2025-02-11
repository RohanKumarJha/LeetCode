class Solution {
    public int removeDuplicates(int[] nums) {
        int idx=1, count=0;
        for(int i=1; i<nums.length; i++) {
            if(nums[i]==nums[idx-1]) {
                if(count < 1) {
                    nums[idx] = nums[i];
                    count++; idx++;
                }
            } else {
                nums[idx] = nums[i];
                count=0; idx++;
            }
        } return idx;
    }
}