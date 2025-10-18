class Solution {
    public void moveZeroes(int[] nums) {
        int pointer = 0;
        for(int i : nums) {
            if(i != 0) {
                nums[pointer++] = i;
            }
        }
        for(int i=pointer; i<nums.length; i++) {
            nums[i] = 0;
        }
    }
}