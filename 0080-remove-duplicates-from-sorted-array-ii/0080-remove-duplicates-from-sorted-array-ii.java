class Solution {
    public int removeDuplicates(int[] nums) {
        int count = 1;
        int index = 1;
        for(int i=1; i<nums.length; i++) {
            if(nums[i] == nums[i-1] & count<2) {
                nums[index++] = nums[i];
                count++;
            } else if(nums[i] != nums[i-1]) {
                count=1;
                nums[index++] = nums[i];
            }
        } return index;
    }
}