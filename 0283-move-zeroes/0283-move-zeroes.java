class Solution {
    public void swap(int[] nums, int start, int end) {
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }
    public void moveZeroes(int[] nums) {
        int start=0, end=0;
        while(end < nums.length) {
            if(nums[end] != 0) {
                swap(nums,start,end);
                start++;
            } end++;
        }

        while(start < nums.length) {
            nums[start++] = 0;
        }
    }
}