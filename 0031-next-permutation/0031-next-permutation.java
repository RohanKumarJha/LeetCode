class Solution {
    private void swap(int[] nums,int start,int end) {
        int num = nums[start];
        nums[start] = nums[end];
        nums[end] = num;
    }

    private void reverse(int[] nums,int start,int end) {
        while(start < end) {
            swap(nums,start,end);
            start++; end--;
        }
    }

    public void nextPermutation(int[] nums) {
        int pointer = nums.length-1;
        while(pointer > 0) {
            if(nums[pointer] <= nums[pointer-1]) {
                pointer--;
            } else break;
        }
        if(pointer == 0) {
            reverse(nums,0,nums.length-1);
        } else {
            int justgreater = pointer+1;
            while(justgreater<nums.length && nums[pointer-1]<nums[justgreater]) {
                justgreater++;
            }
            swap(nums,pointer-1,justgreater-1);
            reverse(nums,pointer,nums.length-1);
        }
    }
}