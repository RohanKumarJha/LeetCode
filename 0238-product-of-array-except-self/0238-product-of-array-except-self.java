class Solution {
    public int[] productExceptSelf(int[] nums) {
        int noOfZeroes = 0;
        int ans = 1;
        for(int i : nums) {
            if(i==0) noOfZeroes++;
            else ans *= i;
        }
        if(noOfZeroes >= 2) {
            for(int i=0; i<nums.length; i++) {
                nums[i] = 0;
            }
        } else if(noOfZeroes == 1) {
            for(int i=0; i<nums.length; i++) {
                if(nums[i]==0) {
                    nums[i] = ans;
                } else {
                    nums[i] = 0;
                }
            }
        } else {
            for(int i=0; i<nums.length; i++) {
                nums[i] = ans/nums[i];
            }
        } return nums;
    }
}