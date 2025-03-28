class Solution {
    public int removeDuplicates(int[] nums) {
        int len = nums.length;
        int index = 0;
        for(int i=0; i<len; i++) {
            if(i == 0) {
                nums[index++] = nums[i];
            } else if(nums[i]!=nums[index-1]) {
                nums[index++] = nums[i];
            }
        } return index;
    }
}