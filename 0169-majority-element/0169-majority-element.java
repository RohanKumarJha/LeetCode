class Solution {
    public int majorityElement(int[] nums) {
        int size = nums.length;
        int count = 1;
        int result = nums[0];
        for(int i=1; i<size; i++) {
            if(nums[i] == result) {
                count++;
            } else {
                if(count == 1) result=nums[i];
                else count--;
            }
        } return result;
    }
}