class Solution {
    public int findPeakElement(int[] nums) {
        if(nums.length == 0) return 0;
        if(nums.length == 1) return 0;
        int start=0, end=nums.length-1;
        while(start <= end) {
            int mid = start+(end-start)/2;
            if(mid == 0) {
                return (nums[mid] < nums[mid+1]) ? mid+1 : mid;
            } else if(mid == nums.length-1) {
                return mid;
            } else if(nums[mid-1]<nums[mid] && nums[mid+1]<nums[mid]) {
                return mid;
            } else if(nums[mid] < nums[mid+1]) {
                start = mid+1;
            } else {
                end = mid-1;
            }
        } return start;
    }
}