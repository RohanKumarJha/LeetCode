class Solution {
    public static int firstOccurence(int[] arr,int target,int s,int e) {
        int ans = -1;
        while(s<=e) {
            int mid = s+(e-s)/2;
            if(arr[mid] == target) {
                ans = mid;
                e = mid-1;
            } else if(arr[mid]<target) s=mid+1;
            else e=mid-1;
        } return ans;
    }
    public static int lastOccurence(int[] arr,int target,int s,int e) {
        int ans = -1;
        while(s<=e) {
            int mid = s+(e-s)/2;
            if(arr[mid] == target) {
                ans = mid;
                s = mid+1;
            } else if(arr[mid]<target) s=mid+1;
            else e=mid-1;
        } return ans;
    }
    public int[] searchRange(int[] nums, int target) {
        int s=0, e=nums.length-1;
        int elem1 = firstOccurence(nums,target,s,e);
        int elem2 = lastOccurence(nums,target,s,e);
        return new int[]{elem1,elem2};
    }
}