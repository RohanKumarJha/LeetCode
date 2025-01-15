class Solution {
    void swap(int[] nums,int start,int end) {
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }
    void reverse(int[] nums,int start,int end) {
        while(start < end) {
            swap(nums,start,end);
            start++; end--;
        }
    }
    public void nextPermutation(int[] nums) {
        int idx1 = -1;
        int idx2 = -1;

        // Find the breaking point
        for(int i=nums.length-2; i>=0; i--) {
            if(nums[i] < nums[i+1]) {
                idx1 = i;
                break;
            }
        }

        if(idx1 == -1) { // Array is sorted in desc order
            reverse(nums,0,nums.length-1);
        } else {
            // Find the minimum element
            for(int i=nums.length-1; i>idx1; i--) {
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