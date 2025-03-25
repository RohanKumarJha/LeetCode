class Solution {
    public int majorityElement(int[] nums) {
        int count = 1;
        int value = nums[0];
        for(int i=1; i<nums.length; i++) {
            if(nums[i] == value) count++;
            else count--;

            if(count < 0) {
                count = 1;
                value = nums[i];
            } 
        } return value;
    }
}