class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int val = 0;
        for(int i=0; i<nums.length; i++) {
            if(nums[i]%2==0) {
                int temp = nums[i];
                nums[i] = nums[val];
                nums[val] = temp;
                val++;
            }
        } return nums;
    }
}