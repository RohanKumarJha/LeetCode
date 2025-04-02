class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        if(len == 1) return nums[0];
        int start=0, end=len-1;
        while(start <= end) {
            int mid = end-(end-start)/2;
            if(start==end) return nums[start];
            if(nums[mid]!=nums[mid-1] & nums[mid]!=nums[mid+1]) return nums[mid];
            if(mid%2==0) {
                if(nums[mid-1]==nums[mid]) {
                    end=mid;
                } else {
                    start=mid;
                }
            } else {
                if(nums[mid-1]==nums[mid]) {
                    start=mid+1;
                } else {
                    end=mid-1;
                }
            }
        } return 0;
    }
}