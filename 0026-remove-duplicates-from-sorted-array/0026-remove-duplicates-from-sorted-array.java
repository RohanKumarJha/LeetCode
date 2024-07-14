class Solution {
    int count = 1;
    public int removeDuplicates(int[] nums) {
        for(int i=1; i<nums.length; i++) {
            if(nums[i] != nums[i-1]) {
                nums[count] = nums[i];
                count++;
            }
        } return count;
    }
}