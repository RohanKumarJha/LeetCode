class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int s=0, e=n-1;
        while(s<=e) {
            int mid = s+(e-s)/2;
            if(nums[mid]==mid && nums[mid]==nums[mid-1]) {
                return nums[mid];
            } else if(nums[mid] < mid) {
                e = mid-1;
            } else if(nums[mid]==mid) {
                e = mid-1;
            } else {
                s = mid+1;
            }
        } return 0;
    }
}