class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int[] arr = new int[2];
        // For first position
        int s=0, e=n-1, ans1=-1;
        while(s <= e) {
            int mid = s+(e-s)/2;
            if(nums[mid] == target) {
                ans1 = mid;
                e = mid-1;
            } else if(nums[mid] < target) {
                s = mid+1;
            } else {
                e = mid-1;
            }
        } arr[0] = ans1;

        // For last position
        s=0; e=n-1; 
        int ans2=-1;
        while(s <= e) {
            int mid = s+(e-s)/2;
            if(nums[mid] == target) {
                ans2 = mid;
                s = mid+1;
            } else if(nums[mid] < target) {
                s = mid+1;
            } else {
                e = mid-1;
            }
        } arr[1] = ans2;
        return arr;
    } 
}