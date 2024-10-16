class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        if(n==1) return nums[0];
        int s=0, e=n-1;
        while(s <= e) {
            int mid=s+(e-s)/2;
            if(s==e || (nums[mid]!=nums[mid-1] && nums[mid]!=nums[mid+1])) {
                return nums[mid];
            } else if(nums[mid]==nums[mid-1] && mid%2==0) {
                e=mid-2;
            } else if(nums[mid]==nums[mid-1] && mid%2!=0) {
                s=mid+1;
            } else if(nums[mid]==nums[mid+1] && mid%2!=0) {
                e=mid-1;
            } else {
                s=mid+2;
            }
        } return 0;
    }
}