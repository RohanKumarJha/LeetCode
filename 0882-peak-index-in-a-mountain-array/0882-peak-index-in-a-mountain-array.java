class Solution {
    public int peakIndexInMountainArray(int[] nums) {
        int size = nums.length;
        int start=0, end=size-1;
        if(size == 1) return nums[start];
        while(start <= end) {
            int mid = start+(end-start)/2;
            if(start == mid) {
                if(start == end) return start;
                else {
                    return (nums[start]<nums[end]) ? end : start;
                }
            } else if(nums[mid-1]<=nums[mid] && nums[mid]>nums[mid+1]) {
                return mid;
            } else if(nums[mid-1] > nums[mid]) {
                end = mid-1;
            } else {
                start = mid+1;
            }
        } return 0;
    }
}