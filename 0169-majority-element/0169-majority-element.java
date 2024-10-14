class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int l=0, r=n-1;
        int mid = l+(r-l)/2;
        return nums[mid];
    } 
}