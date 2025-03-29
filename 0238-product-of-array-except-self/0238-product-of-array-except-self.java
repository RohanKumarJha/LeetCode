class Solution {
    public int[] productExceptSelf(int[] nums) {
        int COUNT = 0;
        int result = 1;
        for(int i : nums) {
            if(i == 0) COUNT++;
            else result*=i;
        }
        for(int i=0; i<nums.length; i++) {
            if(COUNT >= 2) {
                nums[i] = 0;
            } else if(COUNT == 1) {
                if(nums[i] == 0) {
                    nums[i] = result;
                } else {
                    nums[i] = 0;
                }
            } else {
                nums[i] = result/nums[i];
            }
        } return nums;      
    }
}