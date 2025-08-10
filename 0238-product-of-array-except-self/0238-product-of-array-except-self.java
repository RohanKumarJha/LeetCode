class Solution {
    public int[] productExceptSelf(int[] nums) {
        int noOfZeroes = 0;
        int product = 1;
        for(int i : nums) {
            if(i == 0) {
                noOfZeroes++;
            } else {
                product *= i;
            }
        }

        if(noOfZeroes == 0) {
            for(int i=0; i<nums.length; i++) {
                nums[i] = product/nums[i];
            }
        } else if(noOfZeroes == 1) {
            for(int i=0; i<nums.length; i++) {
                if(nums[i] == 0) {
                    nums[i] = product;
                } else {
                    nums[i] = 0;
                }
            }
        } else {
            for(int i=0; i<nums.length; i++) {
                nums[i] = 0;
            }
        }
        return nums;
    }
}