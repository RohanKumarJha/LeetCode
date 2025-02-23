class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int answer = 1;
        int noOfZeroes = 0;
        for(int i : nums) {
            if(i != 0) answer*=i;
            else noOfZeroes += 1;
        }
        for(int i=0; i<len; i++) {
            if(noOfZeroes > 1) nums[i]=0;
            else if(noOfZeroes == 1) {
                if(nums[i] == 0) nums[i]=answer;
                else nums[i]=0;
            } else nums[i] = answer/nums[i];
        } return nums;
    }
}