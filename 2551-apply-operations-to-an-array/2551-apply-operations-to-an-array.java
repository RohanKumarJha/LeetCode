class Solution {
    public int[] applyOperations(int[] nums) {

        // Apply the operation
        for(int i=0; i<nums.length-1; i++) {
            if(nums[i] == nums[i+1]) {
                nums[i] *= 2;
                nums[i+1] = 0;
            }
        }

        // Put all zeroes at the end
        int start=0, end=0;
        while(end < nums.length) {
            if(start==end && nums[start]!=0) {
                start++; end++;
            } else if(nums[end] != 0) {
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                start++;
                end++;
            } else if(nums[end] == 0) {
                end++;
            }
        } return nums;
    }
}