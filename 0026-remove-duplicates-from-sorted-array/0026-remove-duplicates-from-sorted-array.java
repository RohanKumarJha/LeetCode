class Solution {
    public int removeDuplicates(int[] nums) {
        int start=1, end=1;
        while(end < nums.length) {
            if(nums[end] != nums[end-1]) {
                nums[start++] = nums[end];
            } end++;
        } return start;
    }
}