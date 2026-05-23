class Solution {
    public int singleNumber(int[] nums) {
        int size = nums.length;
        Arrays.sort(nums);
        for(int i=1; i<size; i+=2) {
            if(nums[i] != nums[i-1]) return nums[i-1];
        }
        return nums[size-1];
    }
}