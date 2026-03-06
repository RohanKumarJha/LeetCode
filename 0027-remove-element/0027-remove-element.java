class Solution {
    private void swap(int[] nums,int start,int end) {
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }

    public int removeElement(int[] nums, int val) {
        int start=0, end=0;
        while(end < nums.length) {
            if(nums[end] != val) {
                swap(nums,start,end);
                start++;
            } end++;
        }
        return start;
    }
}