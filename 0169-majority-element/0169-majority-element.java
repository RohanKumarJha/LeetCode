class Solution {
    public int majorityElement(int[] nums) {
        int size = nums.length;
        Arrays.sort(nums);
        return nums[size/2];
    }
}