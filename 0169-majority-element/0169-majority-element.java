class Solution {
    public int majorityElement(int[] nums) {
        int count=1, result=nums[0];
        for(int i=1; i<nums.length; i++) {
            if(nums[i] == result) {
                count++;
            } else {
                if(count == 0) {
                    result = nums[i];
                    count = 1;
                } else {
                    count--;
                }
            }
        } return result;
    }
}