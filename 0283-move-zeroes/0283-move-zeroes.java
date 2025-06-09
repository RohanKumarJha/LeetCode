class Solution {
    public void moveZeroes(int[] nums) {
        int start=0, end=0;
        while(end != nums.length) {
            if(nums[end] == 0) {
                end++;
            } else {
                nums[start++] = nums[end++];
            }
        }
        while(start != nums.length) {
            nums[start++] = 0;
        }
    }
}