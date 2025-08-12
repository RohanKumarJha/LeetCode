class Solution {
    public int search(int[] nums, int target) {
        int start=0, end=nums.length-1;
        while(start <= end) {
            int mid = start+(end-start)/2;
            if(nums[mid] == target) {
                return mid;
            } 
            // Find the sorted side
            if(nums[start] <= nums[mid]) {
                if(nums[start]<=target && target<=nums[mid]) {
                    end = mid;
                } else {
                    start = mid+1;
                }
            } else {
                if(nums[mid]<=target && target<=nums[end]) {
                    start = mid+1;
                } else {
                    end = mid;
                }
            }
        } 
        return -1;
    }
}