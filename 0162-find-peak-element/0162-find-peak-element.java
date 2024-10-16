class Solution {
    public int findPeakElement(int[] nums) {
        int n = nums.length;
        if(n==1) return 0;
        int s=0, e=n-1;
        while(s<=e) {
            int mid=s+(e-s)/2;
            if(s==e) return s;
            if(s==mid) return (nums[s]>nums[e])?s:e;
            if(nums[mid-1]<nums[mid]&nums[mid]>nums[mid+1]) return mid;
            else if(nums[mid-1]<nums[mid]&nums[mid]<nums[mid+1]) {
                s=mid+1;
            } else {
                e=mid-1;
            }
        } return 0;
    }
}