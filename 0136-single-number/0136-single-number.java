class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int size = nums.length;
        for(int i=1; i<size; i+=2) {
            if(nums[i] != nums[i-1]) {
                return nums[i-1];
            }
        } return nums[size-1];
    }
}