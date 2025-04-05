class Solution {
    // Reverse the array
    public void reverse(int[] nums,int start,int end) {
        while(start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++; end--;
        }
    }

    // Swapping method
    public void swap(int[] nums,int start,int end) {
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }

    public void nextPermutation(int[] nums) {
        int len = nums.length;
        
        // Find the pivot
        int pivot = Integer.MIN_VALUE;
        for(int i=len-1; i>0; i--) {
            if(nums[i] > nums[i-1]) {
                pivot = i-1;
                break;
            }
        }

        // If array is sorted in decreasing order - reverse the array
        if(pivot == Integer.MIN_VALUE) {
            reverse(nums,0,len-1);
        } else {
            // Find the element which is just larger than pivot
            int start=pivot+1, end=len-1;
            while(nums[end] <= nums[pivot] ) {
                end--;
            }
            swap(nums,pivot,end);
            reverse(nums,pivot+1,len-1);
        }

    }
}