class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0) return 0;
        if(nums.length == 1) return 1;

        int start=nums[1]; 
        int pointer = 1;
        for(int i=1; i<nums.length; i++) {
            if(nums[i] != nums[i-1]) {
                start = nums[i];
                nums[pointer] = nums[i];
                pointer++;
            }
        } return pointer;
    }
}