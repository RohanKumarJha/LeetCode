class Solution {
    public int[] productExceptSelf(int[] nums) {
        int answer = 1;
        int noOfZeroes = 0;
        for(int i : nums) {
            if(i!=0) answer *= i;
            if(i==0) noOfZeroes++;
        }
        for(int i=0; i<nums.length; i++) {
            if(noOfZeroes > 1) {
                nums[i] = 0;
            } else if(noOfZeroes == 1) {
                if(nums[i]==0) nums[i]=answer;
                else nums[i]=0;
            } else {
                nums[i] = answer/nums[i];
            }
        } return nums;
    }
}