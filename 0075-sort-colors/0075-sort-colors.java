class Solution {
    public void sortColors(int[] nums) {
        int len = nums.length;
        int start=0, mid=0, end=len-1;
        while(mid <= end) {
            if(nums[mid] == 0) {
                int temp = nums[mid];
                nums[mid] = nums[start];
                nums[start] = temp;
                start++; mid++;
            } else if(nums[mid] == 1) {
                mid++;
            } else {
                int temp = nums[mid];
                nums[mid] = nums[end];
                nums[end] = temp;
                end--;
            }
        }
    }
}