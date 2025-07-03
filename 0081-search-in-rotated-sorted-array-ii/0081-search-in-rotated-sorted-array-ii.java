class Solution {
    public boolean search(int[] nums, int target) {
        int start=0, end=nums.length-1;
        while(start <= end) {
            if(nums[start]==nums[end] && nums[start]!=target) {
                start++; end--;
            } else if(nums[start]==nums[end] && nums[start]==target) {
                return true;
            }else {
                int mid = start+(end-start)/2;
                if(nums[mid] == target) return true;
                
                // Find the shortest side
                if(nums[start] <= nums[mid]) {
                    if(nums[start]<=target && target<=nums[mid]) {
                        end = mid;
                    } else {
                        start = mid+1;
                    }
                } else if(nums[mid] <= nums[end]) {
                    if(nums[mid]<=target && target<=nums[end]) {
                        start = mid;
                    } else {
                        end = mid-1;
                    }
                }
            }
        } return false;
    }
}