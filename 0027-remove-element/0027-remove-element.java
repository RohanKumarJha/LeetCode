class Solution {
    public void swap(int[] nums,int start, int end) {
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }

    public int removeElement(int[] nums, int val) {
        int pointer = 0;
        for(int i=0; i<nums.length; i++) {
            if(nums[i] != val) {
                swap(nums,pointer,i);
                pointer++;
            }
        } return pointer;
    }
}