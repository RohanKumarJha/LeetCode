class Solution {
    private void swap(int[] nums,int start,int end) {
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }

    private void reverse(int[] nums,int start,int end) {
        while(start < end) {
            swap(nums,start,end);
            start++; end--;
        }
    }

    public void nextPermutation(int[] nums) {
        int size = nums.length;
        int end = size-2;
        while(end >= 0) {
            if(nums[end] < nums[end+1]) {
                break;
            } else {
                end--;
            }
        }
        if(end == -1) {
            reverse(nums,0,size-1);
        } else {
            int just_greater_index_value = size-1;
            while(just_greater_index_value > end) {
                if(nums[just_greater_index_value] > nums[end]) {
                    swap(nums,just_greater_index_value,end);
                    reverse(nums,end+1,size-1);
                    break;
                } just_greater_index_value--;
            }
        }
    }
}