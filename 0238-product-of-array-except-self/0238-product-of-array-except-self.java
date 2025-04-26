class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] arr = new int[nums.length];
        int noOfZeroes = 0;
        int prod = 1;
        for(int i : nums) {
            if(i == 0) {
                noOfZeroes += 1;
            } else {
                prod *= i;
            }
        }
        if(noOfZeroes >= 2) {
            for(int i=0; i<nums.length; i++) {
                arr[i] = 0;
            }
        } else if(noOfZeroes == 1) {
            for(int i=0; i<nums.length; i++) {
                if(nums[i] == 0) {
                    arr[i] = prod;
                } else {
                    arr[i] = 0;
                }
            }
        } else {
            for(int i=0; i<nums.length; i++) {
                arr[i] = prod/nums[i];
            }
        } return arr;
    }
}