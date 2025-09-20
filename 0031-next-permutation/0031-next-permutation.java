class Solution {
    public void reverse(int[] nums,int start,int end) {
        while(start < end) {
            swap(nums,start,end);
            start++; end--;
        }
    }

    public void swap(int[] nums, int start, int end) {
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }

    public void nextPermutation(int[] nums) {
        boolean flag = false;
        int end = nums.length-1;

        // Find smallest element
        while(end > 0) {
            if(nums[end] > nums[end-1]) {
                end = end-1;
                flag = true;
                break;
            } end--;
        }
        if(!flag) {
            reverse(nums,0,nums.length-1);
        } else {

            // Find just greater number than end
            int pointer = nums.length-1;
            while(pointer > end) {
                if(nums[pointer] > nums[end]) break;
                pointer--;
            }
            swap(nums,end,pointer);
            reverse(nums,end+1,nums.length-1);
        }
    }
}