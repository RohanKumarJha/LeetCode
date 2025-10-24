class Solution {
    public int majorityElement(int[] nums) {
        int count=1, value=nums[0];
        for(int i=1; i<nums.length; i++) {
            if(nums[i] == value) {
                count++;
            } else {
                if(count == 0) {
                    value = nums[i];
                    count = 1;
                } else {
                    count--;
                }
            }
        } return value;
    }
}