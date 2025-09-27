class Solution {
    public int singleNonDuplicate(int[] nums) {
        int size = nums.length;
        int start=0, end=size-1;
        while(start <= end) {
            int mid = start+(end-start)/2;
            if(start == end) return nums[mid];
            if(nums[mid]!=nums[mid-1] && nums[mid]!=nums[mid+1]) return nums[mid];
            if(mid%2 == 0) {
                if(nums[mid] == nums[mid-1]){
                    end = mid-2;
                } else {
                    start = mid+2;
                }
            } else {
                if(nums[mid] == nums[mid-1]){
                    start = mid+1;
                } else {
                    end = mid-1;
                }
            }
        } return 0;
    }
}