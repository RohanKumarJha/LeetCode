class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0) return 0;
        if(nums.length == 1) return 1;

        int lastDigit = nums[0];
        int count = 1;
        int pointer = 1;
        for(int i=1; i<nums.length; i++) {
            if(nums[i]==lastDigit && count<2) {
                nums[pointer] = nums[i];
                pointer++;
                count++;
            } else if(nums[i]!=lastDigit) {
                nums[pointer] = nums[i];
                lastDigit = nums[i];
                pointer++;
                count = 1;
            }
        } return pointer;
    }
}