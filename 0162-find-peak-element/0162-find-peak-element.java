class Solution {
    public int findPeakElement(int[] nums) {
        if(nums.length == 1) return 0;
        if(nums.length == 2) {
            return (nums[0] < nums[1]) ? 1:0;
        }
        int start=0, end=nums.length-1;
        while(start <= end) {
            int mid = start+(end-start)/2;
            if(mid != 0 && mid != nums.length-1) {
                if(nums[mid-1]<=nums[mid] && nums[mid]>=nums[mid+1]) {
                    return mid;
                } else if(nums[mid-1]<=nums[mid]) {
                    start = mid+1;
                } else {
                    end = mid-1;
                }
            } else {
                if(mid == 0) {
                    if(nums[mid] < nums[mid+1]) {
                        return 1;
                    } else {
                        return 0;
                    }
                } else {
                    if(nums[nums.length-2] < nums[nums.length-1]) {
                        return nums.length-1;
                    } else {
                        return nums.length-2;
                    }
                }
            }
        } return 0;
    }
}