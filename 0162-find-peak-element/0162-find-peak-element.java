class Solution {
    public int findPeakElement(int[] nums) {
        int start=0, end=nums.length-1;
        while(start < end) {
            int mid = start+(end-start)/2;
            if(mid == 0) {
                if(nums[mid]>nums[mid+1]) return mid;
                else start=mid+1;
            } else if(mid == nums.length-1) {
                if(nums[mid-1]<nums[mid]) return mid;
                else end = mid-1;
            } else if(nums[mid-1]<nums[mid] && nums[mid]>nums[mid+1]) {
                return mid;
            } else if(nums[mid-1]<nums[mid]) {
                start = mid+1;
            } else {
                end = mid-1;
            }
        }  return start;
    }
}