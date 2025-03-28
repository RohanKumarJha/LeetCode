class Solution {
    public void swap(int[] nums,int start,int end) {
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }

    public int removeElement(int[] nums, int val) {
        int start=0, end=nums.length-1;
        while(start <= end) {
            if(nums[end] == val) {
                end--;
            } else if(nums[start] != val) {
                start++;
            } else {
                swap(nums,start,end);
                start++; end--;
            }
        } return start;
    }
}