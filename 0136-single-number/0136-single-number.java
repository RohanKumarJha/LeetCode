class Solution {
    public int singleNumber(int[] nums) {
        int len = nums.length;
        for(int i=0; i<len; i++) {
            boolean flag = true;
            for(int j=0; j<len; j++) {
                if(nums[i]==nums[j] & i!=j) {
                    flag = false;
                    break;
                }
            } if(flag) return nums[i];
        } return 0;
    }
}