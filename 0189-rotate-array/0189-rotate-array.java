class Solution {
    public void swap(int[] nums,int start,int end) {
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }

    public void reverse(int[] nums,int start,int end) {
        while(start <= end) {
            swap(nums,start,end);
            start++; end--;
        }
    }

    public void rotate(int[] nums, int k) {
        int start=0, end=nums.length-1;
        k = k%(end+1);
        reverse(nums,start,end);
        reverse(nums,start,k-1);
        reverse(nums,k,end);
    }
}