class Solution {
    public int search(int[] nums, int target) {
        int size = nums.length;
        int start=0, end=size-1;
        while(start <= end) {
            int mid = start+(end-start)/2;
            if(nums[mid] == target) {
                return mid;
            } else if(nums[start] <= nums[mid]) {
                if(nums[start]<=target && target<=nums[mid]) {
                    end = mid;
                } else {
                    start = mid+1;
                }
            } else {
                if(nums[mid]<=target && target<=nums[end]) {
                    start = mid;
                } else {
                    end = mid-1;
                }
            }
        } return -1;
    }
}