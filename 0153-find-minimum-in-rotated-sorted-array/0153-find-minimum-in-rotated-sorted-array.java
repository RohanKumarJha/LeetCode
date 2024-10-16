class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        int s=0, e=n-1;
        while(s <= e) {
            int mid=s+(e-s)/2;
            if(nums[s]<=nums[mid] && nums[mid]<=nums[e]) return nums[s];
            else if(nums[s]<=nums[mid] && nums[mid]>nums[e]) s=mid+1;
            else e=mid;
        } return 0;
    }
}