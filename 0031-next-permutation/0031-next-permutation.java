class Solution {
    public void swap(int[] nums,int start,int end) {
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }
    public void reverse(int[] nums,int start,int end) {
        while(start < end) {
            swap(nums,start,end);
            start++; end--;
        }
    }
    public void nextPermutation(int[] nums) {
        int len = nums.length;
        int idx1 = -1;
        int idx2 = -1;

        // Find breaking point
        for(int i=len-2; i>=0; i--) {
            if(nums[i] < nums[i+1]) {
                idx1 = i;
                break;
            }
        }

        // Array is sorted
        if(idx1 == -1) {
            reverse(nums,0,len-1);
        } else {
            // Find the minimum element
            for(int i=len-1; i>idx1; i--) {
                if(nums[i]>nums[idx1]) {
                    idx2 = i;
                    break;
                }
            }
            // swap idx1 to idx2
            if(idx2 != -1) swap(nums,idx1,idx2);
            reverse(nums,idx1+1,nums.length-1);
        }
    }
}