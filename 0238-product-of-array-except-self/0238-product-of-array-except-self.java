class Solution {
    public int[] productExceptSelf(int[] nums) {
        int result=1, noOfZeroes=0;
        int size = nums.length;
        for(int i=0; i<size; i++) {
            if(nums[i]==0) {
                noOfZeroes++;
            } else {
                result *= nums[i];
            }
        }

        if(noOfZeroes > 1) {
            for(int i=0; i<size; i++) {
                nums[i] = 0;
            }
        } else if(noOfZeroes == 1) {
            for(int i=0; i<size; i++) {
                if(nums[i] != 0) {
                    nums[i] = 0;
                } else {
                    nums[i] = result;
                }
            }
        } else {
            for(int i=0; i<size; i++) {
                nums[i] = result/nums[i];
            }
        } return nums;
    }
}