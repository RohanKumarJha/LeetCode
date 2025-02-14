class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product=1, noOfZeroes=0;
        for(int i : nums) {
            if(i != 0) product *= i;
            else noOfZeroes++;
        }
        for(int i=0; i<nums.length; i++) {
            if(noOfZeroes == 0) {
                nums[i] = product/nums[i];
            } else if(noOfZeroes == 1) {
                if(nums[i] == 0) {
                    nums[i] = product;
                } else {
                    nums[i] = 0;
                }
            } else {
                nums[i] = 0;
            } 
        } return nums;
    }
}