class Solution {
    private void swap(int[] nums,int left,int right) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }

    public void sortColors(int[] nums) {
        int size = nums.length;
        int start=0, mid=0, end=size-1;

        while(mid <= end) {
            if(nums[mid] == 0) {
                swap(nums,start,mid);
                start += 1;
                mid += 1;
            } else if(nums[mid] == 1) {
                mid += 1;
            } else {
                swap(nums,mid,end);
                end -= 1;
            }
        }
    }
}