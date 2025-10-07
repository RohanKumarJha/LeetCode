class Solution {
    public int binarySearch(int[] nums,int start,int end,int target) {
        if(start > end) return -1;
        int mid = start+(end-start)/2;
        if(nums[mid] == target) return mid;
        return (nums[mid] < target) ? binarySearch(nums,mid+1,end,target)
                                    : binarySearch(nums,start,mid-1,target);
    }

    public int search(int[] nums, int target) {
        return binarySearch(nums, 0, nums.length-1, target);
    }
}