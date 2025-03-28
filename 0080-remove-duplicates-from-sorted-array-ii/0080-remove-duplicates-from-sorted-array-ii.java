class Solution {
    public int removeDuplicates(int[] nums) {
        int len = nums.length;
        int count = 1;
        int index = 1;
        for(int i=1; i<len; i++) {
            if(nums[i]==nums[i-1] & count<2) {
                nums[index++] = nums[i];
                count++;
            } else if(nums[i] != nums[i-1]) {
                nums[index++] = nums[i];
                count=1;
            }
        } return index;
    }
}