class Solution {
    private void swap(int[] nums,int start,int end) {
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }
    private void reverse(int[] nums,int start,int end) {
        while(start < end) {
            swap(nums,start,end);
            start++;
            end--;
        }
    }

    public void nextPermutation(int[] nums) {
        // Find smaller elm index
        int num = nums.length-2;
        while(num >= 0) {
            if(nums[num] < nums[num+1]) break;
            else num--;
        }
        if(num != -1) {
            // find just equal and smaller
            int idx = num+1;
            while(idx < nums.length) {
                if(nums[num] < nums[idx]) idx++;
                else break;
            }
            swap(nums,num,idx-1);
            reverse(nums,num+1,nums.length-1);
        } else {
            reverse(nums,0,nums.length-1);
        }
    }
}