class Solution {
    public int[] productExceptSelf(int[] nums) {
        long product = 1;
        int no_of_zeroes = 0;
        for(int i : nums) {
            if(i != 0) {
                product *= i;
            } else {
                no_of_zeroes++;
            }
        }

        if(no_of_zeroes > 1) {
            Arrays.fill(nums,0);
        } else if(no_of_zeroes == 1) {
            for(int i=0; i<nums.length; i++) {
                if(nums[i] != 0) {
                    nums[i] = 0;
                } else {
                    nums[i] = (int)product;
                }
            }
        } else {
            for(int i=0; i<nums.length; i++) {
                nums[i] = (int)product/nums[i];
            }
        } 

        return nums;
    }
}