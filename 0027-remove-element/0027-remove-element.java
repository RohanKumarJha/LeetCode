class Solution {
    public int removeElement(int[] nums, int val) {
        int start=0, end=0;
        while(end < nums.length) {
            if(nums[end] != val) {
                nums[start++] = nums[end];
            } end++;
        } return start;
    }
}