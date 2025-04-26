class Solution {
    public void moveZeroes(int[] nums) {
        int count = 0;
        for(int i : nums) {
            if(i != 0) {
                nums[count++] = i;
            }
        }
        for(int i=count; i<nums.length; i++) {
            nums[i] = 0;
        }
    }
}