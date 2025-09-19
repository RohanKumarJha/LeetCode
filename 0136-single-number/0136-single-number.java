class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
        int size = nums.length;
        for(int i=0; i<size; i++) {
            result ^= nums[i];
        } return result;
    }
}