class Solution {
    public int findMin(int[] nums) {
        int s=0, e=nums.length-1;
        while(s<=e) {
            int mid=s+(e-s)/2;
            if(nums[s]<=nums[mid]) {
                if(nums[mid]<=nums[e]) {
                    return nums[s];
                } else {
                    s = mid+1;
                }
            } else {
                if(nums[mid]<=nums[e]) {
                    e=mid;
                } else {
                    s = mid+1;
                }
            }
        } return nums[s];
    }
}