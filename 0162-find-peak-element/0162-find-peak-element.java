class Solution {
    public int findPeakElement(int[] nums) {
        int start=0, end=nums.length-1;
        while(start <= end) {
            if(start == end) return start;
            int mid = start+(end-start)/2;
            if(start==mid && nums[start]<nums[end]) return end;
            if(start==mid && nums[start]>nums[end]) return start;
            if(nums[mid-1]<nums[mid] && nums[mid]>nums[mid+1]) {
                return mid;
            } else if(nums[mid-1]<nums[mid]) {
                start = mid;
            } else {
                end = mid-1;
            }
        } return 0;
    }
}