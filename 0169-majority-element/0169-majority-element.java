class Solution {
    public int majorityElement(int[] nums) {
        int size = nums.length;
        int value = nums[0];
        int count = 1;
        for(int i=1; i<size; i++) {
            if(nums[i] == value) {
                count += 1;
            } else {
                if(count == 1) {
                    value = nums[i];
                } else {
                    count -= 1;
                }
            }
        }
        return value;
    }
}