class Solution {
    private void swap(int[] nums,int start,int end) {
        int num = nums[start];
        nums[start] = nums[end];
        nums[end] = num;
    }

    private void reverse(int[] nums,int start,int end) {
        while(start < end) {
            swap(nums,start,end);
            start++;
            end--;
        }
    }

    public void rotate(int[] nums, int k) {
        int size = nums.length;
        k %= size;
        reverse(nums,0,size-1);
        reverse(nums,0,k-1);
        reverse(nums,k,size-1);
    }
}