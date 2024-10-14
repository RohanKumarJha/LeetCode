class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] left = new int[n/2];
        int[] right = new int[n/2];
        int a=0, b=0;
        for(int i=0; i<n; i++) {
            if(nums[i]>0) {
                left[a++] = nums[i];
            } else {
                right[b++] = nums[i];
            }
        }
        for(int i=0; i<n/2; i++) {
            nums[2*i] = left[i];
            nums[2*i+1] = right[i];
        } return nums;
    }
}