class Solution {
    public void rotate(int[] nums,int start,int end) {
        while(start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++; end--;
        }
    }
    public void rotate(int[] nums, int k) {
        int len = nums.length;
        k %= len;
        int start=0, end=len-1;
        rotate(nums,start,end);
        rotate(nums,0,k-1);
        rotate(nums,k,len-1);
    }
}