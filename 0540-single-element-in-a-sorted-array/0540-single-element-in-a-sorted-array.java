class Solution {
    public int singleNonDuplicate(int[] nums) {
        int size = nums.length;
        int result = 0;
        for(int i : nums) {
            result ^= i;
        } return result;
    }
}