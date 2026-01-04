class Solution {
    public int majorityElement(int[] nums) {
        int size = nums.length;
        int count = 1;
        int num = nums[0];
        for(int i=1; i<size; i++) {
            if(nums[i] == num) {
                count++;
            } else {
                count--;
                if(count == -1) {
                    num = nums[i];
                    count = 1;
                }
            }
        }
        return num;
    }
}