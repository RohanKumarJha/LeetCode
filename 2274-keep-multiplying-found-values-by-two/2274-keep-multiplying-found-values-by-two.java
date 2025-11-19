class Solution {
    public int findFinalValue(int[] nums, int original) {
        while(true) {
            boolean flag = true;
            for(int i=0; i<nums.length; i++) {
                if(nums[i] == original) {
                    original = original*2;
                    flag = false;
                    break;
                }
            }
            if(flag) return original;
        } 
    }
}