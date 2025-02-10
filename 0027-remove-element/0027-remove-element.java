class Solution {
    public int removeElement(int[] nums, int val) {
        int size = nums.length;
        int noOfOccurence = 0;
        int start=0, end=size-1;
        while(start <= end) {
            if(nums[end] == val) {
                noOfOccurence++;
                end--;
            } else if(nums[start] == val) {
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                noOfOccurence++;
                start++;
                end--;
            } else {
                start++;
            }
        } return size-noOfOccurence++;
    }
}