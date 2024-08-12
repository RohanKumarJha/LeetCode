class Solution {
    public static int binarySearch(int[] arr, int target) {
        int s=0, e=arr.length-1;
        while(s <= e) {
            int mid = s+(e-s)/2;
            if(arr[mid] == target) return mid;
            else if(arr[mid] < target) s=mid+1;
            else e=mid-1;
        } return -1;
    }
    public int search(int[] nums, int target) {
        return binarySearch(nums, target);
    }
}